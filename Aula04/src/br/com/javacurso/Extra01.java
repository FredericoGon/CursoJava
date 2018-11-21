package br.com.javacurso;

import java.util.Scanner;

public class Extra01 {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a temperatura em Celsius: ");
		double tempC = Double.parseDouble(teclado.nextLine());
		teclado.close();
		double tempF = (tempC*1.8)+32;
		System.out.println("A temperatura em Fahrenheit é: "+tempF);
	}
}
