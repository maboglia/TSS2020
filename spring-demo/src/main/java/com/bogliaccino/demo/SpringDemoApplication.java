package com.bogliaccino.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import model.Studente;

@SpringBootApplication
@RestController
public class SpringDemoApplication {

	@Autowired
	JdbcTemplate jdbc;
	
	@GetMapping("/studenti")
	public Collection<Studente> getStudenti(){
		Map<Long, Studente> studenti = new HashMap<>();
		
		studenti.put((long) 1, new Studente(1,"mauro", "bog1", "indiri", "citta", 'M'));
		studenti.put((long) 2, new Studente(2,"maura", "bo2", "indiri", "citta", 'M'));
		studenti.put((long) 3, new Studente(3,"maure", "bog3", "indiri", "citta", 'M'));
		studenti.put((long) 4, new Studente(4,"mauri", "bog4", "indiri", "citta", 'M'));
		studenti.put((long) 5, new Studente(5,"mauru", "bog5", "indiri", "citta", 'M'));
		
		return studenti.values();
	}
	

	@GetMapping("/studente/{id}")
	public Studente getStudente(@PathVariable int id) {
		
		return jdbc.queryForObject("select * from studente where studente_id = ?", new Object[] {id}, (rs, rowNum) ->  new Studente(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(5),rs.getString(6), rs.getString(4).charAt(0))   );
		
	}
	
	@GetMapping("/hello")
	public String hello() {
		
		return "Spring te saluta!!!";
		
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}

}
