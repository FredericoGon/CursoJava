package br.com.cursojava;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número de 1 a 20: ");
		int n = Integer.parseInt(teclado.nextLine());
		long fatorial = 1;
		for (int i = 1;i<=n;i++){
			fatorial *= i;
			//System.out.println(i);
		}//for
		System.out.println(fatorial);
	}//main
}//class
