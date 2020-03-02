package com.bogliaccino.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bogliaccino.mvc.model.Telefono;

@SpringBootApplication
@Controller
public class SpringMvcApplication {

	@ResponseBody
	@RequestMapping("/telefono")
	public Telefono getTele() {
		return new Telefono(5.5, 4100, 32, "Xiaomi", "REDMI Note 4");
	}
	
	@RequestMapping("/prova")
	public String viewResolver() {
		return "telefoni";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringMvcApplication.class, args);
	}

}
