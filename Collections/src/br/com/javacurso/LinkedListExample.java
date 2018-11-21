package br.com.javacurso;

import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String[] args) {
		LinkedList<String> nomes = new LinkedList<String>();
		
		nomes.add("Fred");
		nomes.add("Frederico");
		nomes.add("Fredão");
		nomes.add("Fredonho");
		
		System.out.println("Esta é nossa lista: "+nomes);
		
		System.out.println("Esse é o tamanho da nossa lista: "+nomes.size());
		
		System.out.println("Esse é o primeiro nome: "+nomes.get(0));
		
		if(nomes.contains("Fredonho")) {
			System.out.println("Fredonho faz parte da lista.");
		}else {
			System.out.println("Fredonho não faz parte da lista.");
		}
		
		if (nomes.remove("Fredão")) {
			System.out.println("Fredão foi removido com sucesso.");
		}else {
			System.out.println("Não foi possível fazer a remoção.");
		}
		
		System.out.println("O nome: "+nomes.remove(1)+" foi removido com sucesso.");
		
		System.out.println("Esta é nossa lista: "+nomes);
		
		nomes.clear();
		
		System.out.println("Esta é nossa lista: "+nomes);
		
		if (nomes.isEmpty()) {
			System.out.println("O clear funcionou, a lista está fazia.");
		}else {
			System.out.println("Ainda há valores na lista.");
		}
		
	}

}
