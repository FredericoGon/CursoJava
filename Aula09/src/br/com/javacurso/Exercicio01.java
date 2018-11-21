package br.com.javacurso;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		int[][] matriz = new int[10][3];
		//tranformar a parte de escrever em um for
		Scanner teclado = new Scanner(System.in);
		System.out.println("Nota 1 do Abel: ");
		matriz[0][0] = Integer.parseInt(teclado.nextLine());
		System.out.println("Nota 2 do Abel: ");
		matriz[0][1] = Integer.parseInt(teclado.nextLine());
		System.out.println("Nota 3 do Abel: ");
		matriz[0][2] = Integer.parseInt(teclado.nextLine());
		System.out.println("Nota 1 do Beto: ");
		matriz[1][0] = Integer.parseInt(teclado.nextLine());
		System.out.println("Nota 2 do Beto: ");
		matriz[1][1] = Integer.parseInt(teclado.nextLine());
		System.out.println("Nota 2 do Beto: ");
		matriz[1][2] = Integer.parseInt(teclado.nextLine());
		System.out.println("Nota 1 do Caio: ");
		matriz[2][0] = Integer.parseInt(teclado.nextLine());
		System.out.println("Nota 2 do Caio: ");
		matriz[2][1] = Integer.parseInt(teclado.nextLine());
		System.out.println("Nota 3 do Caio: ");
		matriz[2][2] = Integer.parseInt(teclado.nextLine());
		System.out.println("Nota 1 do Dedo: ");
		matriz[3][0] = Integer.parseInt(teclado.nextLine());
		System.out.println("Nota 2 do Dedo: ");
		matriz[3][1] = Integer.parseInt(teclado.nextLine());
		System.out.println("Nota 3 do Dedo: ");
		matriz[3][2] = Integer.parseInt(teclado.nextLine());
		System.out.println("Nota 1 do Emil: ");
		matriz[4][0] = Integer.parseInt(teclado.nextLine());
		System.out.println("Nota 2 do Emil: ");
		matriz[4][1] = Integer.parseInt(teclado.nextLine());
		System.out.println("Nota 3 do Emil: ");
		matriz[4][2] = Integer.parseInt(teclado.nextLine());
		System.out.println("Nota 1 do Fred: ");
		matriz[5][0] = Integer.parseInt(teclado.nextLine());
		System.out.println("Nota 2 do Fred: ");
		matriz[5][1] = Integer.parseInt(teclado.nextLine());
		System.out.println("Nota 3 do Fred: ");
		matriz[5][2] = Integer.parseInt(teclado.nextLine());
		System.out.println("Nota 1 do Guto: ");
		matriz[6][0] = Integer.parseInt(teclado.nextLine());
		System.out.println("Nota 2 do Guto: ");
		matriz[6][1] = Integer.parseInt(teclado.nextLine());
		System.out.println("Nota 3 do Guto: ");
		matriz[6][2] = Integer.parseInt(teclado.nextLine());
		System.out.println("Nota 1 do Hugo: ");
		matriz[7][0] = Integer.parseInt(teclado.nextLine());
		System.out.println("Nota 2 do Hugo: ");
		matriz[7][1] = Integer.parseInt(teclado.nextLine());
		System.out.println("Nota 3 do Hugo: ");
		matriz[7][2] = Integer.parseInt(teclado.nextLine());
		System.out.println("Nota 1 do Iago: ");
		matriz[8][0] = Integer.parseInt(teclado.nextLine());
		System.out.println("Nota 2 do Iago: ");
		matriz[8][1] = Integer.parseInt(teclado.nextLine());
		System.out.println("Nota 3 do Iago: ");
		matriz[8][2] = Integer.parseInt(teclado.nextLine());
		System.out.println("Nota 1 do Juco: ");
		matriz[9][0] = Integer.parseInt(teclado.nextLine());
		System.out.println("Nota 2 do Juco: ");
		matriz[9][1] = Integer.parseInt(teclado.nextLine());
		System.out.println("Nota 3 do Juco: ");
		matriz[9][2] = Integer.parseInt(teclado.nextLine());
		teclado.close();
		double soma = 0;
		for (int i = 0;i<matriz.length;i++){
			//aqui colocar um syso com o nome do aluno
			int temp = 0;
			for(int j = 0;j<matriz[i].length;j++){
				//aqui colocar um syso com as notas dele
				soma = soma + matriz[i][j];
				temp = temp + matriz[i][j];
			}//for2
			double mediaA = temp/matriz[0].length;
			System.out.printf("As notas do aluno %d foram "+matriz[i][0] +" "+ matriz[i][1] +" "+ matriz[i][2]+". ", i);
			System.out.printf("A media do aluno %d foi "+"%.1f. \n", i, mediaA);
		}//for1
		System.out.println("");
		double media = (soma/(matriz.length*matriz[0].length));
		System.out.printf("A média da turma é: %.4f",media);

	}
}
