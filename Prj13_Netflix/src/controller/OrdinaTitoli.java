package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Film;

/**
 * Servlet implementation class OrdinaTitoli
 */
@WebServlet("/ordinaTitoli")
public class OrdinaTitoli extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<String> elenco = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		Collections.sort(Videoteca.getElencoFilm());
		for (Film film : Videoteca.getElencoFilm()) {
			sb.append(film.getTitolo()).append("\n");
			elenco.add(film.getTitolo());
		}
		request.setAttribute("elenco", elenco);
		request.getRequestDispatcher("index.jsp").forward(request, response);
		response.getWriter().append(sb.toString());
	}

}
