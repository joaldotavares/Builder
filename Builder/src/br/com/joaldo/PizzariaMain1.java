package br.com.joaldo;

import br.com.joaldo.builder.Pizza5;
import br.com.joaldo.builder.function.PizzaPortuguesa3;

public class PizzariaMain1 {
	public static void main(String[] args) {
		Atendimento2 atendimento = new Atendimento2(new PizzaPortuguesa3());
		
		atendimento.montarPizza();
		
		Pizza5 pizza = atendimento.getPizza();
		
		System.out.println("Pizza: " + pizza.nome + "\n"
				+ "Ingredientes: " + pizza.ingredientes + "\n"
				+ "Tamanho: " + pizza.tamanho.getDesc() + "\n"
				+ "Preço: " + pizza.preco);
	}
}
