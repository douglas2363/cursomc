package com.udemy.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.cursomc.domain.Categoria;
import com.udemy.cursomc.domain.Cliente;
import com.udemy.cursomc.repositories.CategoriaRepository;
import com.udemy.cursomc.repositories.ClienteRepository;
import com.udemy.cursomc.services.exceptions.ObjectNotFoundExcpetion;



@Service
public class ClienteService {

	@Autowired
	private ClienteRepository cli;

	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = cli.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundExcpetion(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
		}

	}


