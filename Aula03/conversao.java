package br.com.cursojava;

import java.util.Scanner;

public class conversao {
	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		String n1 = teclado.nextLine();
		int numero1 = Integer.parseInt(n1);
		System.out.println("Digite outro n�mero: ");
		int numero2 = Integer.parseInt(teclado.nextLine());
		System.out.println("Bl�: "+(numero1 + numero2));
		System.out.println("Digite um n�mero n�o inteiro: ");
		double preco = Double.parseDouble(teclado.nextLine());
		double desconto = 0.10;
		System.out.println("Desconto �: "+(preco*desconto));
		
		teclado.close();
		
	}
}
