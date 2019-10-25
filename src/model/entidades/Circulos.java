package model.entidades;

import model.enums.Cor;

public class Circulos  extends FormasAbstratas {
	
	private Double raio;
	
	public Circulos(Cor cor, double raio) {
		super(cor);
		this.raio=raio;
		
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}
	
	@Override
	public double area() {
		return Math.PI* Math.pow(raio,2);
	}

}
