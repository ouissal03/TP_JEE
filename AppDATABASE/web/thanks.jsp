<%-- 
    Document   : thanks
    Created on : Feb 22, 2023, 9:49:03 PM
    Author     : 21263
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html> <head>
<meta charset="utf-8">
<title>Data Validation on the server</title>
<link rel="stylesheet" href="css/main.css" type="text/css"/> </head>
<body>
<h1>Thanks for joining our email list</h1>
<p>Here is the information that you entered:</p>
<label>Email:</label>
<span>${user.email}</span><br>
<label>First Name:</label>
<span>${user.firstName}</span><br>
<label>Last Name:</label>
<span>${user.lastName}</span><br>
<p>To enter another email address, click on the Back button in your browser or the 
Return button shown below.</p>
<form action="" method="post">
<input type="hidden" name="action" value="join">
<input type="submit" value="Return">
</form></body></html>

