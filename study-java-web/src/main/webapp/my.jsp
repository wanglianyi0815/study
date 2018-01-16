<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>请问第二次访问该界面是什么结果</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!-- 
	   D:\Tomcat6.0\work\Catalina\localhost\MyProject\org\apache\jsp
	   jsp对应的java文件路径
	 -->
  </head>
  
  <!-- jsp也是单实例的 -->
  
  <body>
    <%! int a=0; %>
    <%! 
    //看tomcat源码变化
    public int add{
        return a+b;
    }%>
    <% int b=0;
       a++;
       b++;
    %>
    a:<%=a %><br>
    b:<%=b %>
  </body>
</html>
