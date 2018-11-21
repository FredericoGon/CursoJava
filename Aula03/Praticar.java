package br.com.cursojava;

import java.util.Scanner;

public class Praticar {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira o primeira número: ");
		double n1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Insira o segundo número: ");
		double n2 = Double.parseDouble(teclado.nextLine());
		System.out.println("Escolha a sua operasção desejada: 1)Adição; 2)Subtração; 3)Multiplicação; 4)Divisão. ");
		int operacao = Integer.parseInt(teclado.nextLine());
		teclado.close();
		if (operacao == 1){
			double resultado = n1 + n2;
			System.out.println(resultado);
		}else if (operacao == 2){
			double resultado = n1 - n2;
			System.out.println(resultado);
		}else if (operacao == 3){
			double resultado = n1*n2;
			System.out.println(resultado);
		}else if (operacao == 4){
			double resultado = n1/n2;
			System.out.println(resultado);
		}else {
			System.out.println("Try again!");
		}
	}
}
