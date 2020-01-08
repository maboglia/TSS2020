package controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Animale;
import model.Cane;
import model.Ciotole;
import model.Commestibile;
import model.Gatto;
import model.Secco;
import model.Topo;
import model.Umido;

/**
 * Servlet implementation class Router
 */
@WebServlet("/negozio")
public class Router extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Secco crocchette = new Secco();

		crocchette.setQuantita(Ciotole.MEDIA.getQty());
		
		Umido bustine = new Umido();
		bustine.setNome("almo nature");
		bustine.setQuantita(Ciotole.PICCOLA.getQty());

		List<Animale> rifugioAnimali = Arrays.asList(
				new Cane(),
				new Cane(),
				new Cane(),
				new Gatto(),
				new Gatto(),
				new Gatto(),
				new Topo(),
				new Topo(),
				new Topo()
				);
		
		RifugioAnimali rifugio = new RifugioAnimali(rifugioAnimali);
		Commestibile c;
		for (Animale animale : rifugioAnimali) {
			double rand = Math.random();
			if (rand > 0.67)
				 c = crocchette;
			else if (rand > 0.33)
				c = bustine;
			else c= (Topo) rifugioAnimali.get(6);	
			
			animale.mangia(c);
		}
		
		
		
		StringBuilder sb = new StringBuilder();
		
//		sb.append("Il totale di animali nel rifugio è: " + rifugio.getRifugioAnimali().size());
//		sb.append("\n");
//		sb.append("Il totale di cani ne rifugio è: " + rifugio.rCani.elencoCani.size());
//		sb.append("\n");
//		sb.append("Il totale di gatti ne rifugio è: " + rifugio.rGatti.setGatti.size());
//		sb.append("\n");
//		sb.append("Il totale di topi ne rifugio è: " + rifugio.rTopi.elencoTopi.size());

		
		for (Animale animale : rifugioAnimali) {
			sb.append(animale).append(" " + animale.getSoddisfazione());
		sb.append("\n");
		
		}
		
		rifugioAnimali.forEach(a -> a.scappa(rifugioAnimali.get(5)));
		
		response.getWriter().append(sb.toString());
	}


}
