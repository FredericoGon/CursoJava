package br.com.javacurso;

import java.util.List;
import java.util.Scanner;

public class CadastroProduto {
	
	ProdutoController controller = new ProdutoController();
	
	public void mostrarMenu(Scanner teclado){
		int opcao = 0;
		do{
			System.out.println("/////////////////////////MENU INICIAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
			System.out.println("1 - Cadastrar produto");
			System.out.println("2 - Listar produtos");
			System.out.println("3 - Listar produtos por faixa de preço");
			System.out.println("4 - Listar produtos por nome");
			System.out.println("5 - Editar produto");
			System.out.println("6 - Remover produto");
			System.out.println("7 - Sair");
			opcao = Integer.parseInt(teclado.nextLine());
			tratarOpcao(opcao, teclado);
		}while(opcao!=7);
	}

	private void tratarOpcao(int opcao, Scanner teclado) {
		switch(opcao){
		case 1:
			inserir(teclado);
			break;
		case 2:
			listarProdutos();
			break;
		case 3:
			buscarPorPreco(teclado);
			break;
		case 4:
			buscarPorNome(teclado);
			break;
		case 5:
			atualizar(teclado);
			break;
		case 6:
			remover(teclado);
			break;
		case 7:
			System.out.println("Obrigado por usar os Sistemas da Fred Enterprises.");
			break;
		default:
			System.out.println("Opção Inválida.");
			
		}//switch
		
	}

	private void remover(Scanner teclado) {
		System.out.println("---------------------REMOÇÃO---------------------------");
		System.out.println("Insira a ID do produto que você deseja remover do sistema: ");
		int id;
		do{
			System.out.println("Deve ser uma Id válida!");
			id = Integer.parseInt(teclado.nextLine());
		}while(!controller.validarId(id));
		controller.remover(id);
//		if(remover){
//			System.out.println("Cadastro removido com sucesso.");
//		}else{
//			System.out.println("Não foi possível remover.");
//		}//if else
	}

	private void atualizar(Scanner teclado) {
		System.out.println("---------------------EDIÇÃO---------------------------");
		System.out.println("Insira a ID do produto que você deseja editar: ");
		int id;
		do{
			System.out.println("Deve ser uma Id válida!");
			id = Integer.parseInt(teclado.nextLine());
		}while(!controller.validarId(id));
		String nome;
		do{
			System.out.println("Insira o novo nome do produto: ");
			nome = teclado.nextLine();
		}while(!controller.validarNome(nome));
		
		Double preco;
		do{
			System.out.println("Insira o novo preco do produto: ");
			preco = Double.parseDouble(teclado.nextLine());
		}while(!controller.validarPreco(preco));
		controller.atualizar(id, nome, preco);
		
	}

	private void buscarPorNome(Scanner teclado) {
		System.out.println("---------------------LISTA DE PRODUTOS POR NOME---------------------------");
		System.out.println("Insira o nome a ser pesquisada:");
		String nome = teclado.nextLine();
		Produto atual = null;
		List<Produto> lista = controller.buscarPorNome(nome);
		for (int i = 0;i<lista.size();i++){
			atual = lista.get(i);
			System.out.printf("%d - %s - %.2f \n", atual.getId(), atual.getNome(), atual.getPreco());
		}
	}

	private void buscarPorPreco(Scanner teclado) {
		System.out.println("---------------------LISTA DE PRODUTOS POR PRECO---------------------------");
		System.out.println("Insira o preço mínimo:");
		int minimo = Integer.parseInt(teclado.nextLine());
		System.out.println("Insira o preço máximo:");
		int maximo = Integer.parseInt(teclado.nextLine());
		Produto atual = null;
		List<Produto> lista = controller.buscarPorPreco(minimo, maximo);
		for (int i = 0;i<lista.size();i++){
			atual = lista.get(i);
			System.out.printf("%d - %s - %.2f \n", atual.getId(), atual.getNome(), atual.getPreco());
		}
	}

	private void listarProdutos() {
		System.out.println("---------------------LISTA DE produtos---------------------------");
		Produto atual = null;
		List<Produto> lista = controller.buscarTodos();
		for (int i = 0;i<lista.size();i++){
			atual = lista.get(i);
			System.out.printf("%d - %s - %.2f \n", atual.getId(), atual.getNome(), atual.getPreco());
		}
	}

	private void inserir(Scanner teclado) {
		System.out.println("---------------------CADASTRO---------------------------");
		String nome;
		do{
			System.out.println("Insira o nome do Produto: ");
			nome = teclado.nextLine();
		}while(!controller.validarNome(nome));
		
		Double preco;
		do{
			System.out.println("Insira o preco: ");
			preco = Double.parseDouble(teclado.nextLine());
		}while(!controller.validarPreco(preco));
		
		controller.inserir(nome, preco);
//		if (cadastrar){
//			System.out.println("Cadastro efetuado com sucesso!");
//		}else{
//			System.out.println("  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!  ");
//			System.out.println("  !!!!!!!!  Não foi possível adicionar o veículo.  !!!!!!!!!!  ");
//			System.out.println("  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!  ");
//		}	
	}
	

}
