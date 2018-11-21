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
		
		System.out.println("Esta � nossa lista: "+numeros);
		
		System.out.println("Esse � o tamanho da nossa lista: "+numeros.size());
		
		System.out.println("Esse � o quarto n�mero: "+numeros.get("quarto"));
		
		if(numeros.containsValue(55.5)) {
			System.out.println("O valor 55.5 faz parte da lista.");
		}else {
			System.out.println("O valor 55.5 n�o faz parte da lista.");
		}
		
		if(numeros.containsKey("segundo")) {
			System.out.println("A chave segundo faz parte da lista.");
		}else {
			System.out.println("A chave segundo n�o faz parte da lista.");
		}
		
		if (numeros.remove("primeiro", 69.9)) {
			System.out.println("primeiro, 69.9 foi removido com sucesso.");
		}else {
			System.out.println("primeiro, 69.9 n�o foi poss�vel fazer a remo��o.");
		}
		
		System.out.println("O n�mero: "+numeros.remove("terceiro")+" foi removido com sucesso.");
		
		System.out.println("Esta � nossa lista: "+numeros);
		
		numeros.clear();
		
		System.out.println("Esta � nossa lista: "+numeros);
		
		if (numeros.isEmpty()) {
			System.out.println("O clear funcionou, a lista est� fazia.");
		}else {
			System.out.println("Ainda h� valores na lista.");
		}
		
	}//main
}
