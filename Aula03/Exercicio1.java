package br.com.cursojava;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		int n1 = Integer.parseInt(entrada.nextLine());
		System.out.println("Digite outro n�mero: ");
		int n2 = Integer.parseInt(entrada.nextLine());
		entrada.close();
		int maior = Math.max(n1, n2);
		System.out.println("O maior n�mero �: "+maior);
	}
}
