package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.Videoteca;
import model.Serie;

/**
 * Servlet implementation class Scorritore
 */
@WebServlet("/browser")
public class Scorritore extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		StringBuilder sb = new StringBuilder();
		List<String> lista = new ArrayList<>();
		for (Serie s : Videoteca.elencoSerie) {
			lista.add(s.getName());
		}
		request.setAttribute("serie", lista);
		request.getRequestDispatcher("elenco.jsp").forward(request, response);
	}

}
