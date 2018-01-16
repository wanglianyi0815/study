package com.test.examination.normal18.httpservlet;
//在客户端输入http://localhost:8080/MyProject/servlet/LifeServlet
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 关于Servlet的生命周期
 * 1、初始化阶段（init方法被调用），客户端第一次访问该servlet，那么该servlet将被实例化，紧接着，init方法被调用，
 *    该init方法在servlet的整个生命周期中仅执行一次
 * 2、服务阶段（service方法被调用），客户端每发来一次请求，该service方法都要被调用一次。
 * 3、销毁阶段（destory方法被调用），tomcat是每个servlet的destory都被调用一次
 * 关于初始化阶段：service有几种初始化的方式
 * 答：两种
 *    1、客户端每发来一次请求，该service方法都要被调用一次
 *    2、可以通过在web.xml文件中，配置servlet的启动参数，让服务器启动后，该servlet自动完成实例化
 *       <servlet>
           <servlet-name>ServletTest1</servlet-name>
           <servlet-class>com.test.examination.normal18.httpservlet.ServletTest1</servlet-class>
           <load-on-startup>1</load-on-startup>
         </servlet>
 *
 *
 */
public class LifeServlet extends HttpServlet {
    
    /**
     * @Fields serialVersionUID : Description
     */
    
    private static final long serialVersionUID = 1L;

    @Override
    protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
        System.out.println("service invoked");
    }

    @Override
    public void destroy() {
        System.out.println("destroy invoked");
    }

    @Override
    public void init() throws ServletException {
        System.out.println(" init invoked");
    }

    

}
