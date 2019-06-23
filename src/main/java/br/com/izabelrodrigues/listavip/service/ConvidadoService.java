package br.com.izabelrodrigues.listavip.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.izabelrodrigues.listavip.model.Convidado;
import br.com.izabelrodrigues.listavip.repository.ConvidadoRepository;

@Service
public class ConvidadoService {
	
	@Autowired
	private ConvidadoRepository repository;
	
	public Iterable<Convidado> findAll(){
		return repository.findAll();
	}

}
