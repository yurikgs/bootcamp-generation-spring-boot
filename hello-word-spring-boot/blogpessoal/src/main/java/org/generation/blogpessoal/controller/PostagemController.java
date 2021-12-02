package org.generation.blogpessoal.controller;

import java.util.List;

import org.generation.blogpessoal.model.Postagem;
import org.generation.blogpessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Diz para o Spring que essa clase é um controller
@RequestMapping("/postagens") // Diz qual o caminho (URI) para as rquisições
@CrossOrigin(origins = "*", allowedHeaders="*") // Uma api de tecnologia diferente consumirá esta classe - e esta anotação diz que ela aceitará requisições de qualquer origem
public class PostagemController {

	//CONCEITO DE INJEÇÃO DE DEPENDÊNCIAS:
	
	
	@Autowired // Essa anotação faz o spring dar acesso a todos os serviços da inerface esécificada (cria um objeto com todos os métodos da interface especifcada, que depois pode ser acessado?)
	private PostagemRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Postagem>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	
}
