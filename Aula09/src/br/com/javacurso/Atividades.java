package br.com.javacurso;

public class Atividades {
	
	public static void main(String[] args) {
		
		double[][] notasTurma = new double[3][5];
		double pontos[][] = new double[3][3];
		String[] nomes[] = new String[2][2];
		
		String[][] frutas = {{"Abacaxi","Amora","Ameixa"},{"Banana","Maça","Goiaba","Pessego" }};
		
		int[][] numeros = new int[3][];
		numeros[0] = new int[2];
		numeros[1] = new int[5];
		numeros[2] = new int[10];
		
		for(int i = 0; i<frutas.length;i++){//for1
			for(int j=0;j<frutas[i].length;j++){//for2
				System.out.printf("%s ", frutas[i][j]);
			}//for2
			System.out.println("");
		}//for1
		
		for(int[] linha: numeros){//for1
			for(int celula: linha){//for2
				System.out.printf("%d ", celula);
			}//for2
			System.out.println("");
		}//for1
		
		
		pontos[0][0] = 1;
		pontos[0][1] = 2;
		pontos[0][2] = 3;
		pontos[1][0] = 4;
		pontos[1][1] = 5;
		pontos[1][2] = 6;
		pontos[2][0] = 7;
		pontos[2][1] = 8;
		pontos[2][2] = 9;
		
		for(int i = 0; i<pontos.length;i++){//for1
			for(int j=0;j<pontos[i].length;j++){//for2
				System.out.printf("%.1f ", pontos[i][j]);
			}//for2
			System.out.println("");
		}//for1
		
		
	}//main
	
}//class
