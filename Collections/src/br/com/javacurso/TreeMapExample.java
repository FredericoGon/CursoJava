package br.com.javacurso;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		Map<String, Double> numeros = new TreeMap<String, Double>();
		
		numeros.put("primeiro", 69.9);
		numeros.put("segundo", 34.98);
		numeros.put("terceiro", 55.5);
		numeros.put("quarto", 23.32);
		
		System.out.println("Esta é nossa lista: "+numeros);
		
		System.out.println("Esse é o tamanho da nossa lista: "+numeros.size());
		
		System.out.println("Esse é o quarto número: "+numeros.get("quarto"));
		
		if(numeros.containsValue(55.5)) {
			System.out.println("O valor 55.5 faz parte da lista.");
		}else {
			System.out.println("O valor 55.5 não faz parte da lista.");
		}
		
		if(numeros.containsKey("segundo")) {
			System.out.println("A chave segundo faz parte da lista.");
		}else {
			System.out.println("A chave segundo não faz parte da lista.");
		}
		
		if (numeros.remove("primeiro", 69.9)) {
			System.out.println("primeiro, 69.9 foi removido com sucesso.");
		}else {
			System.out.println("primeiro, 69.9 não foi possível fazer a remoção.");
		}
		
		System.out.println("O número: "+numeros.remove("terceiro")+" foi removido com sucesso.");
		
		System.out.println("Esta é nossa lista: "+numeros);
		
		numeros.clear();
		
		System.out.println("Esta é nossa lista: "+numeros);
		
		if (numeros.isEmpty()) {
			System.out.println("O clear funcionou, a lista está fazia.");
		}else {
			System.out.println("Ainda há valores na lista.");
		}
		
	}//main
}
