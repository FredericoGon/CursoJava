package br.com.cursojava;

import java.util.Scanner;

public class CadastroProdutos {
	
	

	private double n = 0;
	//private static final int = sair;
	ProdutoController controller = new ProdutoController();
	
	public void mostrarMenu(Scanner teclado){
		int opcao = 0;
		do{
			System.out.println("================ MENU PRINCIPAL	================");
			System.out.println("1 - Cadastrar Produto");
			System.out.println("2 - Listar Produtos");
			System.out.println("3 - Valor do Total de Produtos");
			System.out.println("4 - Listar produtos acima de determinado valor");
			System.out.println("5 - Sair");
			opcao = Integer.parseInt(teclado.nextLine());
			
			tratarOpcao(opcao, teclado);
			
			
		} while(opcao != 5);
	}//mostrarMenu
	
	private void tratarOpcao(int opcao, Scanner teclado){
		switch(opcao){
		case 1:
			cadastraProduto(teclado);
			break;
		case 2:
			listarProdutos();
			break;
		case 3:
			somarPrecos();
			break;
		case 4:
			listarFiltroAbaixo(teclado);
			break;
		case 5:
			System.out.println("Obrigado.");
			break;
		default:
			System.out.println("Opção inválida.");
		}//switch
	}//tratarOpcao


	private void listarFiltroAbaixo(Scanner teclado) {
		System.out.println("Informe um valor:  ");
		double precoMinimo = Double.parseDouble(teclado.nextLine());
		System.out.printf("================ LISTA DOS PRODUTOS ACIMA DE %.2f ================", n);
		System.out.println("");
		Produto[] produtos = controller.listarProdutosPorPrecoMinimo(precoMinimo);
		if(produtos != null && produtos.length > 0){
			for (Produto atual : produtos){
				System.out.printf("%.2f - %s \n", atual.getpreco(), atual.getNome());
			}
		}else{
			System.out.println("Não existem produtos com o preço mínimo informado");
		}
	}

	private void somarPrecos() {
		System.out.println("================ SOMA DOS PRODUTOS ================");
		double soma = controller.somaProdutos();
		System.out.printf("A soma dos preços de seus produtos cadastrados é: %.2f", soma);
		System.out.println("");
	}//SomarPrecos

	private void listarProdutos() {
		System.out.println("================ LISTA DE PRODUTOS ================");
		Produto atual = null;
		Produto[] produtos = controller.listarProdutos();
		for(int index = 0; index<produtos.length; index++){
			atual = produtos[index];
			System.out.printf("%d - %.2f - %s \n", index+1, atual.getpreco(), atual.getNome());
		}//for
		
	}//ListarProdutos

	private void cadastraProduto(Scanner teclado) {
		System.out.println("================ CADASTRO DE PRODUTOS ================");
		System.out.println("Informe o nome do produto: ");
		String nome = teclado.nextLine();
		System.out.println("Informe o preço do produto: ");
		double preco = Double.parseDouble(teclado.nextLine());
		boolean ok = controller.adicionar(nome, preco);
		if(ok){
			System.out.println("Produto adicionado com sucesso.");
		}else{
			System.out.println("Não foi possível adicionar o produto.");
		}//if ok
	}//cadastraProduto

}