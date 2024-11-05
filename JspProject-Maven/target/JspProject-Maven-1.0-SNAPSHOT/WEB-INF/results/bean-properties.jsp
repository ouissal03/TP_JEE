<%-- 
    Document   : bean-properties
    Created on : Mar 2, 2023, 4:32:36 PM
    Author     : 21263
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<HTML>
<HEAD><TITLE>Accessing Bean Properties</TITLE>
<LINK REL=STYLESHEET HREF="./css/JSP-Styles.css" TYPE="text/css">
</HEAD>
<BODY>
<TABLE BORDER=5 ALIGN="CENTER">
<TR><TH CLASS="TITLE">
Accessing Bean Properties
</TABLE>
<P>
<UL>
<LI><B>First Name:</B> ${employee.name.firstName} </LI>
<LI><B>Last Name:</B> ${employee.name.lastName} <LI>
<LI><B>Company Name:</B> ${employee.company.companyName} </LI>
<LI><B>Company Business:</B> ${employee.company.business} </LI>
</UL>
</BODY></HTML>
