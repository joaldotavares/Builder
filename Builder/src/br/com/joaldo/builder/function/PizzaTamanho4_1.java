package br.com.joaldo.builder.function;

public enum PizzaTamanho4_1 {
	MEDIA(1, "Pizza Média"),
	GRANDE(2, "Pizza Grande"),
	FAMILIA(3, "Pizza Familia");
	
	private int cod;
	private String desc;
	
	private PizzaTamanho4_1(int cod, String desc) {
		this.cod = cod;
		this.desc = desc;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
}
