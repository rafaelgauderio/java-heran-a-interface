package model.entidades;

import model.enums.Cor;

public class Retangulos extends FormasAbstratas{
	
	private Double altura;
	private Double largura;
	
	//construtor
	
	public Retangulos(Cor cor, Double altura, Double largura) {
		super(cor);
		this.altura = altura;
		this.largura = largura;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}
	
	
	//método concreto para Cálculo da área
	
	@Override
	public double area() {
		return altura*largura;
		
	}
	

}
