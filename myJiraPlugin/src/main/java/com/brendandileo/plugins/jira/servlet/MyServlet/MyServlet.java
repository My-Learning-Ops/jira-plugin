package com.brendandileo.plugins.jira.servlet.MyServlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet extends HttpServlet{
    private static final Logger log = LoggerFactory.getLogger(MyServlet.class);

    // Handles GET requests to the servlet
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.getWriter().write("<html><body>Hello World</body></html>");
    }

    // Handles POST requests to the servlet
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.info("Received POST request");
        resp.setContentType("text/html");
        resp.getWriter().write("<html><body>POST request received</body></html>");
    }

}