package br.com.javacurso;

import java.util.Scanner;

public class Extra03 {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira tempo em segundos: ");
		int input = Integer.parseInt(teclado.nextLine());
		// 1 ano = 12 meses = 31104000
		// 1 mes = 30 dias = 2592000
		// 1 dias = 24 horas = 86400
		// 1 hora = 60 minutos = 3600 segundos
		// 1 minuto = 60 segundos
		int anos = (int)input/31104000;
		// System.out.println(anos);
		int meses = (int)(input%3110400)/2592000;
		// System.out.println(meses);
		int dias = (int)(input%2592000)/86400;
		// System.out.println(dias);
		int horas = (int)(input%86400)/3600;
		// System.out.println(horas);
		int minutos = (int)(input%3600)/60;
		// System.out.println(minutos);
		int segundos = (int)input%60;
		// System.out.println(segundos);
		System.out.println(input+" segundos equivalem a: "+anos+" anos, "+meses+" meses, "+dias+" dias, "+horas+" horas, "+minutos+" minutos, e "+segundos+" segundos.");
	}
}
