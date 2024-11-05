/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlet;

import dao.*;
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
 * @author lenovo
 */
@WebServlet("/Enregistrer")
public class Enregistrer extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
public Enregistrer() {
super();
// TODO Auto-generated constructor stub
}
/**
     * @throws jakarta.servlet.ServletException
     * @throws java.io.IOException
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
*/
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
ServletException, IOException {

// TODO Auto-generated method stub
try{
HttpSession session = request.getSession();
Inscription ins=new Inscription();
Adherent c= (Adherent)session.getAttribute("adherent");
String s="";
    DBAdherent.insert(c);
    String[] sports = (String[])session.getAttribute("sports");
    for(int i=0; i<sports.length;i++){
        s=sports[i];
    }
    ins.setDesignation(s);
    ins.setEmail(c.getEmail());
    DBInscription.insert(ins);
   
this.getServletContext().getRequestDispatcher("/succes.jsp").forward(request, response);
}catch(ServletException | IOException e){
System.out.println(e.getMessage());
}
}
/**
     * @param request
     * @param response
     * @throws jakarta.servlet.ServletException
     * @throws java.io.IOException
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
ServletException, IOException {

// TODO Auto-generated method stub
doGet(request, response);
}
}
