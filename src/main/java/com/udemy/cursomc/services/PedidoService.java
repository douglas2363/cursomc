package com.udemy.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.cursomc.domain.Pedido;
import com.udemy.cursomc.repositories.PedidoRepositoy;
import com.udemy.cursomc.services.exceptions.ObjectNotFoundExcpetion;



@Service
public class PedidoService {

	@Autowired
	private PedidoRepositoy pedido;

	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = pedido.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundExcpetion(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
		}

	}


