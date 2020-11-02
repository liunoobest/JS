package com.junjie.servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author Rover
 * @Description
 * @create 2020/11/2
 */
public class HelloServlet implements Servlet {
    public HelloServlet() {
        System.out.println("1.HelloServlet构造器被调用");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("2.init初始化方法被调用");

        /*ServletConfig类的作用
        *
        * 1.可以获取Servlet程序的别名servlet-name的值
        * 2.可以获取初始化参数init-param
        * 3.可以获取ServletContext对象
        * */
        System.out.println("HelloServlet程序的别名是"+servletConfig.getServletName());
        System.out.println("初始化参数username的值是"+servletConfig.getInitParameter("username"));
        System.out.println("初始化参数url的值是"+servletConfig.getInitParameter("url"));
        System.out.println(servletConfig.getServletContext());
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


            HttpServletRequest hw=(HttpServletRequest)servletRequest;
            String method = hw.getMethod();
            if(method.equals("GET")){
                doGet();
        }else{
                doPost();
        }


    }
    //表单提交方式是GET的功能方法
    public void doGet(){System.out.println("表单提交方式是GET");}

    //表单提交方式是POST的功能方法
    public void doPost(){ System.out.println("表单提交方式POST");}

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("4.destory销毁方法");
    }
}
