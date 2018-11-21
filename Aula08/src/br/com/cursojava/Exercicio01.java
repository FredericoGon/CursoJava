package br.com.cursojava;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int[] notas = new int[10];
	for(int i=0;i<notas.length;i++){
		System.out.println("Digite uma nota: ");
		notas[i] = Integer.parseInt(teclado.nextLine());
		//soma+=notas[i]; assim não precisa fazer a soma separado
	}
	teclado.close();
	double media = (notas[0]+notas[1]+notas[2]+notas[3]+notas[4]+notas[5]+notas[6]+notas[7]+notas[8]+notas[9])/notas.length;
	// for para apresentar todas as notas
	System.out.println(notas[0]+" "+notas[1]+" "+notas[2]+" "+notas[3]+" "+notas[4]+" "+notas[5]+" "+notas[6]+" "+notas[7]+" "+notas[8]+" "+notas[9]);
	System.out.println(media);
	}
}
