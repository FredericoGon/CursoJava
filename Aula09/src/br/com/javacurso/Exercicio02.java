package br.com.javacurso;

public class Exercicio02 {
	public static void main(String[] args) {
		int[][] matriz = new int[3][4];
		//eixo x = meias camisas e camisetas
		//eixo y = meses
		matriz[0][0] = 100;
		matriz[0][1] = 75;
		matriz[0][2] = 150;
		matriz[0][3] = 50;
		matriz[1][0] = 200;
		matriz[1][1] = 260;
		matriz[1][2] = 200;
		matriz[1][3] = 210;
		matriz[2][0] = 150;
		matriz[2][1] = 100;
		matriz[2][2] = 250;
		matriz[2][3] = 240;
		int soma = 0;
		int vJan = 0;
		int vFev = 0;
		int vMar = 0;
		int vAbr = 0;
		int vMeias = 0;
		int vCamisas = 0;
		int vCamisetas = 0;
		for (int i = 0;i<matriz.length;i++){//for1
			for(int j = 0;j<matriz[i].length;j++){//for2
				soma = soma + matriz[i][j];
				if (j==0){
					vJan = vJan + matriz[i][j];
				}//ifJan
				if (j==1){
					vFev = vFev + matriz[i][j];
				}//ifFev
				if (j==2){
					vMar = vMar + matriz[i][j];
				}//ifMar
				if (j==3){
					vAbr = vAbr + matriz[i][j];
				}//ifAbr
				if (i==0){
					vMeias = vMeias + matriz[i][j];
				}//ifmeias
				if (i==1){
					vCamisas = vCamisas + matriz[i][j];
				}//ifcamisas
				if (i==2){
					vCamisetas = vCamisetas + matriz[i][j];
				}//ifcamisetas
			}//for2
		}//for1
		int janCC = matriz[1][0] + matriz[2][0];
		int fevCC = matriz[1][1] + matriz[2][1];
		int marCC = matriz[1][2] + matriz[2][2];
		int abrCC = matriz[1][3] + matriz[2][3];
		System.out.println("A quantida de de peças vendidas foi de: "+soma);
		System.out.println("As vendas de Janeiro foram: "+vJan);
		System.out.println("As vendas de Fevereiro foram: "+vFev);
		System.out.println("As vendas de Março foram: "+vMar);
		System.out.println("As vendas de Abril foram: "+vAbr);
		System.out.println("As vendas de meias foram: "+vMeias);
		System.out.println("As vendas de camisas foram: "+vCamisas);
		System.out.println("As vendas de camisetas foram: "+vCamisetas);
		System.out.println("O tipo de peça mais vendida foi: "+ Math.max(vMeias, Math.max(vCamisas, vCamisetas)));
		System.out.println("As vendas de Camisas e camisetas em Janeiros foi de: "+janCC);
		System.out.println("As vendas de Camisas e camisetas em Fevereiro foi de: "+fevCC);
		System.out.println("As vendas de Camisas e camisetas em Março foi de: "+marCC);
		System.out.println("As vendas de Camisas e camisetas em Abril foi de: "+abrCC);
	}

}
