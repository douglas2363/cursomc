package com.udemy.cursomc.domain.enums;

public enum TipoCliente {
	
	PESSOAFISICA(1,"Pessoa Fisíca"),
	PESSOAJURIDICA(2, "Pessoa Juridica");
	
	private int cod;
	private String descricao;
	
	
	private  TipoCliente(int cod, String descricao) {
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
	public static TipoCliente toEnum(Integer cod) {
		
		if(cod == null ) {
			
			return null;
		}
		
		for (TipoCliente  x : TipoCliente.values()) {
			
			if (cod.equals(x.getCod())) {
				
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id Inválido: " + cod);
	
	}
}
