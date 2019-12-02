package controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Prodotto;

/**
 * Servlet implementation class Dolce
 */
@WebServlet("/dolci")
public class Dolce extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("header.jsp").include(request, response);
		request.getRequestDispatcher("menu.jsp").include(request, response);
		
		String pagina = "dolci";
		request.setAttribute("pagina", pagina);
		request.setAttribute("prodotti", Prodotti.filtraElenco(pagina));
		
		request.getRequestDispatcher("content.jsp").include(request, response);
		//response.getWriter().append("<h2>Dolci</h2>");
		
		request.getRequestDispatcher("footer.jsp").include(request, response);
	}

}
