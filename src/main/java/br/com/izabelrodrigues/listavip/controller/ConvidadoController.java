package br.com.izabelrodrigues.listavip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
