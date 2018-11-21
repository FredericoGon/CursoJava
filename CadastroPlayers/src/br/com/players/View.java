package br.com.players;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
	
	Control controller = new Control();
	
	int escolha = 0;

	public void menu(Scanner teclado) {

		do {
			System.out.println("=-=-=-=-=-=-=MENU=-=-=-=-=-=-=");
			System.out.println("1 - Cadastar Player.");
			System.out.println("2 - Listar Players.");
			System.out.println("3 - Pesquisar Player (Pop ID).");
			System.out.println("4 - Pesquisar Player (nome).");
			System.out.println("5 - Pesquisar Players (por cidade).");
			System.out.println("6 - Pesquisar Players (por estado).");
			System.out.println("7 - Excluir Player.");
			System.out.println("8 - Sair");
			escolha = Integer.parseInt(teclado.nextLine());
			handleEscolha(teclado);
		}while(escolha!=8);
	}//menu

	private void handleEscolha(Scanner teclado) {
		switch(escolha) {
		case 1:
			cadastrarPlayer(teclado);
			break;
		case 2:
			listarPlayers();
			break;
		case 3:
			pesquisaPop(teclado);
			break;
		case 4:
	
			break;
		case 5:
			
			break;
		case 6:
			
			break;
		case 7:
			excluir(teclado);
			break;
		case 8:
			System.out.println("Obrigado por usar um Sistema da Fred's Enterprise!");
			break;
		default:
			System.out.println("Escolha inválida!");
			break;
		
		}//switch
		
	}//handleEscolha

	private void excluir(Scanner teclado) {
		System.out.println("=-=-=-=-=-=EXCLUSÃO DE JOGADOR=-=-=-=-=-=-=");
		System.out.println("Qual o POP ID do jogador que deseja excluir?");
		String remocao = teclado.nextLine();
		boolean resultado = controller.excluir(remocao);
		if(resultado) {
			System.out.println("O player foi removido com sucesso!");
		}else {
			System.out.println("Não foi possível remover o jogador.");
		}
	}

	private void pesquisaPop(Scanner teclado) {
		System.out.println("Insira o POP ID que você deseja pesquisar: ");
		String pesquisa = teclado.nextLine();
		ArrayList<Player> lista = new ArrayList<>();
		lista = controller.pesquisaPop(pesquisa);
		Player atual = null;
		for (int i = 0;i<lista.size();i++) {
			atual = lista.get(i);
			System.out.printf("%s - %s - %s \n", atual.getNome(), atual.getPopId(), atual.getCategoria());
		}
	}

	private void listarPlayers() {
		ArrayList<Player> lista = new ArrayList<>();
		lista = controller.listarPlayers();
		Player atual = null;
		for (int i = 0;i<lista.size();i++) {
			atual = lista.get(i);
			System.out.printf("%s - %s - %s \n", atual.getNome(), atual.getPopId(), atual.getCategoria());
		}
	}

	private void cadastrarPlayer(Scanner teclado) {
		String nome = "";
		int diaNasc = 0;
		int mesNasc = 0;
		int anoNasc = 0;
		String popId = "";
		String rua = "";
		int numero = 0;
		String complemento = "";
		String bairro = "";
		String cidade = "";
		String estado = "";
		System.out.println("=-=-=-=-=-=-=-=CADASTRO DE PLAYERS=-=-=-=-=-=-=");
		do {
			System.out.println("Qual o nome do jogador?");
			nome = teclado.nextLine();
		}while(!controller.validacaoString(nome));
		do {
			System.out.println("Qual o DIA de nascimento do jogador?");
			diaNasc = Integer.parseInt(teclado.nextLine());
		}while(!controller.validacaoDia(diaNasc));
		do {
			System.out.println("Qual o MÊS de nascimento do jogador?");
			mesNasc = Integer.parseInt(teclado.nextLine());
		}while(!controller.validacaoMes(mesNasc));
		do {
			System.out.println("Qual o ANO de nascimento do jogador?");
			anoNasc = Integer.parseInt(teclado.nextLine());
		}while(!controller.validacaoAno(anoNasc));
		do {
			System.out.println("Qual o POP ID do jogador?");
			popId = teclado.nextLine();
		}while(!controller.validacaoString(popId));
		System.out.println("=-=-=-=-=-=-=-=ENDEREÇO=-=-=-=-=-=-=-=");
		do {
			System.out.println("Qual a rua do endereço do jogador?");
			rua = teclado.nextLine();
		}while(!controller.validacaoString(rua));
		do {
			System.out.println("Qual o número do endereço do jogador?");
			numero = Integer.parseInt(teclado.nextLine());
		}while(!controller.validacaoInt(numero));
		do {
			System.out.println("Qual o complemento do endereço do jogador?");
			complemento = teclado.nextLine();
		}while(!controller.validacaoString(complemento));
		do {
			System.out.println("Qual o bairro do endereço do jogador?");
			bairro = teclado.nextLine();
		}while(!controller.validacaoString(bairro));
		do {
			System.out.println("Qual a cidade do endereço do jogador?");
			cidade = teclado.nextLine();
		}while(!controller.validacaoString(cidade));
		System.out.println("Qual o estado do endereço do jogador?");
		estado = teclado.nextLine();
		boolean valido = controller.cadastrarPlayer(nome, diaNasc, mesNasc, anoNasc, popId, rua, numero, complemento, bairro, cidade, estado);
		if(valido) {
			System.out.println("Cadastro realizado com sucesso!");
		}else {
			System.out.println("Não foi possível realizar o cadastro!");
		}
	}
	

}//class
