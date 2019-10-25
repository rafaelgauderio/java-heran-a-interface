package application;

import java.util.Locale;
import java.util.Scanner;

import model.entidades.Circulos;
import model.entidades.Retangulos;
import model.entidades.Formas;
import model.entidades.FormasAbstratas;
import model.enums.Cor;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
		Circulos forma1=new Circulos(Cor.AMARELO,2.5);
		Retangulos forma2=new Retangulos(Cor.PRETO, 3.5, 7.3);
		
		System.out.println("Informe o raio de um circulo: ");
		double raio=sc.nextDouble();
		System.out.println("Informe a altura e largura de um retângulo: ");
		double altura=sc.nextDouble();
		double largura=sc.nextDouble();
		
		FormasAbstratas circulo2=new Circulos(Cor.ROSA,raio);
		FormasAbstratas retangulo2=new Retangulos(Cor.BRANCO,altura, largura);
		
		// Bloco de impressão na tela
		
		System.out.println("A cor da primeira forma é "+ forma1.getCor());
		System.out.println("É um círculo de raio: "+String.format("%.2f",forma1.getRaio()));
		System.out.println("É um círculo de área: "+String.format("%.2f",forma1.area()));
		
		System.out.println("-------------------------------");
		
		System.out.println("A cor da segunda forma é " +forma2.getCor());
		System.out.println("É um retângulo de medidas de altura e largura, respectivamente: "
		+String.format("%.2f",forma2.getAltura())
		+" e "
		+String.format("%.2f",forma2.getLargura()));
		System.out.println("É um retangulo de área: "+String.format("%.2f",forma2.area()));
		System.out.println("-------------------------------");
		
		System.out.println("A cor do círculo informado é: "+circulo2.getCor());
		System.out.println("O valor da área do círculo informado é: "+String.format("%.2f",circulo2.area()));
		System.out.println("-------------------------------");
		System.out.println("A cor do retângulo informado é: "+retangulo2.getCor());
		System.out.println("O valor da área do retângulo informado é: "+String.format("%.2f",retangulo2.area()));
		
		
		sc.close();

	}

}
