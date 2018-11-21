package br.com.javacurso;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
	Control controller = new Control();

	public void mostrarMenu(Scanner teclado) {
		
		int escolha = 0;
		do {
			System.out.println("---------------MENU INICIAL---------------");
			System.out.println("1 - Cadastrar personagem. =D");
			System.out.println("2 - Excluir cadastro. =o");
			System.out.println("3 - Listar personagens cadastrados.;D");
			System.out.println("6 - Sair. =/");
			escolha = Integer.parseInt(teclado.nextLine());
			escolher(escolha, teclado);
		}while (escolha!=6);
	}

	private void escolher(int escolha, Scanner teclado) {
		switch(escolha) {
		case 1:
			cadastrarPersonagem(teclado);
			break;
		case 2:
			remover(teclado);
			break;
		case 3:
			listarPersonagens();
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		case 6:
			System.out.println("Thanks for using Fred's Enterprises.");
			break;
		default:
			System.out.println("Escolha inválida.");
			break;
		}
		
	}

	private void remover(Scanner teclado) {
		System.out.println("-------------------REMOVER-----------------");
		System.out.println("Qual a id do personagem que será removido?");
		int remocao = Integer.parseInt(teclado.nextLine());
		if (controller.remover(remocao)) {
			System.out.println("Personagem removido com sucesso!");
		}else {
			System.out.println("Não foi possível remover o personagem.");
		}//if
	}//remover

	private void listarPersonagens() {
		ArrayList<Modelo> lista = new ArrayList<>();
		lista = controller.listarPersonagens();
		Modelo atual = null;
		for (int i = 0;i<lista.size();i++) {
			atual = lista.get(i);
			System.out.printf("%s - %s - %d - %.2f \n", atual.getNome(), atual.getJob(), atual.getAttack(), atual.getRate());
		}//for
	}//listarPersonagens

	private void cadastrarPersonagem(Scanner teclado) {
		System.out.println("--------------CADASTRO DE PERSONAGEM-------------");
		System.out.println("Qual o nome do personagem?");
		String nome = teclado.nextLine();
		System.out.println("Qual a job do personagem?");
		String job = teclado.nextLine();
		System.out.println("Qual o ataque do personagem?");
		int attack = Integer.parseInt(teclado.nextLine());
		System.out.println("Qual a nota desse personagem?");
		double rate = Double.parseDouble(teclado.nextLine());
		
		if (controller.cadastrarPersonagem(nome, job, attack, rate)) {
			System.out.println("Personagem cadastrado com sucesso.");
		}else {
			System.out.println("Cadastro não efetuado!");
		}
		
	}
	
	

}
