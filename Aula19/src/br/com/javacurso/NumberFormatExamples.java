package br.com.javacurso;

import java.text.NumberFormat;

public class NumberFormatExamples {
	
	public static void main(String[] args) {
		
		double numero2 = 2.0/3.0;
		double numero3 = 7.0/3.0;
		
		System.out.println(numero2);
		System.out.println(numero3);
		System.out.println(NumberFormat.getIntegerInstance().format(numero2));
		System.out.println(NumberFormat.getIntegerInstance().format(numero3));
		
	}
}
