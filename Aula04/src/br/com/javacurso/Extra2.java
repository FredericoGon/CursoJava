package br.com.javacurso;

import java.util.Scanner;

public class Extra2 {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira o valor do raio: ");
		double raio = Double.parseDouble(teclado.nextLine());
		teclado.close();
		double area = Math.PI*(raio*raio);
		System.out.println(area);
	}
}
