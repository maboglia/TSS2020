package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PrenotazioneDAOImpl;

/**
 * Servlet implementation class Prenotazione
 */
@WebServlet("/prenota")
public class Prenotazione extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int nGiorni = Integer.parseInt(request.getParameter("nGiorni"));
		int nPersone = Integer.parseInt(request.getParameter("nPersone"));
		String nome = request.getParameter("nome");
		
		model.Prenotazione p = new model.Prenotazione();
		p.setnGiorni(nGiorni);
		p.setnPersone(nPersone);
		p.setNome(nome);
		
		response.getWriter().append("Il preventivo di spesa è: " + p.calcolaPreventivo());
		
		PrenotazioneDAOImpl pdi = new PrenotazioneDAOImpl();
		pdi.insert(p);
		
		for (model.Prenotazione p2 : pdi.getAll()) {
			System.out.println(p2.getNome() +": "+ p2.calcolaPreventivo());
		}
		
		
	}

}
