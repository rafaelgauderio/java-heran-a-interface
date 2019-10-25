package model.entidades;

import model.enums.Cor;

public abstract class Formas {
	
	private Cor cor;

	public Formas(Cor cor) {
		this.cor = cor;
	}
	
	
	public Cor getCor() {
		return cor;
	}
	
	public void setCor(Cor cor) {
		this.cor=cor;
	}
	
	//m�todo abstrado sem chaves, por n�o faz nada na classe abstrata
	
	public abstract double area();
				
		

}
