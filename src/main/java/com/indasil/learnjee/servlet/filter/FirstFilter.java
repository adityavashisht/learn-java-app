package com.indasil.learnjee.servlet.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by vashishta on 9/18/15.
 */
public class FirstFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter was called");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
