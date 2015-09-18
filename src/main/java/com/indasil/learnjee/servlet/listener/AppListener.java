package com.indasil.learnjee.servlet.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by vashishta on 9/18/15.
 */
public class AppListener implements ServletContextListener {


    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("Ready to work....deployed!");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
