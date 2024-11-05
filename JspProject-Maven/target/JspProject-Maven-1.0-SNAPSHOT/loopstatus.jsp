<%-- 
    Document   : loopstatus
    Created on : Mar 2, 2023, 5:22:24 PM
    Author     : 21263
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
<% 
String[] names = {"Moha", "Toto", "Manolo", "Tiji"};
request.setAttribute("names", names);
%>
<h2>Names:
<c:forEach var="name" items="${names}" varStatus="status">
${name}<c:if test="${!status.last}">,</c:if>
</c:forEach>
</h2>
</body>
</html>
