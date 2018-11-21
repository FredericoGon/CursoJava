package br.com.javacurso;

import java.util.Scanner;

public class Extra05 {
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
		if (media >= 7){
			System.out.println("Esse aluno foi aprovado.");
		}else{
			System.out.println("Esse aluno não foi aprovado.");
		}
	}

}
