package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Libro;
import service.LibriService;
import service.Schedario;

/**
 * Servlet implementation class Prestito
 */
@WebServlet("/prestito")
public class Prestito extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("identificativo");
		Schedario sc = new Schedario();
		LibriService.init(sc);
		
		Libro l = sc.getLibroById(Integer.parseInt(id));
		
		if (l.isInPrestito()) {
			response.getWriter().append("Libro già in prestito: ").append(l.getTitolo());
		} else {
			l.setInPrestito(true);
			response.getWriter().append("Libro disponibile: ").append(l.getTitolo());
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
