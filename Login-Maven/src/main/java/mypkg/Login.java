/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypkg;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Login extends HttpServlet {
private static final long serialVersionUID = 1L;
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse
response) throws ServletException, IOException {
response.setContentType("text/html"); 
PrintWriter out = response.getWriter(); 
String n=request.getParameter("userName"); 
String p=request.getParameter("userPass"); 
if(p.equals("servlet")){ 
RequestDispatcher rd=request.getRequestDispatcher("servlet2"); 
rd.forward(request, response); 
} 
else{ 
out.print("Sorry UserName or Password Error!"); 
RequestDispatcher rd=request.getRequestDispatcher("/index.html"); 
rd.include(request, response); 
} }}
