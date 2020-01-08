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

import model.Utente;

@WebServlet("/utenti")
public class Utenti extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final String SITO = "https://jsonplaceholder.typicode.com/users";
		InputStream is = null;
		BufferedInputStream bis = null;
		List<Utente> elenco = null;
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
			
			//System.out.println(sb.toString());
			elenco =  parse(sb.toString());
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if ( is != null) is.close();
			if ( bis != null) bis.close();
		}
		sb2.append("<table>");
		for (Utente u : elenco) {
			sb2.append("<tr><td>"+u.getId()+ "</td><td>"+u.getUsername()+"</td></tr>");
		}
		sb2.append("</table>");
		
		response.setContentType("text/html");
		response.getWriter().append(sb2.toString());
		
	
	}
	
	private List<Utente> parse(String risposta) {
		
		List<Utente> elenco = new ArrayList<>();
		
		JSONArray utenti = new JSONArray(risposta);
		for (int i = 0; i < utenti.length(); i++) {
			JSONObject utente = utenti.getJSONObject(i);
			int id = utente.getInt("id");
			String username = utente.getString("username");
			
			Utente u = new Utente(id, username);
			elenco.add(u);
			System.out.println(u);
		}
		return elenco;
		
	}
	
	
	

}
