package br.com.cursojava;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("O pre�o do produto �: ");
		double preco = Double.parseDouble(teclado.nextLine());
		System.out.println("O valor do desconto em porcentagem � de: ");
		double desconto = Double.parseDouble(teclado.nextLine());
		teclado.close();
		double valorfinal = preco*((100-desconto)/100);
		System.out.println("O valor final � de R$"+valorfinal+" reais.");
		double descontofinal = preco - valorfinal;
		System.out.println("O desconto foi de R$"+descontofinal+" reais.");	
	}
}
