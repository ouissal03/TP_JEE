/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package email;

import java.io.IOException;
import java.io.*;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import business.User;
import data.DBUser;
/**
 *
 * @author 21263
 */
@WebServlet(name = "EmailListServlet", urlPatterns = {"/EmailListServlet"})

public class EmailListServlet extends HttpServlet {
@Override
protected void doPost(HttpServletRequest request,
HttpServletResponse response)
throws ServletException, IOException {
String url = "/index.html";
// get current action
String action = request.getParameter("action");
if (action == null) {
action = "join"; // default action
}
// perform action and set URL to appropriate page
if (action.equals("join")) {
url = "/index.jsp"; // the "join" page
} 
else if (action.equals("add")) {
// get parameters from the request
String firstName = request.getParameter("firstName");
String lastName = request.getParameter("lastName");
String email = request.getParameter("email");
// store data in User object
User user = new User(firstName, lastName, email);
// validate the parameters
String message;
if (DBUser.emailExists(user.getEmail())) {
message = "This email address already exists.<br>" +
"Please enter another email address.";
url = "/index.jsp";
}
else {
message = "";
url = "/thanks.jsp";
DBUser.insert(user);
}
request.setAttribute("user", user);
request.setAttribute("message", message);
}
getServletContext()
.getRequestDispatcher(url)
.forward(request, response);
} 
}
