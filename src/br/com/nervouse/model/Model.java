package br.com.nervouse.model;

public abstract class Model {

	private Integer id;
	private static Integer cont = 0;
	
	public Model() {
		cont++;
		this.id = cont;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
}
