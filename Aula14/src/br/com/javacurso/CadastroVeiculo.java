package br.com.javacurso;

import java.util.Scanner;
import java.util.ArrayList;

public class CadastroVeiculo {
	
	VeiculoController controller = new VeiculoController();
	
	public void mostrarMenu(Scanner teclado){
		int opcao = 0;
		do{
			System.out.println("---------------------MENU INICIAL---------------------------");
			System.out.println("1 - Cadastrar ve�culo.");
			System.out.println("2 - Listar ve�culos.");
			System.out.println("3 - Pesquisar ve�culo por marca.");
			System.out.println("4 - Pesquisar ve�culo por modelo.");
			System.out.println("5 - Pesquisar ve�culo por placa.");
			System.out.println("6 - Pesquisar ve�culo por ano de fabrica��o.");
			System.out.println("7 - Remover ve�culo.");
			System.out.println("8 - Sair.");
			opcao = Integer.parseInt(teclado.nextLine());
			tratarOpcao(opcao, teclado);
		}while(opcao!=8);
	}//mostrarMenu

	private void tratarOpcao(int opcao, Scanner teclado) {
		switch(opcao){
		case 1:
			cadastrarVeiculos(teclado);
			break;
		case 2:
			listarVeiculos();
			break;
		case 3:
			pesquisarPorMarca(teclado);
			break;
		case 4:
			pesquisarPorModelo(teclado);
			break;
		case 5:
			pesquisarPorPlaca(teclado);
			break;
		case 6:
			pesquisarPorAnoFabricacao(teclado);
			break;
		case 7:
			remover(teclado);
			break;
		case 8:
			System.out.println("Obrigado por usar os Sistemas da Fred Enterprises.");
			break;
		default:
			System.out.println("Op��o Inv�lida.");
			
		}//switch
		
	}//tratarOpcao

	private void remover(Scanner teclado) {
		System.out.println("---------------------REMO��O---------------------------");
		System.out.println("Insira a ID do ve�culo que voc� deseja remover do sistema: ");
		int remocao = Integer.parseInt(teclado.nextLine());
		boolean remover = controller.remover(remocao);
		if(remover){
			System.out.println("Cadastro removido com sucesso.");
		}else{
			System.out.println("N�o foi poss�vel remover.");
		}//if else
	}//remover

	private void pesquisarPorAnoFabricacao(Scanner teclado) {
		System.out.println("---------------------LISTA DE VE�CULOS POR ANO DE FABRICA��O---------------------------");
		System.out.println("Insira o ano a ser pesquisada:");
		int pesquisa = Integer.parseInt(teclado.nextLine());
		Veiculo atual = null;
		ArrayList<Veiculo> lista = controller.listarPorAnoFabricacao(pesquisa);
		for (int i = 0;i<lista.size();i++){
			atual = lista.get(i);
			System.out.printf("%d - %s - %s - %s - %d - %d - %s \n", atual.getId(), atual.getMarca(), atual.getModelo(), atual.getPlaca(), atual.getAnoFabricacao(), atual.getAnoModelo(), atual.getCor());
		}	
	}

	private void pesquisarPorPlaca(Scanner teclado) {
		System.out.println("---------------------LISTA DE VE�CULOS POR PLACA---------------------------");
		System.out.println("Insira a placa a ser pesquisada:");
		String pesquisa = teclado.nextLine();
		Veiculo atual = null;
		ArrayList<Veiculo> lista = controller.listarPorPlaca(pesquisa);
		for (int i = 0;i<lista.size();i++){
			atual = lista.get(i);
			System.out.printf("%d - %s - %s - %s - %d - %d - %s \n", atual.getId(), atual.getMarca(), atual.getModelo(), atual.getPlaca(), atual.getAnoFabricacao(), atual.getAnoModelo(), atual.getCor());
		}
	}

	private void pesquisarPorModelo(Scanner teclado) {
		System.out.println("---------------------LISTA DE VE�CULOS POR MODELO---------------------------");
		System.out.println("Insira o modelo a ser pesquisada:");
		String pesquisa = teclado.nextLine();
		Veiculo atual = null;
		ArrayList<Veiculo> lista = controller.listarPorModelo(pesquisa);
		for (int i = 0;i<lista.size();i++){
			atual = lista.get(i);
			System.out.printf("%d - %s - %s - %s - %d - %d - %s \n", atual.getId(), atual.getMarca(), atual.getModelo(), atual.getPlaca(), atual.getAnoFabricacao(), atual.getAnoModelo(), atual.getCor());
		}
	}

	private void pesquisarPorMarca(Scanner teclado) {
		System.out.println("---------------------LISTA DE VE�CULOS POR MARCA---------------------------");
		System.out.println("Insira a marca a ser pesquisada:");
		String pesquisa = teclado.nextLine();
		Veiculo atual = null;
		ArrayList<Veiculo> lista = controller.listarPorMarca(pesquisa);
		for (int i = 0;i<lista.size();i++){
			atual = lista.get(i);
			System.out.printf("%d - %s - %s - %s - %d - %d - %s \n", atual.getId(), atual.getMarca(), atual.getModelo(), atual.getPlaca(), atual.getAnoFabricacao(), atual.getAnoModelo(), atual.getCor());
		}
		
	}

	private void listarVeiculos() {
		System.out.println("---------------------LISTA DE VE�CULOS---------------------------");
		Veiculo atual = null;
		ArrayList<Veiculo> lista = controller.listarVeiculos();
		for (int i = 0;i<lista.size();i++){
			atual = lista.get(i);
			System.out.printf("%d - %s - %s - %s - %d - %d - %s \n", atual.getId(), atual.getMarca(), atual.getModelo(), atual.getPlaca(), atual.getAnoFabricacao(), atual.getAnoModelo(), atual.getCor());
		}
	}

	private void cadastrarVeiculos(Scanner teclado) {
		System.out.println("---------------------CADASTRO---------------------------");
		String marca;
		do{
			System.out.println("Insira a marca: ");
			marca = teclado.nextLine();
		}while(!controller.validarMarca(marca));
		String modelo;
		do{
			System.out.println("Insira o modelo: ");
			modelo = teclado.nextLine();
		}while(!controller.validarMarca(modelo));
		String placa;
		do{
			System.out.println("Insira a placa: ");
			placa = teclado.nextLine();
		}while(!controller.validarPlaca(placa));
		int anoFabricacao;
		do{
			System.out.println("Insira o ano de fabrica��o: ");
			anoFabricacao = Integer.parseInt(teclado.nextLine());
		}while(!controller.validarAnoFabricacao(anoFabricacao));
		int anoModelo;
		do{
			System.out.println("Insira o ano do modelo: ");
			anoModelo = Integer.parseInt(teclado.nextLine());
		}while(!controller.validarAnoModelo(anoModelo, anoFabricacao));
		System.out.println("Insira a cor: ");
		String cor = teclado.nextLine();
		boolean cadastrar = controller.cadastrarVeiculos(marca, modelo, placa, anoFabricacao, anoModelo, cor);
		if (cadastrar){
			System.out.println("Cadastro efetuado com sucesso!");
		}else{
			System.out.println("  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!  ");
			System.out.println("  !!!!!!!!  N�o foi poss�vel adicionar o ve�culo.  !!!!!!!!!!  ");
			System.out.println("  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!  ");
		}
	}//cadastrarVeiculo

}//class
