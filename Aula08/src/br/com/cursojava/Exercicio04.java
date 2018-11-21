package br.com.cursojava;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] nome = new String[10];
		for (int i = 0;i<nome.length;i++){
			System.out.println("Digite o nome de alguém: ");
			nome[i] = teclado.nextLine();
		}//for
		teclado.close();
		for (int o = nome.length-1;o>0;o--){
			System.out.println(nome[o]);
		}//for

	}

}
