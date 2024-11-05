package MyServlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ShowParameters")
public class ShowParameters extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ShowParameters() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String itemNumber = request.getParameter("itemNumber");
		String description = request.getParameter("description");
		String priceEach = request.getParameter("priceEach");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String shippingAddress = request.getParameter("shippingAddress");
		String creditCard = request.getParameter("creditCard");
		String creditCardNumber1 = request.getParameter("creditCardNumber");
		String creditCardNumber2 = request.getParameter("repeatCreditCardNumber");
		
		request.setAttribute("itemNumber", itemNumber);
		request.setAttribute("description", description);
		request.setAttribute("priceEach", priceEach);
		request.setAttribute("firstName", firstName);
		request.setAttribute("lastName", lastName);
		request.setAttribute("shippingAddress", shippingAddress);
		request.setAttribute("creditCard", creditCard);
		request.setAttribute("creditCardNumber1", creditCardNumber1);
		request.setAttribute("creditCardNumber2", creditCardNumber2);
		getServletContext().getRequestDispatcher("/WEB-INF/readingAllRequestParameters.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
                throws ServletException, IOException {

		doGet(request, response);
	}

}