package br.com.javacurso;

import java.util.Scanner;

public class Extra04 {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira a primeira nota: ");
		double n1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Insira a segunda nota: ");
		double n2 = Double.parseDouble(teclado.nextLine());
		System.out.println("Insira a terceira nota: ");
		double n3 = Double.parseDouble(teclado.nextLine());
		teclado.close();
		double media = (n1+n2+n3)/3;
		System.out.println("A média é: "+media);
	}

}
