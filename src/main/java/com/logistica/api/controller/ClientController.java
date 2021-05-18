package com.logistica.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.logistica.domain.model.Cliente;

@RestController
public class ClientController {
	
	@GetMapping("/cliente")
	public List<Cliente> listar() {
		
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Maria");
		cliente1.setEmail("maria@gmail.com");
		cliente1.setTelefone("11 99999-9999");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Angel");
		cliente2.setEmail("angel@gmail.com");
		cliente2.setTelefone("61 88888-8888");
		
		return Arrays.asList(cliente1, cliente2);
	}
}
