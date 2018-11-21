package br.com.cursojava;

public class ProdutoRepositorio {

	private Produto[] produtos = new Produto[50];
	private int quantidade = 0;
	
	public boolean inserirProduto(Produto produto){
		boolean resultado = false;
		if(produto != null){
			if (quantidade < produtos.length){
				produtos[quantidade++] = produto;
				resultado = true;
			}//if inserir um else para avisar quando a array estiver cheia
		}//if
		return resultado;
	}//inserirProduto
	
	public Produto[] buscarTodos(){
		Produto[] resultado = new Produto[quantidade];
		for(int index = 0; index<quantidade;index++){
			resultado[index] = produtos[index];
		}//for
		return resultado;
	}//buscarTodos
	
	public boolean remover(int index){
		boolean resultado = false;
		if(index<quantidade && index > -1){
			produtos[index] = null;
			resultado = true;
		}//if
		return resultado;
	}//remover
	
}//class
