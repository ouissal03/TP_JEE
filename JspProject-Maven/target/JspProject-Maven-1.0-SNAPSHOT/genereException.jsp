<%-- 
    Document   : genereException
    Created on : Feb 23, 2023, 4:30:33 PM
    Author     : 21263
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="JSP-Styles.css" type="text/css">
<title>Attributs errorPage et isErrorPage</title> </head>
<body>
<%@ page errorPage="/WEB-INF/traiteException.jsp" %>
<table border=5 align="center">
<tr><th class="title"> Génération d'une exception</th></tr></table>
<%! 
private int toInteger(String value) {
return(Integer.parseInt(value)); //Peut générer une exception 
} %>
<% int numerateur = toInteger(request.getParameter("num")); 
int denominateur = toInteger(request.getParameter("denom"));
int quotient = numerateur/denominateur; //peut générer une exception
%>
<ul>
<li>Numérateur: <%= numerateur %>.</li>
<li>Dénominateur: <%= denominateur %>.</li>
<li>Quotient: <%= quotient %>.</li> </ul>
</body></html>

