package br.com.izabelrodrigues.listavip.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.izabelrodrigues.email.service.EmailService;
import br.com.izabelrodrigues.listavip.model.Convidado;
import br.com.izabelrodrigues.listavip.service.ConvidadoService;

@Controller
public class ConvidadoController {

	@Autowired
	private ConvidadoService service;

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/lista-convidados")
	public String lista(Model model) {
		Iterable<Convidado> convidados = service.findAll();
		model.addAttribute("convidados", convidados);
		return "lista-convidados";
	}
	
	@RequestMapping(value= "salvar", method = RequestMethod.POST)
	public String salvar(@RequestParam("nome") String nome, @RequestParam("email") String email,
	                   @RequestParam("telefone") String telefone, Model model ){

	    Convidado novoConvidado = new Convidado(nome, email, telefone);
	    service.save(novoConvidado);

	    new EmailService().enviar(nome, email);
	    Iterable<Convidado> convidados = service.findAll();
	    model.addAttribute("convidados", convidados);

	    return "lista-convidados";
	}
	
	@RequestMapping(value= "remover", method = RequestMethod.DELETE)
	public String remover(@RequestParam("id") Long id) {
		Optional<Convidado> convidado = service.findById(id); 
		if(convidado.isPresent()) {
			service.delete(convidado.get());
		}
		return "lista-convidados";
		
	}

}
