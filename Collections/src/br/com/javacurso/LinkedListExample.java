package br.com.javacurso;

import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String[] args) {
		LinkedList<String> nomes = new LinkedList<String>();
		
		nomes.add("Fred");
		nomes.add("Frederico");
		nomes.add("Fred�o");
		nomes.add("Fredonho");
		
		System.out.println("Esta � nossa lista: "+nomes);
		
		System.out.println("Esse � o tamanho da nossa lista: "+nomes.size());
		
		System.out.println("Esse � o primeiro nome: "+nomes.get(0));
		
		if(nomes.contains("Fredonho")) {
			System.out.println("Fredonho faz parte da lista.");
		}else {
			System.out.println("Fredonho n�o faz parte da lista.");
		}
		
		if (nomes.remove("Fred�o")) {
			System.out.println("Fred�o foi removido com sucesso.");
		}else {
			System.out.println("N�o foi poss�vel fazer a remo��o.");
		}
		
		System.out.println("O nome: "+nomes.remove(1)+" foi removido com sucesso.");
		
		System.out.println("Esta � nossa lista: "+nomes);
		
		nomes.clear();
		
		System.out.println("Esta � nossa lista: "+nomes);
		
		if (nomes.isEmpty()) {
			System.out.println("O clear funcionou, a lista est� fazia.");
		}else {
			System.out.println("Ainda h� valores na lista.");
		}
		
	}

}
