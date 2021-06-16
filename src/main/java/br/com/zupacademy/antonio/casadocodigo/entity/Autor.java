package br.com.zupacademy.antonio.casadocodigo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Autor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "Data não pode ser vazia.")
	private LocalDateTime instante;

	private String email;

	private String nome;
	
	@Column(columnDefinition = "LONGTEXT")
	private String descricao;
	
	@Deprecated
	public Autor() {
		
	}

	public Autor(LocalDateTime instante, String email, String nome, String descricao) {
		super();
		this.instante = instante;
		this.email = email;
		this.nome = nome;
		this.descricao = descricao;
	}
	
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
	
	
}
