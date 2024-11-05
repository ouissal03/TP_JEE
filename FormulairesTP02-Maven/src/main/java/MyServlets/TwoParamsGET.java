package MyServlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/TwoParamsGET")
public class TwoParamsGET extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TwoParamsGET() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
                throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		// Prénom
		String firstname = request.getParameter("firstname");
		if(firstname == null)
			firstname="";
		// Nom
		String lastname = request.getParameter("lastname");
		if(lastname == null)
			lastname="";
		
		// construire la page HTML
		StringBuilder str = new StringBuilder();
		str.append("<!DOCTYPE html><html><head><title>Reading Two request parameters with doGet</title></head>");
		str.append("<body>");
		str.append("<h1>Reading Two request parameters with doGet</h1>");
		str.append("<ul>");
		str.append("<li><b>First Name : </b>"+firstname+"</li>");
		str.append("<li><b>Last Name : </b>"+lastname+"</li>");
		str.append("</ul>");
		str.append("</body></html>");
		out.println(str);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
                throws ServletException, IOException {
		doGet(request, response);
	}

}