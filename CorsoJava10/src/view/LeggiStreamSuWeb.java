package view;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;

import model.Utente;

public class LeggiStreamSuWeb {

	private static final String SITO = "https://jsonplaceholder.typicode.com/users";
	
	public static void main(String[] args) throws IOException {

			InputStream is = null;
			BufferedInputStream bis = null;
			
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
				parse(sb.toString());
			} catch (IOException e) {
				System.out.println(e.getMessage());
			} finally {
				if ( is != null) is.close();
				if ( bis != null) bis.close();
			}
		

	}
	
	public static String parse(String risposta) {
		
		JSONArray utenti = new JSONArray(risposta);
		for (int i = 0; i < utenti.length(); i++) {
			JSONObject utente = utenti.getJSONObject(i);
			int id = utente.getInt("id");
			String username = utente.getString("username");
			
			Utente u = new Utente(id, username);
			
			System.out.println(u);
		}
		return null;
		
	}
	

}
