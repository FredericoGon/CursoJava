package br.com.cursojava;

public class Atividades {
	public static void main(String[] args) {
		int[] numeros;
		String nomes[];
		numeros = new int[10]; //capacidade de 10
		nomes = new String[3];

		String[] frutas = {"Abacaxi", "Banana", "Pêssego"}; //a capacidade nesse caso é a quantidade de itens
		double[] medias = new double[3];
		int[] notas = new int[] {10,9,8,10,9,8};
		int[] notas2 = {10,9,8,10,9,8};// forma resumida da linha de cima
		
		int[] notas3 = new int[5];
		notas3 = new int[]{100}; //susbtitui a antiga array, perde a informação anterior
		//System.out.println(notas3.length);
		
		for(int index = 0; index < notas.length; index++){
			System.out.print(notas[index] + " ");
		}
		System.out.println();
		for(int atual:notas){
			System.out.print(atual +" ");
		}
		System.out.println();
		for(int i = 0;i<notas.length;i++){
			int atual = notas[i];
			System.out.print(atual+" ");
		}
		int y = new int[]{10,9,8,7}[1];
		//System.out.println(y);
		
		
		//curiosidade
		char i = "Fred".charAt(2);
		//System.out.println(i);
		
	}//main
}//class
