package br.com.cursojava;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual sua idade em anos? ");
		int anos = Integer.parseInt(teclado.nextLine());
		System.out.println("Quantos meses se passaram de seu aniverário? ");
		int meses = Integer.parseInt(teclado.nextLine());
		teclado.close();
		int idade = (anos*12)+meses;
		System.out.println("Sua idade em meses é de: "+idade+"meses.");
	}

}
