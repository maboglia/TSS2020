package controller;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Libro;
import model.LibroDAOImpl;

/**
 * Servlet implementation class Libri
 */
@WebServlet("/Libri")
public class Libri extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private LibroDAOImpl libri = new LibroDAOImpl();
	private Map<Integer, Libro> mappa = libri.getAll();
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String risposta="";
		int id = (request.getParameter("libro_id")!=null)? Integer.parseInt(request.getParameter("libro_id")): 0;
		
		if (id > 0) {
			//vuoi un libro in particolare
			Libro l = libri.getById(id);
			risposta = l.getTitolo();
			
		} else {
			//vuoi l'intero elenco libri
			StringBuilder sb = new StringBuilder();
			Collection<Libro> valoriMappa = mappa.values();
			valoriMappa.forEach(l -> sb.append(l.getTitolo()));
			risposta = sb.toString();
		}
		
		System.out.println(mappa.get(5));
		

		//this is functional programming in java!
		
		//Libro l = libri.getById(5);
		//System.out.println(l);
		
		//Libro nuovo = new Libro(24, "Guerra e pace");
		//libri.insert(nuovo);
//		nuovo.setTitolo("Guerra o pace?");
//		libri.update(nuovo);
//		if (libri.delete(nuovo))
//			System.out.println("libro eliminato con successo");;

		
		
		response.getWriter().append(risposta);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String titolo = (request.getParameter("titolo")!=null) ? 	
				request.getParameter("titolo") : null;
		
		if (titolo != null) {
			Libro nuovo = new Libro();
			nuovo.setTitolo(titolo);
			libri.insert(nuovo);	
			System.out.println("aggiunto");
		}		else
			System.out.println("non aggiunto");
				
		
	}

}
