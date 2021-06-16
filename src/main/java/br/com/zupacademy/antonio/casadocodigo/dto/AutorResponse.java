package br.com.zupacademy.antonio.casadocodigo.dto;

import java.time.LocalDateTime;

import br.com.zupacademy.antonio.casadocodigo.entity.Autor;

public class AutorResponse {
	
	private Long id;

	private LocalDateTime instante;

	private String email;

	private String nome;

	private String descricao;

	public Long getId() {
		return id;
	}

	public LocalDateTime getInstante() {
		return instante;
	}




	public String getEmail() {
		return email;
	}




	public String getNome() {
		return nome;
	}




	public String getDescricao() {
		return descricao;
	}




	public AutorResponse(Autor autor) {
		this.id = autor.getId();
		this.instante = autor.getInstante();
		this.email = autor.getEmail();
		this.nome = autor.getNome();
		this.descricao = autor.getDescricao();
	}

}
