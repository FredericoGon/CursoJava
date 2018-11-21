package br.com.java;

import java.util.ArrayList;

public class ContatoRepositorio {
	
	private ArrayList<Contato> contatos = new ArrayList<>();
	private int contagem = 1;
	
	public boolean inserirContato(Contato contato){
		boolean resultado = false;
		if(contato != null){
			contato.setId(contagem++);
			resultado = contatos.add(contato);
		}//if
		return resultado;
	}//inserirContato
	
	public ArrayList<Contato> buscarTodos(){
		return contatos;
	}//buscarTodos
}//class
