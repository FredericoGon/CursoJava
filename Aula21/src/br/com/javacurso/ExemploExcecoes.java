package br.com.javacurso;

import java.util.Scanner;

public class ExemploExcecoes {
	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		/*
		System.out.println("Digite um n�mero: ");
		int numero = Integer.parseInt(teclado.nextLine());
		System.out.println("O n�mero digitado foi: "+numero);
		
		*/
		try{
		String[] nomes = {"Jo�o", "Maria"};
		System.out.println(Integer.parseInt("bl�"));
		System.out.println(nomes[2]);
		}catch(ArrayIndexOutOfBoundsException | NumberFormatException ex){
			System.out.println(ex.getMessage());
			System.out.println(ex.getCause());
			System.out.println(ex.getClass());
			System.out.println(ex);
			ex.printStackTrace();
			System.out.println("Voc� fez caquinha com array ou com n�mero!");
		}
		System.out.println("C�digo running");
		teclado.close();
	}//main

}//class
