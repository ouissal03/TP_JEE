package MyServlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CodePreviewBad")
public class CodePreviewBad extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public CodePreviewBad() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("scriptcode", (String)request.getParameter("scriptcode"));
		getServletContext().getRequestDispatcher("/WEB-INF/code-preview-bad.jsp").forward(request, response);
	}

}