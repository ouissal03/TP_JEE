<%-- 
    Document   : traiteException
    Created on : Feb 23, 2023, 4:31:11 PM
    Author     : 21263
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="JSP-Styles.css" type="text/css">
<title>Traitemen des exceptions</title>
</head>
<body>
<%@ page isErrorPage="true" %>
<table border=5 align="center">
<tr><th class="title"> Traitement des exceptions</th></tr></table>
<p>
traiteException.jsp a attrapée l'exception suivante :<I><%= exception %></I>. 
Ce problème s'est produit dans : 
<pre>
<%@ page import="java.io.*" %>
<% exception.printStackTrace(new PrintWriter(out)); %>
</pre>
</p>
</body>
</html>
