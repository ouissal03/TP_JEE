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
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getParameter("confirmer") != null) {
            HttpSession session = request.getSession();
            Adherent adherent = (Adherent) session.getAttribute("adherent");
            String[] sports = (String[]) session.getAttribute("sports");

            DBAdherent dbAdherent = new DBAdherent();
            dbAdherent.insert(adherent);

            DBInscription dbInscription = new DBInscription();
            for (String sport : sports) {
                Inscription inscription = new Inscription();
                inscription.setEmail(adherent.getEmail());
                inscription.setDesignation(sport);
                dbInscription.insert(inscription);
            }

            this.getServletContext().getRequestDispatcher("/succes.jsp").forward(request, response);
        } else {
            this.getServletContext().getRequestDispatcher("/annuler.html").forward(request, response);
        }
    }
}
