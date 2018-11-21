package br.com.cursojava;

import java.util.Scanner;

public class ExemploSwitch {
	
	private static final int INICIAL = 1;
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um n�mero entre 1 e 7: ");
		int dia = Integer.parseInt(teclado.nextLine());
		switch(dia){
		case INICIAL: // a INICIAL foi usada apenas como exemplo de constante, poderia ter sido usado o n�mero 1.
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Ter�a-Feira");
			break;
		case 4:
			System.out.println("Quarta-Feira");
			break;
		case 5:
			System.out.println("Quinta-Feira");
			break;
		case 6:
			System.out.println("Sexta-Feira");
			break;
		case 7:
			System.out.println("S�bado");
			break;
		default:
			System.out.println("N�mero Inv�lido");
			break;
		}	
		teclado.close();
	}
}