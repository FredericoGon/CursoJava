package br.com.javacurso;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Extra08 {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira uma ano: ");
		int anoi = Integer.parseInt(teclado.nextLine());
		//regra 1 - a cada 4 anos �
		//regra 2 - a cada 100 n�o �
		//regra 3 - a cada 400 �
		if (anoi%400==0){
			System.out.println("O ano "+anoi+" � bissexto.");
		}else{
			if (anoi%100==0){
				System.out.println("O ano "+anoi+" n�o � bissexto.");
			}else{
				if (anoi%4==0){
					System.out.println("O ano "+anoi+" � bissexto.");
					}else{
						System.out.println("O ano "+anoi+" n�o � bissexto.");
					}
			}
		}
	}

}
