package com.junjie.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author Rover
 * @Description
 * @create 2020/11/2
 */
public class ServletLifeCycle implements Servlet {
    public HelloServlet() {
        System.out.println("1.HelloServlet构造器被调用");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("2.init初始化方法被调用");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * @Description service方法是专门用来处理请求和响应的
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("3.Hello Servlet 被访问了");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("4.destory销毁方法");
    }
}
