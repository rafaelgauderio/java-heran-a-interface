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
		System.out.println("Informe a altura e largura de um ret�ngulo: ");
		double altura=sc.nextDouble();
		double largura=sc.nextDouble();
		
		FormasAbstratas circulo2=new Circulos(Cor.ROSA,raio);
		FormasAbstratas retangulo2=new Retangulos(Cor.BRANCO,altura, largura);
		
		// Bloco de impress�o na tela
		
		System.out.println("A cor da primeira forma � "+ forma1.getCor());
		System.out.println("� um c�rculo de raio: "+String.format("%.2f",forma1.getRaio()));
		System.out.println("� um c�rculo de �rea: "+String.format("%.2f",forma1.area()));
		
		System.out.println("-------------------------------");
		
		System.out.println("A cor da segunda forma � " +forma2.getCor());
		System.out.println("� um ret�ngulo de medidas de altura e largura, respectivamente: "
		+String.format("%.2f",forma2.getAltura())
		+" e "
		+String.format("%.2f",forma2.getLargura()));
		System.out.println("� um retangulo de �rea: "+String.format("%.2f",forma2.area()));
		System.out.println("-------------------------------");
		
		System.out.println("A cor do c�rculo informado �: "+circulo2.getCor());
		System.out.println("O valor da �rea do c�rculo informado �: "+String.format("%.2f",circulo2.area()));
		System.out.println("-------------------------------");
		System.out.println("A cor do ret�ngulo informado �: "+retangulo2.getCor());
		System.out.println("O valor da �rea do ret�ngulo informado �: "+String.format("%.2f",retangulo2.area()));
		
		
		sc.close();

	}

}
