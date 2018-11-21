package br.com.cursojava;

import java.util.Scanner;

public class AppNotas {
	
	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		Scanner teclado = new Scanner(System.in);
		for (int i = 0;i<matriz.length;i++) {
			String f= String.valueOf(i+1);
			alunos(f);
			System.out.printf("Referente ao Aluno %s - ", f);
			double soma = 0;
			for (int j = 0;j<matriz[i].length;j++) {
				System.out.printf("Insira a nota %d : ", j+1);
				matriz[i][j]=Integer.parseInt(teclado.nextLine());
				System.out.printf("A nota inserida foi %d .", matriz[i][j]);
				System.out.println("");
				soma = soma + matriz[i][j];
			}//for2
			double media = soma/matriz[i].length;
			String g= String.valueOf(i+1);
			alunos(g);
			System.out.printf("A média do aluno %s foi %.2f.", f, media);
			System.out.println("");
		}//for1
		teclado.close();
	}

	static void alunos(String f) {
		switch(f) {
		case "1":
			f = "Abel";
			break;
		case "2":
			f = "Beto";
			break;
		case "3":
			f = "Caio";
			break;
		case "4":
			f = "Duda";
			break;
		case "5":
			f = "Emil";
			break;
		case "6":
			f = "Fred";
			break;
	}//switch
	}

}
