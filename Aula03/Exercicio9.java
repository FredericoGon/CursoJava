package br.com.cursojava;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Primeira nota: ");
		double n1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Segunda nota: ");
		double n2 = Double.parseDouble(teclado.nextLine());
		System.out.println("Terceira nota: ");
		double n3 = Double.parseDouble(teclado.nextLine());
		teclado.close();
		double media = ((n1*2)+(n2*3)+(n3*5))/10;
		System.out.println(media);
	}

}
