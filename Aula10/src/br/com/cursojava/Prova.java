package br.com.cursojava;

import java.util.Scanner;

public class Prova {
	public static void main(String[] args) {
		//Inicio do Cabeçalho
		String[][] matriz = new String[3][3];
		matriz[0][0] = "1";
		matriz[0][1] = "2";
		matriz[0][2] = "3";
		matriz[1][0] = "4";
		matriz[1][1] = "5";
		matriz[1][2] = "6";
		matriz[2][0] = "7";
		matriz[2][1] = "8";
		matriz[2][2] = "9";
		System.out.println("Vamos iniciar um jogo da velha, considere onde houver números como espaços vazios: ");
		for (int i = 0;i<matriz.length;i++){
			for(int j = 0;j<matriz[i].length;j++){
				System.out.printf("%s ", matriz[i][j]);
			}//for2
			System.out.println("");
		}//for1

		Boolean winCon = false;
		String jX = "f";
		String jO = "g";
		//Fim do Cabeçalho
		//inserir o desenho
		for (int p = 1;winCon==false;p++){
			Scanner teclado = new Scanner(System.in);
			if (p%2!=0){
				System.out.println("Jogador 1, você controla o \"X\", escolha em que posição você quer fazer sua primeira jogada: ");
				jX = teclado.nextLine();
			}else{
				System.out.println("Jogador 2, você controla o \"O\", escolha em que posição você quer fazer sua primeira jogada: ");
				jO = teclado.nextLine();
			}//if player par ou impar
			for (int i = 0;i<matriz.length && winCon==false;i++){
				for(int j = 0;j<matriz[i].length && winCon==false;j++){
					if (jX.equals(matriz[i][j])){
						matriz[i][j] = "X";
					}//if
					if (jO.equals(matriz[i][j])){
						matriz[i][j] = "O";
					}//if
					
					if (matriz[0][0].equals("X") && matriz[0][1].equals("X") && matriz[0][2].equals("X")){ // Inicio da winCon
						System.out.println("O Jogador X ganhou");
						winCon = true;
						break;
					} else if (matriz[0][0].equals("X") && matriz[1][0].equals("X") && matriz[2][0].equals("X")) {
						System.out.println("O Jogador X ganhou");
						winCon = true;
						break;
					} else if (matriz[0][2].equals("X") && matriz[1][2].equals("X") && matriz[2][2].equals("X")) {
						System.out.println("O Jogador X ganhou");
						winCon = true;
						break;
					} else if (matriz[0][2].equals("X") && matriz[1][1].equals("X") && matriz[2][0].equals("X")) {
						System.out.println("O Jogador X ganhou");
						winCon = true;
						break;
					} else if (matriz[0][0].equals("X") && matriz[1][1].equals("X") && matriz[2][2].equals("X")) {
						System.out.println("O Jogador X ganhou");
						winCon = true;
						break;
					} else if (matriz[2][0].equals("X") && matriz[2][1].equals("X") && matriz[2][2].equals("X")) {
						System.out.println("O Jogador X ganhou");
						winCon = true;
						break;
					}else if (matriz[0][0].equals("O") && matriz[0][1].equals("O") && matriz[0][2].equals("O")){
						System.out.println("O Jogador O ganhou");
						winCon = true;
						break;
					} else if (matriz[0][0].equals("O") && matriz[1][0].equals("O") && matriz[2][0].equals("O")) {
						System.out.println("O Jogador O ganhou");
						winCon = true;
						break;
					} else if (matriz[0][2].equals("O") && matriz[1][2].equals("O") && matriz[2][2].equals("O")) {
						System.out.println("O Jogador O ganhou");
						winCon = true;
						break;
					} else if (matriz[0][2].equals("O") && matriz[1][1].equals("O") && matriz[2][0].equals("O")) {
						System.out.println("O Jogador O ganhou");
						winCon = true;
						break;
					} else if (matriz[0][0].equals("O") && matriz[1][1].equals("O") && matriz[2][2].equals("O")) {
						System.out.println("O Jogador O ganhou");
						winCon = true;
						break;
					} else if (matriz[2][0].equals("O") && matriz[2][1].equals("O") && matriz[2][2].equals("O")) {
						System.out.println("O Jogador O ganhou");
						winCon = true;
						break;
					}//Fim da winCon
					if (!matriz[0][0].equals("1") && !matriz[0][1].equals("2") && !matriz[0][2].equals("3") && !matriz[1][0].equals("4") && !matriz[1][1].equals("5") && !matriz[1][2].equals("6") && !matriz[2][0].equals("7") && !matriz[2][1].equals("8") && !matriz[2][2].equals("9")){ //outOfMoves
						System.out.println("");
						System.out.println("O jogo acabou sem vitória!");
						winCon = true;
						break;
					}//Fim outOfMoves
					System.out.printf("%s ", matriz[i][j]);
				}//for2
				System.out.println("");
			}//for1
		
		}//for TUDO
		System.out.println("O jogo acabou!");
	}//main

}//class
