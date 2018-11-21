package br.com.java;

import java.util.Scanner;
import java.util.ArrayList;

public class CadastroContatos {
	
	private static final int SAIR = 5;
	ContatoController controller = new ContatoController();
	
	public void mostrarMenu(Scanner teclado){
		int opcao = 0;
		do{
			System.out.println(" ------------- MENU INICIAL -------------- ");
			System.out.println("1 - Cadastrar contato;");
			System.out.println("2 - Listar contatos;");
			System.out.println("3 - Pesquisar por nome;");
			System.out.println("4 - Pesquisar por telefone;");
			System.out.println("5 - Sair.");
			opcao = Integer.parseInt(teclado.nextLine());
			trataoOpcao(opcao, teclado);
			
		}while(opcao!=SAIR);
	}//Menu

	private void trataoOpcao(int opcao, Scanner teclado) {
		switch(opcao){
		case 1:
			cadastrarContato(teclado);
			break;
		case 2:
			listarContatos();
			break;
		case 3:
			pesquisarNome(teclado);
			break;
		case 4:
			pesquisarTelefone(teclado);
			break;
		case SAIR:
			System.out.println("Obrigado por usar o sistema da Fred Company Indutries.");
			break;
		default:
			System.out.println("Opção inválida!");
		}//switch
	}//trataropcao

	private void pesquisarTelefone(Scanner teclado) {
		System.out.println("---------------------PESQUISA DE TELEFONE-----------------------");
		System.out.println("Insira um telefone que você quer pesquisar: ");
		String pesquisa = teclado.nextLine();
		System.out.println("Você escolheu pesquisar por: "+pesquisa);
		Contato atual = null;
		ArrayList<Contato> lista = controller.listarContatos();
		for (int i = 0;i<lista.size();i++){
			atual = lista.get(i);
			if (atual.getTelefone().equals(pesquisa)){
				System.out.printf("id: %d - %s - %s - %s \n", i, atual.getNome(), atual.getTelefone(), atual.getEmail());
			}
			//System.out.printf("id: %d - %s - %s - %s \n", i, atual.getNome(), atual.getTelefone(), atual.getEmail());			
		}//for
		
	}

	private void pesquisarNome(Scanner teclado) {
		System.out.println("---------------------PESQUISA DE NOME-----------------------");
		System.out.println("Insira um nome que você quer pesquisar: ");
		String pesquisa = teclado.nextLine();
		System.out.println("Você escolheu pesquisar por: "+pesquisa);
		Contato atual = null;
		ArrayList<Contato> lista = controller.listarContatos();
		for (int i = 0;i<lista.size();i++){
			atual = lista.get(i);
			if (atual.getNome().startsWith(pesquisa)){
				System.out.printf("id: %d - %s - %s - %s \n", i, atual.getNome(), atual.getTelefone(), atual.getEmail());
			}
			//System.out.printf("id: %d - %s - %s - %s \n", i, atual.getNome(), atual.getTelefone(), atual.getEmail());			
		}//for
		
	}

	private void listarContatos() {
		System.out.println("--------------------LISTA DE CONTATOS-----------------------");
		Contato atual = null;
		ArrayList<Contato> lista = controller.listarContatos();
		for (int i = 0;i<lista.size();i++){
			atual = lista.get(i);
			System.out.printf("id: %d - %s - %s - %s - %s \n", atual.getId(), atual.getNome(), atual.getTelefone(), atual.getEmail(), atual.getCodigo());			
		}//for
		
	}//listarContatos

	private void cadastrarContato(Scanner teclado) {
		System.out.println("------------------- CADASTRO DE CONTATO --------------------");
		String nome;
		do{	
			System.out.println("Insira um nome do contato:");
			nome = teclado.nextLine();
		}while(!controller.nomeValido(nome));
		System.out.println("Insira o telefone do contato:");
		String telefone = teclado.nextLine();
		System.out.println("Insira o email do contato:");
		String email = teclado.nextLine();
		System.out.println("Insira o código do contato:");
		String codigo = teclado.nextLine();
		boolean ok = controller.adicionar(codigo, nome, telefone, email);
		if(ok){
			System.out.println("Contato adicionado com sucesso.");
		}else{
			System.out.println("  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!  ");
			System.out.println("  !!!!!!!!  Não foi possível adicionar o contato.  !!!!!!!!!!  ");
			System.out.println("  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!  ");
			System.out.println("O nome deve ter pelo menos 3 caracteres e não pode ser em branco.");
		}//if ok
	}

}
