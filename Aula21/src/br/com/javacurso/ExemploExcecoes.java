package br.com.javacurso;

import java.util.Scanner;

public class ExemploExcecoes {
	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		/*
		System.out.println("Digite um número: ");
		int numero = Integer.parseInt(teclado.nextLine());
		System.out.println("O número digitado foi: "+numero);
		
		*/
		try{
		String[] nomes = {"João", "Maria"};
		System.out.println(Integer.parseInt("blá"));
		System.out.println(nomes[2]);
		}catch(ArrayIndexOutOfBoundsException | NumberFormatException ex){
			System.out.println(ex.getMessage());
			System.out.println(ex.getCause());
			System.out.println(ex.getClass());
			System.out.println(ex);
			ex.printStackTrace();
			System.out.println("Você fez caquinha com array ou com número!");
		}
		System.out.println("Código running");
		teclado.close();
	}//main

}//class
