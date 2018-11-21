package br.com.javacurso;

import java.util.Scanner;

public class CadastroLanche {
	
	LancheController controller = new LancheController();
	
	public void mostrarMenu(Scanner teclado){
		int opcao = 0;
		do{
			System.out.println("/////////////////////////MENU INICIAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
			System.out.println("1 - Cadastrar lanche");
			System.out.println("2 - Listar lanche");
			System.out.println("3 - Listar lanche por nome");
			System.out.println("4 - Editar lanche");
			System.out.println("5 - Remover lanche");
			System.out.println("6 - Sair");
			opcao = Integer.parseInt(teclado.nextLine());
			tratarOpcao(opcao, teclado);
		}while(opcao!=6);
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
			buscarPorNome(teclado);
			break;
		case 4:
			atualizar(teclado);
			break;
		case 5:
			remover(teclado);
			break;
		case 6:
			System.out.println("Obrigado por usar os Sistemas da Fred Enterprises.");
			break;
		default:
			System.out.println("Opção Inválida.");
			
		}//switch

}

	private boolean inserir(Scanner teclado) {
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
		String resposta;
		do {
			System.out.println("O lanche é vegetariano?");
			resposta = teclado.nextLine();
		}while(!controller.validarResposta(resposta));
		boolean vegan = false;
		if(resposta.toUpperCase() =="SIM") {
			vegan = true;
		}
		if (controller.inserir(nome, preco, vegan)) {
			System.out.println("Cadastro efetuado com sucesso!");
		}else{
			System.out.println("  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!  ");
			System.out.println("  !!!!!!!!  Não foi possível adicionar o produto.  !!!!!!!!!!  ");
			System.out.println("  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!  ");
		}
	}//inserir
}
