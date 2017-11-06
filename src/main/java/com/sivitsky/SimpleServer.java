package com.sivitsky;

import com.sivitsky.HelloHandler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Calendar;

/**
 * Created by Ruslan on 30.10.2017.
 */
public class SimpleServer {
    public static void main(String[] args) throws Exception
    {
        Server server = new Server(8080);
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/hello");
        server.setHandler(context);
        context.addServlet(new ServletHolder(new HelloServlet()), "/*");

        //server.setHandler(new HelloHandler());
        server.start();
        server.join();
    }
}

