package controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class LeggiFileJSON {

	public static void main(String[] args) {
		JSONParser parser = new JSONParser();
		
		try {
			Object obj = parser.parse(new FileReader("C:\\Users\\teacher\\Desktop\\file.txt"));
			
			JSONObject json = (JSONObject) obj;
			
			String nome = (String) json.get("nome");
			String cognome = (String) json.get("cognome");
			
			JSONArray lista = (JSONArray) json.get("Lista corsi");
		
			System.out.println("nome: " + nome);
			System.out.println("cognome: " + cognome);
			
			for (Object object : lista) {
				System.out.println((String) object);
			}
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
