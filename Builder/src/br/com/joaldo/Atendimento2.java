package br.com.joaldo;

import br.com.joaldo.builder.Pizza5;
import br.com.joaldo.builder.function.Pizzaria4;

public class Atendimento2 {
	
	protected Pizzaria4 pizzaria;

	public Atendimento2(Pizzaria4 pizzaria) {
		this.pizzaria = pizzaria;
	}
	
	public void montarPizza() {
		pizzaria.buildNome();
		pizzaria.buildIngredientes();
		pizzaria.buildTamanho();
		pizzaria.buildPreco();
	}
	
	public Pizza5 getPizza() {
		return pizzaria.getPizza();
	}
}
