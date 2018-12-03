package br.com.cursojava.contatos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RepositorioProduto {
	
	private static List<Produto>lista = new ArrayList<>();
	private static Integer count = 1;
	static{
		lista.add(new Produto(count++, "Carro", "Ele anda", 250));
		lista.add(new Produto(count++, "Avião", "Ele voa", 400));
		lista.add(new Produto(count++, "Moto", "Ela cai", 150));
		lista.add(new Produto(count++, "Busão", "Ele carrega", 300));
	}
	
	public List<Produto> buscarTodos(){
		return lista;
	}
	
	public Produto buscarPorId(Integer id){
		Produto produto = null;
		for (Produto atual : lista) {
			if(atual != null && id.equals(atual.getId())){
				produto = atual;
				break;
			}
		}
		return produto;
	}
	
	public boolean salvar(Produto produto){
		boolean resultado = false;
		if(produto != null){
			if(produto.getId() == null){
				resultado = inserir(produto);
			}else{
				resultado = atualizar(produto);
			}
		}
		return resultado;
	}
	
	private boolean atualizar(Produto produto) {
		boolean resultado = false;
		int idx = lista.indexOf(produto);
		if(idx > -1){
			lista.set(idx, produto);
			resultado = true;
		}
		return resultado;
	}
	
	private boolean inserir(Produto produto) {
		produto.setId(count++);
		return lista.add(produto);
	}
	
	public boolean remover(Integer id){
		int qt = lista.size();
		lista=lista.stream().filter(c -> !id.equals(c.getId())).collect(Collectors.toList());
		return qt > lista.size();
	}

}
