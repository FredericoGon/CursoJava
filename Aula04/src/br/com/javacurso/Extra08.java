package br.com.javacurso;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Extra08 {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira uma ano: ");
		int anoi = Integer.parseInt(teclado.nextLine());
		//regra 1 - a cada 4 anos é
		//regra 2 - a cada 100 não é
		//regra 3 - a cada 400 é
		if (anoi%400==0){
			System.out.println("O ano "+anoi+" é bissexto.");
		}else{
			if (anoi%100==0){
				System.out.println("O ano "+anoi+" não é bissexto.");
			}else{
				if (anoi%4==0){
					System.out.println("O ano "+anoi+" é bissexto.");
					}else{
						System.out.println("O ano "+anoi+" não é bissexto.");
					}
			}
		}
	}

}
