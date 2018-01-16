package com.test.examination.normal18.httpservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 1、关于HttpServlet中的service，doGet,doPost方法的关系
 * 答：首先客户端提交一个请求，该请求一定是首先到达了service方法，然后service方法根据请求中的的参数内容是get，还是post或
 *    者其他方式来决定到底是调用doGet，还是doPost，还是其他的do方法
 * 2、请问forward与redirect的区别
 * 答：请求转发始终是一个请求，请求重定向执行后，会立刻给客户端响应，客户端会根据该响应，再给服务器发送一个请求，所以请求重
 *     定向是两个请求，且两个请求没有关联关系
 */
public class ServletTest1 extends HttpServlet {


    /**
     * @Fields serialVersionUID : Description
     */
    private static final long serialVersionUID = 1L;

    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doGet invoked");
        process(request,response);
    }

    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doPost invoked");
        process(request,response);
    }
    
    public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        
        request.setAttribute("username", username);
        request.setAttribute("password", password);
        
        request.getRequestDispatcher("/output.jsp").forward(request, response);
        
        //response.sendRedirect("output.jsp");
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //如果去掉此行代码并放开下两行代码，将不会调用doGet和doPost
        super.service(request, response);
        /*System.out.println("service invoked");
        process(request,response);*/
    }

}
