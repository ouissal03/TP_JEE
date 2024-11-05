<%-- 
    Document   : JspExpression
    Created on : Feb 23, 2023, 3:40:13 PM
    Author     : 21263
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Scripting Elts</title>
</head>
<body>
<H2>JSP Expressions</H2>
<UL>
<LI>Current time: <%= new java.util.Date() %></li>
<LI>Server: <%= application.getServerInfo() %></li>
<LI>Session ID: <%= session.getId() %></li>
<LI>The <CODE>testParam</CODE> form parameter:
<%= request.getParameter("testParam") %></li>
</UL>
</body>
</html>
