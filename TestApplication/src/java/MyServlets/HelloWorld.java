/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package MyServlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import static java.lang.System.out;

/**
 *
 * @author 21263
 */
@WebServlet(name = "HelloWorld", urlPatterns = {"/hello"})
public class HelloWorld extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HelloWorld</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HelloWorld at " + request.getContextPath() + "</h1>");
            out.println("<h2>Hello World!!</h2>");
            out.println("<p>Servlet whose URL is defined by the annotation:<br/>"+
                    "@WebServlet(name=\"HelloWorld\",urlPatterns={\"/hello\"}<br/>"+
                         "Placed right at the beginning of the class");
            out.println("</body>");
            out.println("</html>");
        }finally{
            out.close();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
