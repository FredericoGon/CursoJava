package br.com.javacurso;

import java.util.Scanner;

public class Extra07 {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira um n�mero: ");
		double n1 = Double.parseDouble(teclado.nextLine());
		teclado.close();
		double resultado = n1*1.15;
		System.out.println("O n�mero inserido acrescido de 15% �: "+resultado);
	}

}
