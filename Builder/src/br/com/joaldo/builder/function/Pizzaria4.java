package br.com.joaldo.builder.function;

import br.com.joaldo.builder.Pizza5;

public abstract class Pizzaria4 {
	
	protected Pizza5 pizza;

	public Pizzaria4() {
		pizza = new Pizza5();
	}
	
	public abstract void buildNome();
	
	public abstract void buildIngredientes();
	
	public abstract void buildTamanho();

	public abstract void buildPreco();

	public Pizza5 getPizza() {
		return pizza;
	}	
}


