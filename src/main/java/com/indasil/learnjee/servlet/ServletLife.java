package com.indasil.learnjee.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * Created by vashishta on 9/17/15.
 */
public class ServletLife extends GenericServlet {


    private String param;

    @Override
    public void init() {
       param =  getInitParameter("HELLO");

    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.getWriter().write(param);
    }

    @Override
    public void destroy() {

    }
}
