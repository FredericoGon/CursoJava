package br.com.cursojava;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escreva uma frase: ");
		String frase = teclado.nextLine();
		teclado.close();
		for (int n=0;n<frase.length();n++){
			if (n%2!=0){
				System.out.printf("%s",frase.charAt(n));
			}//if
		}//for
	}

}
