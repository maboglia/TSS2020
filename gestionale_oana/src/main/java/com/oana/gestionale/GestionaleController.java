package com.oana.gestionale;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.oana.gestionale.entities.Cliente;
import com.oana.gestionale.services.IClienteService;

@Controller
public class GestionaleController {
	
	//collego il servizio
	@Autowired
	private IClienteService service;
	
	@RequestMapping("/aggiungiC")
	public String getCliente() {
		return "AddCliente";
	}
	
	@RequestMapping("/aggiungiCliente")
	public ModelAndView salvaCliente(@ModelAttribute("cliente") Cliente c, ModelMap modelMap) {
		service.addCliente(c);
		String messaggio="aggiunto cliente: " + c.getNome();
		modelMap.addAttribute("msg",messaggio);
		System.out.println(c);
		return new ModelAndView("AddCliente");
	}
	
	@RequestMapping("/mostraClienti")
	public ModelAndView mostraClienti(ModelMap modelMap) {
		List<Cliente> clienti=service.getAll();
		modelMap.addAttribute("clienti", clienti);
		return new ModelAndView("MostraClienti");
	}
	@RequestMapping("/deleteCliente")
	public String eliminaCliente(@RequestParam("id") int id) {
		Cliente c = service.getClienteById(id);
		service.eliminaCliente(c);
		
		return "redirect:/mostraClienti";
	}
	@RequestMapping("/aggiornaCliente")
	public ModelAndView aggiornaCliente(@RequestParam("id") int id, ModelMap modelMap) {
		Cliente c = service.getClienteById(id);
		service.addCliente(c);
		modelMap.addAttribute("cliente" ,c);
		return new ModelAndView("ModificaCliente");
	}
	@RequestMapping("/modificaCliente")
	public String modificaCliente(@ModelAttribute("cliente") Cliente c) {
		service.addCliente(c);
		
		return "redirect:/mostraClienti";
	}
}
