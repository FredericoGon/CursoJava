package br.com.cursojava;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número entre 1 e 3: ");
		int input = Integer.parseInt(teclado.nextLine());
		teclado.close();
		switch(input){
		case 1:
			System.out.println("1 - Sacar");
			break;
		case 2:
			System.out.println("2 - Depositar");
			break;
		case 3:
			System.out.println("3 - Verificar Saldo");
			break;
		default:
			System.out.println("Opção Inválida");
			break;
		}
	}
}
