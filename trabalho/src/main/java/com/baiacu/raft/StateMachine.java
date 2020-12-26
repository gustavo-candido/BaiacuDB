package com.baiacu.raft;

import com.baiacu.raft.workes.Storer;
import com.proto.baiacu.Key;
import com.proto.baiacu.Value;
import org.apache.ratis.proto.RaftProtos;
import org.apache.ratis.protocol.Message;
import org.apache.ratis.statemachine.TransactionContext;
import org.apache.ratis.statemachine.impl.BaseStateMachine;

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
        final String[] opKey = request.getContent().toString(Charset.defaultCharset()).split(":");
        final String result = opKey[0]+ ":"+ key2values.get(opKey[1]);

        LOG.debug("{}: {} = {}", opKey[0], opKey[1], result);
        return CompletableFuture.completedFuture(Message.valueOf(result));
    }


    @Override
    public CompletableFuture<Message> applyTransaction(TransactionContext trx) {
        final RaftProtos.LogEntryProto entry = trx.getLogEntry();
        final String whole = entry.getStateMachineLogEntry().getLogData().toString(Charset.defaultCharset());

        // pegar da whole string apenas quem está entre [REQUEST] [/REQUEST]
        Pattern p = Pattern.compile("\\[REQUEST\\](.*?)\\[\\/REQUEST\\]", Pattern.DOTALL);
        Matcher m = p.matcher(whole);
        m.find();

        final String[] opKeyValue = m.group(1).split(",");

        if(opKeyValue[0].equals("add")){
            (new Storer()).run(key2values, opKeyValue);

        } else if (opKeyValue[0].equals("replace")){

        }
        else if (opKeyValue[0].equals("delete")) {

        }

        final CompletableFuture<Message> f = CompletableFuture.completedFuture(Message.valueOf("respsta " + whole));

        final RaftProtos.RaftPeerRole role = trx.getServerRole();
        LOG.info("{}:{} {} {}={},{},{}", role, getId(), opKeyValue[0], opKeyValue[1], opKeyValue[2],opKeyValue[3]
                                        , opKeyValue[4]
        );

        if (LOG.isTraceEnabled()) {
            LOG.trace("{}: key/values={}", getId(), key2values);
        }
        return f;
    }
}