package controller;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ScriviFileJSON {

	public static void main(String[] args) {
		JSONObject oggetto = new JSONObject();
		oggetto.put("nome", "mauro");
		oggetto.put("cognome", "bogliaccino");

		JSONArray corsi = new JSONArray();
		corsi.add("TSS: Java");
		corsi.add("ITS: PHP");
		corsi.add("ITS2: Javascript");
		
		oggetto.put("Lista corsi", corsi);
		
		try (FileWriter fw = new FileWriter("C:\\Users\\teacher\\Desktop\\file.txt");) {
			
			fw.write(oggetto.toJSONString());
			System.out.println("ha funzionato!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
