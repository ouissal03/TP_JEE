/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package pkg;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author 21263
 */
@WebServlet(name = "InterfaceServlet", urlPatterns = {"/interface"})
public class InterfaceServlet extends HttpServlet {
 protected void processRequest(HttpServletRequest request, HttpServletResponse response)
 throws ServletException, IOException {
 response.setContentType("text/html;charset=UTF-8");
 PrintWriter out = response.getWriter();
 try {
 out.println("<!DOCTYPE html>");
 out.println("<html>");
 out.println("<head>");
 out.println("<title>Passerelle SQL</title>"); 
 out.println("<link rel=\"stylesheet\" href=\"css/styles.css\" type=\"text/css\"/>");
 out.println("</head>");
 out.println("<body>");
 out.println("<h1>Passerelle SQL</h1>");
 StringBuilder strHtml = new StringBuilder();
 strHtml.append("<p><b>Donner l'instruction SQL à exécuter:</b></p>");
 strHtml.append("<form action=\"sqlpasserelle\" method=\"post\">");
 strHtml.append("<textarea name=\"sqlStatement\" cols=\"60\" rows=\"8\">");
 HttpSession session = request.getSession(false);
 String sqlStatement= "";
 if(session!=null){
 sqlStatement = (String)session.getAttribute("sqlStatement");
 }
 strHtml.append(sqlStatement);
 strHtml.append("</textarea>");
 strHtml.append("<br/><input type=\"submit\" value=\"Exécuter\">");
 strHtml.append("</form>");
 strHtml.append("<p><b>Résultat d'exécution de l'instruction SQL:</b></p>");
 out.println(strHtml.toString());
 String sqlResult = "";
 if(session!=null){ 
 sqlResult = (String)session.getAttribute("sqlResult");
 }
 out.println(sqlResult);
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
