package MyServlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CodePreviewGood")
public class CodePreviewGood extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public CodePreviewGood() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String script=request.getParameter("scriptcode");
		StringBuilder filtered = new StringBuilder(script.length());
		char c;
		for(int i = 0; i < script.length(); i++)
		{
			c = script.charAt(i);
			switch(c) 
			{
				case '<': filtered.append("&lt;"); break;
				case '>': filtered.append("&gt;"); break;
				case '"': filtered.append("&quot;"); break;
				case '&': filtered.append("&amp;"); break;
				case '\n': filtered.append("<br/>"); break;
				default : filtered.append(c);
			}
		}
		script=filtered.toString();
		request.setAttribute("scriptcode", script);
		getServletContext().getRequestDispatcher("/WEB-INF/code-preview-good.jsp").forward(request, response);
	}

}