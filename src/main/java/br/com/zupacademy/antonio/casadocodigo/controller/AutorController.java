package br.com.zupacademy.antonio.casadocodigo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.zupacademy.antonio.casadocodigo.dto.AutorForm;
import br.com.zupacademy.antonio.casadocodigo.dto.AutorResponse;
import br.com.zupacademy.antonio.casadocodigo.entity.Autor;
import br.com.zupacademy.antonio.casadocodigo.repository.AutorRepository;

@RestController
@RequestMapping("/autores")
public class AutorController {
	
	@Autowired
	AutorRepository repository;

	@PostMapping
	public ResponseEntity<?> cadastrar(@RequestBody @Valid AutorForm request){
		
		Autor autor  = request.toModel();
	
		repository.save(autor);	
		
		return ResponseEntity.ok().body(new AutorResponse(autor));
	}
}
