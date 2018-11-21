package br.com.cursojava;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Primeira nota: ");
		double n1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Segunda nota: ");
		double n2 = Double.parseDouble(teclado.nextLine());
		System.out.println("Terceira nota: ");
		double n3 = Double.parseDouble(teclado.nextLine());
		teclado.close();
		double media = (n1+n2+n3)/3;
		double maior = Math.max(n1, (Math.max(n2, n3)));
		double menor = Math.min(n1, (Math.min(n2, n3)));
		System.out.println("A média das 3 notas é: "+media);
		System.out.println("A maior nota é: "+maior);
		System.out.println("A menos nota é: "+menor);
		
	}

}
