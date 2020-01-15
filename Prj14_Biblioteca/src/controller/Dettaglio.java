package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.LibriService;
import service.Schedario;

/**
 * Servlet implementation class Dettaglio
 */
@WebServlet("/dettaglio")
public class Dettaglio extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("servlet");
		if (request.getParameter("id")!=null) {
			
			Schedario schedario = new Schedario();
			LibriService.init(schedario);
			request.setAttribute("libro", schedario.getLibroById(Integer.parseInt(request.getParameter("id"))));
			System.out.println("libro");
			
			String pagina = "Trovato libro";
			request.setAttribute("messaggio", pagina);
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
