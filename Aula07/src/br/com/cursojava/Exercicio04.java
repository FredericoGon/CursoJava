package br.com.cursojava;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira um número: ");
		int n1 = Integer.parseInt(teclado.nextLine());
		System.out.println("Insira um número: ");
		int n2 = Integer.parseInt(teclado.nextLine());
		System.out.println("Insira um número: ");
		int n3 = Integer.parseInt(teclado.nextLine());
		System.out.println("Insira um número: ");
		int n4 = Integer.parseInt(teclado.nextLine());
		System.out.println("Insira um número: ");
		int n5 = Integer.parseInt(teclado.nextLine());
		teclado.close();
		for (;;){
		int soma = n1 + n2 + n3 + n4 + n5;
		double media = soma/5.0;
		System.out.println(soma);
		System.out.println(media);
		break;
		}
	}
}
