package br.com.cursojava;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("A base do tri�ngulo �: ");
		double base = Double.parseDouble(teclado.nextLine());
		System.out.println("A altura do tri�ngulo �: ");
		double altura = Double.parseDouble(teclado.nextLine());
		teclado.close();
		double area = (base*altura)/2;
		System.out.println("A �rea �: "+area);
		
	}

}
