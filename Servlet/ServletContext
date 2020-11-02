package com.junjie.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Rover
 * @Description
 * @create 2020/11/2
 */
public class ContextServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*ServletContext类的作用*/
        //1.获web.xml中配置的上下文参数context-param
            /*首先要获取ServletContext类的对象*/
        ServletContext context = getServletConfig().getServletContext();
        String username = context.getInitParameter("username");
        System.out.println(username);

        System.out.println(context.getInitParameter("password"));

        //2.获取当前的工程路径,格式:/工程路径
        System.out.println("当前工程路径"+context.getContextPath());

        //3.获取工程部署后在服务器硬盘上的绝对路径
        /*
        *
        *   '/'斜杠会被服务器解析成地址为：http://ip:port/工程名/
        *       此时getRealPath会映射到硬盘上的绝对路径当中
        * */
        System.out.println("工程部署的路径是:"+context.getRealPath("/"));

    }
}
