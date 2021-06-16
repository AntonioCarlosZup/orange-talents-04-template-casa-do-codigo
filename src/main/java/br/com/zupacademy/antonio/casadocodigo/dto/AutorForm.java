package br.com.zupacademy.antonio.casadocodigo.dto;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import br.com.zupacademy.antonio.casadocodigo.entity.Autor;

public class AutorForm {

	@NotBlank(message = "Email não pode ser vazio.")
	@Email(message = "Email invalido.")
	private String email;

	@NotBlank(message = "Nome não pode estar vazio.")
	private String nome;

	@NotBlank(message = "Descrição não pode estar vazia.")
	@Size(min = 1, max = 400, message = "Descrição muito longa.")
	private String descricao;

	public String getEmail() {
		return email;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public Autor toModel() {

		return new Autor(LocalDateTime.now(), email, nome, descricao);

	}
}
