<%@ page import="java.util.List" %>
<%@ page import="pkg.SQLUtil" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>E-Librairie</title>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
<h1>
    E-Librairie
</h1>
<form action="SQLUtil" method="POST">
<p>Faites votres selection</p>

<label for="auteur">Selection un auteur: </label>

<select name="auteur" id="auteur">
    <option value="select">Select</option>
    <%
        List<String> auteurs = SQLUtil.getAuteurs();
        for (String auteur : auteurs) {

    %>
    <option value="<%=auteur%>"><%=auteur%></option>
    <%
        }
    %>
</select>
<p>OU</p><br>
<p>Donner un nom approximatif d'auteur:</p>
<p>ou un titre approximatif</p>

    <input type="text" name="tosearch" id="tosearch"><br>
    <input type="submit" value="Rechercher">
    <input type="reset" value="Effacer">
</form>



</body>
</html>