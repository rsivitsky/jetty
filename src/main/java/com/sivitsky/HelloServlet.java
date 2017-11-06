package com.sivitsky;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Calendar;

/**
 * Created by Ruslan on 06.11.2017.
 */
public class HelloServlet extends HttpServlet
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().println("<h1>Hello SimpleServlet");
        response.getWriter().println("session="+request.getSession(true).getId());
        response.getWriter().println("time now is="+ Calendar.getInstance().getTime());
        response.setIntHeader("Refresh",30);
    }
}