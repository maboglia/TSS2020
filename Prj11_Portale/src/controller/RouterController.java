package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RouterController
 */
@WebServlet(description = "Questa è la classe che farà da controller del sito web", urlPatterns = { "/router" })
public class RouterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String pagina = "home";
		
		if (  request.getParameter("page") != null  ) {
			pagina = request.getParameter("page");
		}
		
		switch (pagina) {
		case "form":
//			response.setContentType("text/html");
//			response.getWriter().append("<h1>form inserimento</h1>");
			request.getRequestDispatcher("form.html").include(request, response);
			break;

		case "elenco":
			response.sendRedirect("browser");
			break;
			
		case "dettaglio":
			response.setContentType("text/html");
			response.getWriter().append("<h1>dettaglio</h1>");
			break;
			
		default:
			response.sendRedirect("index.html");
			break;
		}
		
		
	}

}
