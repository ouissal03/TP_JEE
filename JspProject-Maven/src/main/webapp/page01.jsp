<%-- 
    Document   : page01
    Created on : Feb 23, 2023, 3:23:37 PM
    Author     : 21263
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Traitement des paramètres d'un formulaire</title>
</head>
<body>
<h3>Sélectionner un auteur:</h3>
<form method="get">
<input type="checkbox" name="auteur" value="Cay Horstman">Horstmann <br />
<input type="checkbox" name="auteur" value="David Flanagan">Flanagan<br />
<input type="checkbox" name="auteur" value="Bertrand Meyer">Meyer <br />
<input type="submit" value="Query">
</form>
<%
String[] authors = request.getParameterValues("auteur");
if (authors != null) {
%>
<h3>Vous avez sélectionné les auteurs suivants:</h3>
<ul>
<% for (int i = 0; i < authors.length; ++i) { %>
<li><%= authors[i] %></li>
<% } %>
</ul>
<a href="<%= request.getRequestURI() %>">Retour</a>
<% } %>
</body>
</html>
