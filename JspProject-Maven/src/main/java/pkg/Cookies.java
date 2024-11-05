/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package pkg;

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author 21263
 */
@WebServlet(name = "Cookie", urlPatterns = {"/cookies"})
public class Cookies extends HttpServlet {

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cookie c = new Cookie("emailCookie", "mouh@gmail.com");
        c.setMaxAge(60*60);
        c.setPath("/"); //permet à toute l'application d'y accéder
        response.addCookie(c);
RequestDispatcher dispatcher = request.getRequestDispatcher("cookies.jsp");
dispatcher.forward(request, response);
       
    }

    

}
