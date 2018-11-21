package br.com.cursojava;

public class Exercicio6 {
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		int c = 15;
		int resultado1 = Math.max(a, b);
		int resultado2 = Math.max(resultado1, c);
		System.out.println(resultado2);
	}
}
