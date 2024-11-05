<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ page import ="dao.Adherent" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
 <% Adherent c = (Adherent)session.getAttribute("adherent");%>
 
 <tr><td>Nom : </td> <td><%=c.getNom()%></td></tr>
 <tr><td>Prenom : </td> <td><%=c.getPrenom()%></td></tr>
 <tr><td>Adresse : </td><td><%=c.getAdresse() %></td></tr>
 <tr><td>Email : </td> <td><%=c.getEmail()%></td></tr>
 <tr><td>Tel : </td><td><%=c.getTel()%></td></tr>
 <tr><td>Genre : </td><td><%=c.getGenre()%></td></tr>
 <tr><td>Sports sélectionnés : </td>
 <td><ol>
 <% String[] sports = (String[])session.getAttribute("sports");
 for(int i=0; i<sports.length;i++){ %>
 <li> <%=sports[i]%></li>
 <% }%>
 </ol>

 
 </td></tr>
 </table>
 <hr>
 <Form method="post" action="Enregistrer">
 <input type="submit" value="Confirmer" />&nbsp;&nbsp;
 <input type="reset" value="Annuler" />
 </form>
 <br/>
</body>
</html>