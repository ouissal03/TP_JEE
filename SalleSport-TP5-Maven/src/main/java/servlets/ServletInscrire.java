package servlets;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import dao.Adherent;

@WebServlet("/inscrire")
public class ServletInscrire extends HttpServlet {
private static final long serialVersionUID = 1L;
 
 
 public ServletInscrire() {
 super();
 // TODO Auto-generated constructor stub
 }
/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws 
ServletException, IOException {
// TODO Auto-generated method stub
try{ 
 
 Adherent c = null;
 HttpSession session = request.getSession();

 
 c = new Adherent();
 c.setEmail(request.getParameter("email"));
 c.setNom(request.getParameter("nom"));
 c.setPrenom(request.getParameter("prenom"));
 c.setAdresse(request.getParameter("adresse"));
 c.setGenre(request.getParameter("genre"));
 c.setTel(request.getParameter("tel"));
 String[] sports = request.getParameterValues("sport");
 session.setAttribute("adherent", c);
 session.setAttribute("sports", sports);
 
 this.getServletContext().getRequestDispatcher("/confirmer.jsp").forward(request, response);
 }catch(Exception e){
 System.out.println(e.getMessage());
 }
}
/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws 
ServletException, IOException {
// TODO Auto-generated method stub
doGet(request, response);
}
}
