/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypkg;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloWorld", urlPatterns = {"/MySearcher"})
public class MySearcher extends HttpServlet {
private static final long serialVersionUID = 1L;

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
protected void doGet(HttpServletRequest request, HttpServletResponse
response) throws ServletException, IOException {
// TODO Auto-generated method stub
String name=request.getParameter("name"); 
response.sendRedirect("https://www.google.co.in/search?q="+name); 
}
}
