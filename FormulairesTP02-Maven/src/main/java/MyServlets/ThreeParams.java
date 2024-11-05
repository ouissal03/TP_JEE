package MyServlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ThreeParams")
public class ThreeParams extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ThreeParams() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		//First parameter
		String param1=request.getParameter("firstparam");
		if(param1 == null)
			param1="";
		//Second parameter
		String param2=request.getParameter("secondparam");
		if(param2 == null)
			param2="";
		//Thirdparameter
		String param3=request.getParameter("thirdparam");
		if(param3 == null)
			param3="";
		
		// construire la page HTML
				StringBuilder str = new StringBuilder();
				str.append("<!DOCTYPE html><html><head><title>Reading Three Request Parameters with default method(doGet)</title></head>");
				str.append("<body>");
				str.append("<h1>Reading Three Request Parameters with default method(doGet)</h1>");
				str.append("<ul>");
				str.append("<li><b>param1 : </b>"+param1+"</li>");
				str.append("<li><b>param2 : </b>"+param2+"</li>");
				str.append("<li><b>param3: </b>"+param3+"</li>");
				str.append("</ul>");
				str.append("</body></html>");
				out.println(str);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}