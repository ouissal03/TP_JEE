<%-- 
    Document   : PrincipaleJsp
    Created on : Feb 23, 2023, 4:48:07 PM
    Author     : 21263
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
  <h1>What's New at JspNews.com</h1>
<p>
Here is a summary of our three most recent news stories:
<ol>
<li><jsp:include page="/WEB-INF/includes/Item1.jsp"/></li>
<li><jsp:include page="/WEB-INF/includes/Item2.jsp"/></li>
<li><jsp:include page="/WEB-INF/includes/Item3.jsp"/></li>
</ol>
</body>
</html>

