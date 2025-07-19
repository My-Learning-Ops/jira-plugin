package com.brendandileo.plugins.jira.servlet.MyServlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import com.atlassian.templaterenderer.TemplateRenderer;

/**
 * A custom servlet for handling GET and POST requests in the Jira plugin
 */
public class MyServlet extends HttpServlet{

    private static final Logger log = LoggerFactory.getLogger(MyServlet.class);
    private final TemplateRenderer templateRenderer;

    @Inject
    public MyServlet(TemplateRenderer templateRenderer) {
        this.templateRenderer = templateRenderer;
    }

    // Handles GET requests to the servlet
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        if (name == null || name.isEmpty()) 
            name = "World";

        log.info("Received GET request with name: {}", name);

        resp.setContentType("text/html");
        resp.getWriter().write("<html><body>Hello " + name + "</body></html>");
    }

    // Handles POST requests to the servlet
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.info("Received POST request");
        resp.setContentType("text/html");
        resp.getWriter().write("<html><body>POST request received</body></html>");
    }

}