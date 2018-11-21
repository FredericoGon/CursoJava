package br.com.cursojava;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual seu peso? ");
		double peso = Double.parseDouble(teclado.nextLine());
		System.out.println("Qual sua altura em metros? ");
		double altura = Double.parseDouble(teclado.nextLine());
		teclado.close();
		double imc = peso/(altura*altura);
		System.out.println("Seu IMC é: "+imc);
	}
}
