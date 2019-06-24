package br.com.izabelrodrigues.listavip.service;

import java.util.Optional;

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

	public void save(Convidado convidado) {
		repository.save(convidado);
	}
	
	
	public Optional<Convidado> findById(Long id) {
		return repository.findById(id);
	}
	
	public void delete(Convidado convidado) {
		repository.delete(convidado);
	}

}
