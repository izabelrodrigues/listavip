package br.com.izabelrodrigues.listavip.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.izabelrodrigues.listavip.Constants;

@Entity(name = "convidado")
public class Convidado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator=Constants.CONVIDADO_SEQUENCE)
	private Long id;

	private String nome;
	private String email;
	private String telefone;

	public Convidado() {
	}

	public Convidado(String nome, String email, String telefone) {
		setNome(nome);
		setEmail(email);
		setTelefone(telefone);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}