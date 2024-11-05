<%-- 
    Document   : ContactSection
    Created on : Feb 23, 2023, 5:09:18 PM
    Author     : 21263
--%>

<%@page import="java.util.Date" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
<%-- Les champs spécifiés dans la déclaration jsp ci-dessous deviendront des 
attributs de la servlet qui résultera de la page jsp qui inclut ce fichier. --%>
<%!
private int accessCount = 0;
private Date accessDate = new Date();
private String accessHost = "<I>No previous access</I>";
%>
<p>
<hr>
<% accessHost = request.getRemoteHost(); %>
<% accessDate = new Date(); %>
Cette page &copy; 2014
<A HREF="http//www.my-company.com/">my-company.com</A>.
Cette page a été consultée <%= ++accessCount %> fois depuis que le démarrage 
du serveur. Elle a été consulté récemment par
<%= accessHost %> at <%= accessDate %>.
    </body>
</html>
