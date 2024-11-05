<%-- 
    Document   : Declarations
    Created on : Feb 23, 2023, 4:11:47 PM
    Author     : 21263
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; 
charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
<h1>JSP Declarations</h1>
<%! private int accessCount = 0; %>
<h2>Accesses to page since server reboot: 
<%= ++accessCount %></h2>
</body>
</html>
