package br.com.cursojava;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] notas = new int[5];
		//criar uma variável "maior" para comparar dentro do for
		for(int i = 0;i<notas.length;i++){
		System.out.println("Digite uma nota: ");
		notas[i] = Integer.parseInt(teclado.nextLine());
		}
		teclado.close();
		for (int i = 0;i<notas.length;i++){
		if (notas[i]>=notas[0] && notas[i]>=notas[1] && notas[i]>=notas[2] && notas[i]>=notas[3] && notas[i]>=notas[4]){
			System.out.println(notas[i] +i);
			}//if
		}//for
	}//main
}//class
