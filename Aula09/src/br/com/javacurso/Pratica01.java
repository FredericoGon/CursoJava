package br.com.javacurso;

public class Pratica01 {
	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		matriz[0][0]=10;
		matriz[0][1]=9;
		matriz[0][2]=8;
		matriz[1][0]=7;
		matriz[1][1]=9;
		matriz[1][2]=10;
		matriz[2][0]=10;
		matriz[2][1]=7;
		matriz[2][2]=8;
		
		int soma=0;
		
		for (int i = 0;i<matriz.length;i++){
			soma += matriz[i][i];
						
		}//for
		System.out.println(soma);
	}//main
}//class
