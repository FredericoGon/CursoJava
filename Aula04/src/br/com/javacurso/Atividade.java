package br.com.javacurso;

import java.util.Scanner;

public class Atividade {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual sua idade? ");
		int idade = Integer.parseInt(teclado.nextLine());
		teclado.close();
		if (idade >= 18){
			System.out.println("Voc� j� � grandinho!");
		}else if (idade >=16){
			System.out.println("Voc� � meio grandinho!");
		}else{
			System.out.println("Voc� n�o � grandinho!");
		}
	}

}
