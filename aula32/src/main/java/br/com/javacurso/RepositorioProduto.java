package br.com.javacurso;

import java.util.List;

public interface RepositorioProduto {
	
	public List<Produto> buscarTodos();
	public List<Produto> buscarPorNome(String nome);
	public List<Produto> buscarPorPreco(double minimo, double maximo);
	public Produto buscarPorId(Integer id);
	public boolean inserir(Produto produto);
	public boolean atualizar(Produto produto);
	public boolean remover(Integer id);
	public int contar();

}
