package br.com.javacurso;

import java.util.Scanner;

public class Atividade {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual sua idade? ");
		int idade = Integer.parseInt(teclado.nextLine());
		teclado.close();
		if (idade >= 18){
			System.out.println("Você já é grandinho!");
		}else if (idade >=16){
			System.out.println("Você é meio grandinho!");
		}else{
			System.out.println("Você não é grandinho!");
		}
	}

}
