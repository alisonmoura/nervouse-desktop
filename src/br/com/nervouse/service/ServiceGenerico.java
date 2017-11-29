package br.com.nervouse.service;

import java.util.ArrayList;
import java.util.List;

import br.com.nervouse.model.Model;

public class ServiceGenerico<T extends Model> {

	protected List<T> lista;

	public ServiceGenerico() {
		lista = new ArrayList<>();
	}

	public void cadastrar(T novo) {
		lista.add(novo);
	}
	
	public T buscar(Integer id) {
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getId() == id) {
				return lista.get(i);
			}
		}
		return null;
	}
	
	public List<T> buscarTodos(){
		return lista;
	}

	public void imprimir() {
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}

}
