package br.com.joaldo.builder.function;


public class PizzaPortuguesa3 extends Pizzaria4{
	
	@Override
	public void buildNome(){
		pizza.nome = "Pizza de Mussarela";
	}

	@Override
	public void buildIngredientes() {
		pizza.ingredientes = "Mussarela, presunto, milho, ceboola, molho, "
				+ "ovo, orégano, ervilha e ceboola.";
	}

	@Override
	public void buildTamanho() {
		pizza.tamanho = PizzaTamanho4_1.GRANDE;
	}
	
	@Override
	public void buildPreco() {
		pizza.preco = 38.99;
	}

}
