package com.baiacu.raft;

import com.baiacu.raft.workes.Deleter;
import com.baiacu.raft.workes.Shower;
import com.baiacu.raft.workes.Storer;
import com.baiacu.raft.workes.TestSet;
import com.proto.baiacu.Key;
import com.proto.baiacu.Value;
import java.util.Arrays;
import org.apache.ratis.proto.RaftProtos;
import org.apache.ratis.protocol.Message;
import org.apache.ratis.statemachine.TransactionContext;
import org.apache.ratis.statemachine.impl.BaseStateMachine;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StateMachine extends BaseStateMachine
{
    private final Map<Key, Value> key2values = new ConcurrentHashMap<>();

    @Override
    public CompletableFuture<Message> query(Message request) {
        final String whole = request.getContent().toString(Charset.defaultCharset());
        String[] opKeyValue = getValues(whole);

        String response = (new Shower()).run(key2values,opKeyValue);

        final CompletableFuture<Message> f = CompletableFuture.completedFuture(Message.valueOf(response));

        LOG.debug("RESPOSTA:" + response);
        return f;
    }


    @Override
    public CompletableFuture<Message> applyTransaction(TransactionContext trx) {
        final RaftProtos.LogEntryProto entry = trx.getLogEntry();
        final String whole = entry.getStateMachineLogEntry().getLogData().toString(Charset.defaultCharset());
        String[] opKeyValue = getValues(whole);

        String response = "";
        if(opKeyValue[0].equals("add")){
            response = (new Storer()).run(key2values, opKeyValue);
        } else if (opKeyValue[0].equals("deleteByVersion")){
            response = (new Deleter()).runByVersion(key2values, opKeyValue);
        }
        else if (opKeyValue[0].equals("delete")) {
            response = (new Deleter()).run(key2values, opKeyValue);
        }
        else if (opKeyValue[0].equals("testAdd")) {
            response = (new TestSet()).run(key2values, opKeyValue);
        }

        final CompletableFuture<Message> f = CompletableFuture.completedFuture(Message.valueOf(response));
        LOG.debug("RESPOSTA:" + response);


        if (LOG.isTraceEnabled()) {
            LOG.trace("{}: key/values={}", getId(), key2values);
        }
        return f;
    }


    private String[] getValues(String whole){
        // pegar da whole string apenas quem está entre [REQUEST] [/REQUEST]
        Pattern p = Pattern.compile("\\[REQUEST\\](.*?)\\[\\/REQUEST\\]", Pattern.DOTALL);
        Matcher m = p.matcher(whole);
        m.find();

        final String[] opKeyValue = m.group(1).split(",");
        return opKeyValue;
    }

}