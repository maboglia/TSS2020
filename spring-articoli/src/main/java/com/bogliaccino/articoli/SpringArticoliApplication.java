package com.bogliaccino.articoli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class SpringArticoliApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringArticoliApplication.class, args);
	}
	
	@RequestMapping("/addArticolo")
	public String addArticolo() {
		return "insertArticolo";
	}
	
}
