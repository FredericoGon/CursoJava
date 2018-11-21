package br.com.cursojava;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		int opcao = -1;
		while (opcao != 4){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escolha uma das seguintes opções: 1 - Cadastrar Aluno; 2 - Cadastrar Professor; 3 - Cadastrar Turma; 4 - Sair");
		int n = Integer.parseInt(teclado.nextLine());
		
		switch(opcao){
		case 1:
			System.out.println("Escolheu a opção Cadastrar Aluno.");
			break;
		case 2:
			System.out.println("Escolheu a opção Cadastrar Professor.");
			break;
		case 3:
			System.out.println("Escolheu a opção Cadastrar Turma.");
			break;
		case 4:
			System.out.println("Escolheu a opção Sair.");
			break;
		default:
			System.out.println("Opção inválida.");
			break;
		}
		teclado.close();
		}
		
			
	}

}
