package br.com.cursojava;

import java.util.Scanner;

public class CadastroProdutos {
	
	private Produto[] produtos = new Produto[50];
	private int quantidade = 0;
	
	public void mostrarMenu(Scanner teclado){
		int opcao = 0;
		do{
			System.out.println("================ MENU PRINCIPAL	================");
			System.out.println("1 - Cadastrar Produto");
			System.out.println("2 - Listar Produtos");
			System.out.println("3 - Sair");
			opcao = Integer.parseInt(teclado.nextLine());
			tratarOpcao(opcao, teclado);
			
			
		} while(opcao != 3);
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
			System.out.println("Obrigado.");
			break;
		default:
			System.out.println("Opção inválida.");
		}//switch
	}//tratarOpcao

	private void listarProdutos() {
		System.out.println("================ LISTA DE PRODUTOS ================");
		Produto atual = null;
		for(int index = 0; index<quantidade; index++){
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
		Produto produto = new Produto();
		produto.setNome(nome);
		produto.setPreco(preco);
		if(quantidade < produtos.length){
			produtos[quantidade++] = produto;
		}else{
			System.out.println("Quantidade máxima de produtos. ");
		}
	}//cadastraProduto

}
