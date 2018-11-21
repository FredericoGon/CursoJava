package br.com.javacurso;

import java.util.ArrayList;

public class Pratica {
	
	public static void main(String[] args) {
		
		//definir uma lista de nomes
		ArrayList<String> listaNomes = new ArrayList();
		
		//quantos elementos tem na lista?
		int quantidadeInicial = listaNomes.size();
		System.out.println(quantidadeInicial);
		
		//Adicionar elementos
		listaNomes.add("Jo�o");
		listaNomes.add("Jo�o");
		listaNomes.add("Jo�o");
		
		System.out.println(listaNomes.size());
		listaNomes.add("Maria");
		System.out.println(listaNomes.size());
		System.out.println(listaNomes);
		
		listaNomes.add(0, "Ad�o");
		System.out.println(listaNomes);
		listaNomes.add(0, "Eva");
		System.out.println(listaNomes);
		
		//trocar ou alterar elemento da lista
		listaNomes.set(1, "Ad�o e o p� de feij�o");
		System.out.println(listaNomes);
		
		//buscar elemento da lista
		System.out.println(listaNomes.get(2));
		System.out.println(listaNomes.get(3));
		
		//remover elemento da lista
		System.out.println(listaNomes.remove(1));
		System.out.println(listaNomes);
		System.out.println(listaNomes.remove("Jo�o"));		
		System.out.println(listaNomes);	
		System.out.println(listaNomes.remove("Jo�o"));
		System.out.println(listaNomes);
		
		//buscar pelo conte�do
		System.out.println(listaNomes.indexOf("Maria"));
		
		
		
	}//main
}//class
