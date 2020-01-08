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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import model.Film;

/**
 * Servlet implementation class OrdinaPerAnno
 */
@WebServlet("/ordinaPerAnno")
public class OrdinaPerAnno extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<String> elenco = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		Collections.sort(Videoteca.getElencoFilm(), (o1,o2) -> o1.getDurata()-o2.getDurata());
		for (Film film : Videoteca.getElencoFilm()) {
			elenco.add(film.getTitolo());
			sb.append(film.getTitolo()).append(" - ").append(film.getDurata()).append("\n");
		}
		Gson gsonBuilder = new GsonBuilder().create();
	    // Convertire Java ArrayList in JSON
	    
	    String jsonFromJavaArrayList = gsonBuilder.toJson(elenco);
	    //System.out.println(jsonFromJavaArrayList);
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
	    response.getWriter().append(jsonFromJavaArrayList);
	}

}
