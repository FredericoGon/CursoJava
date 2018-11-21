package br.com.java;

import java.util.ArrayList;

public class ContatoController {
	
	private ContatoRepositorio repositorio = new ContatoRepositorio();
	
	public boolean adicionar(String codigo, String nome, String telefone, String email){
		boolean resultado = false;
		Contato contato = new Contato(null, codigo, nome, telefone, email);
				resultado = repositorio.inserirContato(contato);
		return resultado;
	}//adicionar
	
	public ArrayList<Contato> listarContatos(){
		return repositorio.buscarTodos();
	}//listarContatos

	//criar um metodo para a pesquisa por nome para tirar essa função do view
	//public ArrayList<Contato> pesquisaNome(String nome){
	//	ArrayList<Contato> todos = buscarTodos();
	//	ArrayList<Contato> lista = new ArrayList<>();
		
	//}
	
	public boolean nomeValido(String nome) {
		boolean valido = nome != null && !"".equals(nome.trim()) && nome.length()>=3;
		return valido;
	}

}//class
