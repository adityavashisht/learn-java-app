package com.indasil.learnjee.servlet.controller;


import com.indasil.learnjee.servlet.model.Address;
import com.indasil.learnjee.servlet.model.Person;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * Created by vashishta on 9/17/15.
 */
public class HelloWorldServlet extends HttpServlet {

    /**
     * GET
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */

    protected void doGet(HttpServletRequest req,
                         HttpServletResponse resp) throws ServletException, IOException {


        Person p = new Person();
        p.setName("Tofique");
        p.setAge(22);

        Address address = new Address();
        address.setStreet("Lee Road");

        p.setAddress(address);

        req.setAttribute("hello", p);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/first.jsp");

        dispatcher.forward(req, resp);



    }

    /**
     * POST
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void doPost(HttpServletRequest req,
                         HttpServletResponse resp) throws ServletException, IOException {


        Person p = new Person();
        p.setName("Tofique");

        req.setAttribute("hello", p);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/first.jsp");

        dispatcher.forward(req, resp);



    }
}
