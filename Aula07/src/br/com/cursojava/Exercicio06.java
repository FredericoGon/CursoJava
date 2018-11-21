package br.com.cursojava;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escreva uma frase: ");
		String frase = teclado.nextLine();
		teclado.close();
		for (int n=(frase.length())-1;n>=0;n--){
			System.out.printf("%s", frase.charAt(n));
		}//for
		
	}

}
