package br.com.cursojava;

import java.util.Scanner;

public class Atividade01 {
	public static void main(String[] args) {
		int casa = 0;
		while (casa<4){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Op��o 1 - Bl�;");
		System.out.println("Op��o 2 - Bl�;");
		System.out.println("Op��o 3 - Bl�;");
		System.out.println("Op��o 4 - Bl�;");
		System.out.println("Op��o 5 - Bl�;");
		int n = Integer.parseInt(teclado.nextLine());
		switch(n){
		case 1:
			System.out.println("Voc� escoclheu Bl�");
			break;
		case 2:
			System.out.println("Voc� escoclheu Bl�");
			break;
		case 3:
			System.out.println("Voc� escoclheu Bl�");
			break;
		case 4:
			System.out.println("Voc� escoclheu Bl�");
			break;
		case 5:
			System.out.println("Voc� escoclheu Bl�");
			break;
		}
		teclado.close();
		}
	}
}
