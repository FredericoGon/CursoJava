package br.com.cursojava;

import java.util.Scanner;

public class Atividade01 {
	public static void main(String[] args) {
		int casa = 0;
		while (casa<4){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Opção 1 - Blá;");
		System.out.println("Opção 2 - Blé;");
		System.out.println("Opção 3 - Blí;");
		System.out.println("Opção 4 - Bló;");
		System.out.println("Opção 5 - Blú;");
		int n = Integer.parseInt(teclado.nextLine());
		switch(n){
		case 1:
			System.out.println("Você escoclheu Blá");
			break;
		case 2:
			System.out.println("Você escoclheu Blé");
			break;
		case 3:
			System.out.println("Você escoclheu Blí");
			break;
		case 4:
			System.out.println("Você escoclheu Blé");
			break;
		case 5:
			System.out.println("Você escoclheu Blú");
			break;
		}
		teclado.close();
		}
	}
}
