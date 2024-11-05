<%-- 
    Document   : emailList
    Created on : Mar 2, 2023, 4:45:42 PM
    Author     : 21263
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Email jsp</title>
    </head>
    <body>
        <p>First name : ${param.firstName}<br/>
Email address 1 : ${paramValues.email[0]}<br/>
Email address 2 : ${paramValues.email[1]}
</p>
<p>MIME type : ${header.accept}<br/>
<!–- le header "accept-encoding contient deux mots, il faut donc 
le mettre entre accolade -->
Compression types : ${header["accept-encoding"]}
</p>
<p>The email cookie : ${cookie.emailCookie.value}
    <p>The context init param : ${initParam.custEmail}</p> 
<p>HTTP request method : ${pageContext.request.method}<br/>
HTTP response type : ${pageContext.response.contentType}<br/>
HTTP session ID : ${pageContext.session.id}<br/>
HTTP contextPath : ${pageContext.servletContext.contextPath}
</p>
    </body>
</html>
