<%-- 
    Document   : Directive_include
    Created on : Feb 23, 2023, 5:07:34 PM
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
<h1>Une quelconque pad</h1>
<p>Informations sur nos produits et services.</p>
<p>Blah, blah, blah.</p>
<p>hadda, hadda, hadda.</p>
<%@ include file="/WEB-INF/includes/ContactSection.jsp" %>
</body>
</html>
