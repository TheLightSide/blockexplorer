package org.asofe.blockexplorer.utils;

import com.googlecode.jsonrpc4j.JsonRpcHttpClient;
import org.asofe.blockexplorer.entity.Block;
import org.asofe.blockexplorer.entity.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URL;

@Service("RpcDaemonService")
public class RpcDaemon {

    @Autowired
    private Environment env;

    public <T> Object execute(String methodName, Object[] arguments, Class<T> tClass) throws Throwable {
        JsonRpcHttpClient client = new JsonRpcHttpClient(new URL( env.getProperty("daemon.url") + ":" + env.getProperty("daemon.port")));
        Authenticator.setDefault(new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication (env.getProperty("daemon.rpcuser"), env.getProperty("daemon.rpcpassword").toCharArray());
            }
        });

        return client.invoke(methodName, arguments, tClass);
    }

}
