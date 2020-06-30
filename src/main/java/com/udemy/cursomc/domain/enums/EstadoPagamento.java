package com.udemy.cursomc.domain.enums;

public enum EstadoPagamento {
	
	
	PENDENTE(1,"Pendente"),
	QUITADO(2,"Quitado"),
	Cancelado(3,"Cancelado");
	
	
	private int cod;
	private String descricao;
	
	
	private  EstadoPagamento(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	
	// Aqui ele valida o TpoCliente passado e armazena o codigo dentro do parametro "cod". e faz uma exceção caso o codigo não exista ele retorna null.
	public static EstadoPagamento toEnum(Integer cod) {
		
		if(cod == null ) {
			
			return null;
		}
		
		for (EstadoPagamento  x : EstadoPagamento.values()) {
			
			if (cod.equals(x.getCod())) {
				
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id Inválido: " + cod);
	
	}

}
