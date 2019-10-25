package model.entidades;

import model.enums.Cor;

public abstract class  FormasAbstratas implements Formas{
	
	private Cor cor;

	public FormasAbstratas(Cor cor) {
		this.cor = cor;
	}
	
	
	public Cor getCor() {
		return cor;
	}
	
	public void setCor(Cor cor) {
		this.cor=cor;
	}	

}
