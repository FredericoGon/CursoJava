package br.com.cursojava;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		double n1 = Double.parseDouble(entrada.nextLine());
		System.out.println("Digite outro n�mero: ");
		double n2 = Double.parseDouble(entrada.nextLine());
		System.out.println("Digite um n�mero: ");
		double n3 = Double.parseDouble(entrada.nextLine());
		entrada.close();
		double media = (n1+n2+n3)/3;
		System.out.println("A m�dia dos valores informados �: "+media);
	}
}
