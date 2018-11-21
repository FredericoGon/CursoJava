package br.com.cursojava;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual sua idade? ");
		int idade = Integer.parseInt(teclado.nextLine());
		teclado.close();
		int resultado = idade + 20;
		System.out.println("Sua idade daqui à 20 anos será:"+resultado);
	}

}
