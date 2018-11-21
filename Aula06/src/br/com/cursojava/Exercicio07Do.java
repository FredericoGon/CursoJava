package br.com.cursojava;

import java.util.Scanner;

public class Exercicio07Do {
	public static void main(String[] args) {
		int opcao = 0;
		while (opcao != 4){
			System.out.println("1 - Cadastrar Aluno");
			System.out.println("2 - Cadastrar Professor");
			System.out.println("3 - Cadastrar Turma");
			System.out.println("4 - Sair");
			opcao = Integer.parseInt(teclado.nextLine());
			switch(opcao){
			case 1:
				System.out.println("Escolheu a opção Cadastrar Aluno");
				break;
			case 2:
				System.out.println("Escolheu a opção Cadastrar Professor");
				break;
			case 3:
				System.out.println("Escolheu a opção Cadastrar Turma");
				break;
			case 4:
				System.out.println("Escolheu a opção Cadastrar Turma");
				break;
			}
			//Scanner teclado = new Scanner(System.in);
		
		} // while
	}// main
}//class
