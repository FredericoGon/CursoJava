package br.com.javacurso;

import java.util.List;

public class ProdutoController {
	
	RepositorioProduto repositorio = new ProdutoDAO();

	public boolean remover(int id) {
		repositorio.remover(id);
		boolean resultado = false;
		Produto validacao = repositorio.buscarPorId(id);
		if (validacao == null){
			resultado = true;
		}
		return resultado;
	}

	public List<Produto> buscarPorNome(String nome) {
		List<Produto> lista = repositorio.buscarPorNome(nome);
		return lista;
	}

	public List<Produto> buscarPorPreco(int minimo, int maximo) {
		List<Produto> lista = repositorio.buscarPorPreco(minimo, maximo);
		return lista;
	}

	public List<Produto> buscarTodos() {
		List<Produto> lista = repositorio.buscarTodos();
		return lista;
	}

	public void inserir(String nome, Double preco) {
		Produto produto = new Produto();
		produto.setNome(nome);
		produto.setPreco(preco);
		repositorio.inserir(produto);
	}

	public boolean validarNome(String nome) {
		boolean resultado = false;
		if (nome != null){
			resultado = true;
		}
		return resultado;
	}

	public boolean validarPreco(Double preco) {
		boolean resultado = false;
		if (preco > 0.01){
			resultado = true;
		}
		return resultado;
	}

	public void atualizar(int id, String nome, Double preco) {
		Produto produto = new Produto();
		produto.setId(id);
		produto.setNome(nome);
		produto.setPreco(preco);
		repositorio.atualizar(produto);
	}

	public boolean validarId(int id) {
		boolean resultado = false;
		Produto validacao = repositorio.buscarPorId(id);
		if(validacao != null){
			resultado = true;
		}
		return resultado;
	}

}
