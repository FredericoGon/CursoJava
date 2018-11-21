package br.com.cursojava;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("A base do triângulo é: ");
		double base = Double.parseDouble(teclado.nextLine());
		System.out.println("A altura do triângulo é: ");
		double altura = Double.parseDouble(teclado.nextLine());
		teclado.close();
		double area = (base*altura)/2;
		System.out.println("A área é: "+area);
		
	}

}
