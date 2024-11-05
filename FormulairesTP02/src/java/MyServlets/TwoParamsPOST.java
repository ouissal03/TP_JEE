package MyServlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/TwoParamsPOST")
public class TwoParamsPOST extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TwoParamsPOST() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
                throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
                throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		// Prénom
		String firstname = (String)request.getParameter("firstname");
		if(firstname == null)
			firstname="";
		// Nom
		String lastname = (String)request.getParameter("lastname");
		if(lastname == null)
			lastname="";
		
		// construire la page HTML
		StringBuilder str = new StringBuilder();
		str.append("<!DOCTYPE html><html><head><title>Reading Two Request Parameters with doPost Method</title></head>");
		str.append("<body>");
		str.append("<h1>Reading Two request parameters with doPost Method</h1>");
		str.append("<ul>");
		str.append("<li><b>First Name : </b>"+firstname+"</li>");
		str.append("<li><b>Last Name : </b>"+lastname+"</li>");
		str.append("</ul>");
		str.append("</body></html>");
		out.println(str);
	}

}