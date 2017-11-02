package com.sivitsky;

import com.sivitsky.HelloHandler;
import org.eclipse.jetty.server.Server;

/**
 * Created by Ruslan on 30.10.2017.
 */
public class SimpleServer {
    public static void main(String[] args) throws Exception
    {
        Server server = new Server(8080);
        server.setHandler(new HelloHandler());
        server.start();
        server.join();
    }
}
