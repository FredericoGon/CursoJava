package br.com.cursojava;

import java.util.Arrays;

public class ProdutoController {
	
	private ProdutoRepositorio repositorio = new ProdutoRepositorio();
	
	public boolean adicionar(String nome, double preco){
		boolean resultado = false;
		if(nome != null && !"".equals(nome.trim()) && preco >= 0.01){
			Produto produto = new Produto();
			produto.setNome(nome);
			produto.setPreco(preco);
			resultado = repositorio.inserirProduto(produto);
		}//if
		return resultado;
	}//adicionar
	
	public Produto getProdutoAt(int index){
		Produto[] produtos = repositorio.buscarTodos();
		Produto resultado = null;
		if(index>-1 && index<produtos.length){
			resultado = produtos[index];
		}//if
		return resultado;
	}//getProdutoAt
	
	public Produto[] listarProdutos(){
		return repositorio.buscarTodos();
	}//listarProdutos
	
	public Produto[] listarProdutosPorPrecoMinimo(double precoMinimo){
		Produto[] lista = repositorio.buscarTodos();
		Produto[] listaComPrecoMinimo = new Produto[lista.length];
		int quantidade = 0;
		for (Produto produto : lista){
			if(produto.getpreco()>= precoMinimo){
				listaComPrecoMinimo[quantidade++] = produto;
			}//if
		}//for
		listaComPrecoMinimo = Arrays.copyOf(listaComPrecoMinimo, quantidade);
		return listaComPrecoMinimo;
	}//listarProdutosPorPrecoMinimo
	
	public double somaProdutos(){
		double soma = 0;
		for (Produto produto : repositorio.buscarTodos()){
			soma+= produto.getpreco();
			}//for
		return soma;
	}//somaProdutos
	
	public boolean removerProduto(int index){
		return repositorio.remover(index);
	}//removerProduto

}//class
