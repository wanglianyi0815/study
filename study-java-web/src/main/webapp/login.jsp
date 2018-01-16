<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	session 是基于cookie的
	当客户端关闭cookie时，使用session cookie(会话cookie，存在浏览器的进程中)
	可以在IE工具高级里禁用cookie来尝试
	-->

  </head>
  
  <body>
  	<h1><%=session.getId() %></h1>
  	<h3><%=session.isNew() %></h1>
    <form action="check.jsp">
      username:<input type="text" name="username" ><br>
      password:<input type="password" name="password" ><br>
      <input type="submit" name="submit" value="submit">&nbsp;<input type="reset" name="reset" value="reset">
    </form>
  </body>
</html>
