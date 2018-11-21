package br.com.cursojava;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a primeria nota: ");
		double n1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite a segunda nota: ");
		double n2 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite a terceira nota: ");
		double n3 = Double.parseDouble(teclado.nextLine());
		teclado.close();
		double res = (n1+n2+n3)/3;
		// while entre a primeira e a segunda;
		// declarar as notas antes de pedir;
	}
}