<%-- 
    Document   : Scriptlets
    Created on : Feb 23, 2023, 4:04:23 PM
    Author     : 21263
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Scriptlet JSP</title>
</head>
<% 
String bgColor = request.getParameter("bgColor");
if ((bgColor == null) || (bgColor.trim().equals(""))) { 
bgColor = "white"; 
} 
%>
<body bgcolor="<%= bgColor %>">
<h2 align="center">Test de la couleur de fond "<%= bgColor %>".</h2> <br />
<form>
Couleur: <input type="text" name="bgColor">
<input type="submit" value="Essayer cette couleur">
</form>
</body>
</html>
