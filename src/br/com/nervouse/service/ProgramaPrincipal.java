package br.com.nervouse.service;

import br.com.nervouse.model.Cliente;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		ClienteService service = new ClienteService();
		
		Cliente jao = new Cliente();
		jao.setNome("Jão da Silva");
		
		
		service.cadastrar(jao);
		
		service.imprimir();
		
		
	}

}
