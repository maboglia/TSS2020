package controller;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import database.Videoteca;
import model.Serie;
import model.Utente;

/**
 * Servlet implementation class NegoziatoreJson
 */
@WebServlet("/negoziatore")
public class NegoziatoreJson extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String richiesta = null;
		
		if (request.getParameter("video") != null) {
			richiesta = request.getParameter("video");
		}
		
		if (richiesta != null)
			System.out.println("rihiesta: " + richiesta);
		else
			System.out.println("..............................");
		//---------------------------------------------------------------------
		
		final String SITO = "http://api.tvmaze.com/singlesearch/shows?q="+richiesta;
		InputStream is = null;
		BufferedInputStream bis = null;
		Serie serie = null;
		StringBuilder sb2 = new StringBuilder();
		try {
			
			URL url = new URL(SITO);
			is = url.openStream();
			bis = new BufferedInputStream(is);
			
			StringBuilder sb = new StringBuilder();
			
			while (true) {
				int data = bis.read();
				if (data == -1) break;
				else sb.append( (char) data );
				
			}
			
			serie =  parse(sb.toString());
			if(serie!=null)  {
				Videoteca.elencoSerie.add(serie);
				System.out.println("serie aggiunta");
				System.out.println(serie);
				response.sendRedirect("router");
			} else {
				System.out.println("serie NON aggiunta");
				response.sendRedirect("router?page=form");
				
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if ( is != null) is.close();
			if ( bis != null) bis.close();
		}
		
	}
	
	private Serie parse(String risposta) {

			Serie s = null;
			try {
				JSONObject serie = new JSONObject(risposta);
				String name = serie.getString("name");
				List<Object> genres = serie.getJSONArray("genres").toList();
				String officialSite = (serie.get("officialSite") != null)?serie.get("officialSite").toString():"";
				double rating = serie.getJSONObject("rating").getDouble("average");
				String image = serie.getJSONObject("image").getString("medium");
				String summary = serie.getString("summary");

				List<String> stringheGenere = new ArrayList<>();
				
				for (Object object : genres) {
					stringheGenere.add((String) object);
				}
				
				s = new Serie(name, stringheGenere, officialSite, rating, image, summary);
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			return s;
			
	}
	


}
