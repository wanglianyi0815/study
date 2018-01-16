package com.test.examination.normal18.httpservlet;

//两个客户IE地址：http://localhost:8080/MyProject/servlet/ServletTest2?username=zhangsan
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 1、关于servlet的多线程
 * servlet是单实例多线程的
 * 
 * 2、getParameter()与getAttribute()方法的区别？
 * getparmarter描述的是服务器与客户端的关系,用之时没有对应的setParmarter
 * getAttribute,在服务器中进行对象保存后的取出的一个操作，用之时必现有setAttribute
 * 
 */
public class ServletTest2 extends HttpServlet {
    
    /**
     * @Fields serialVersionUID : Description
     */
    
    private static final long serialVersionUID = 1L;
    //成员变量
    String name;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //如果放开此段代码，则成为局部变量，两个线程互不影响
        //String name;
        
        name=request.getParameter("username");
        
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println(name);
        
        PrintWriter out=response.getWriter();
        
        out.print("<html><head><title>test</title></head>");
        out.print("<body><h1>"+name+"</h1></body></html>");
        
    }
    
}
