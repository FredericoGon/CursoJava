package br.com.javacurso;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		Map<Integer, Integer> numeros = new HashMap<Integer, Integer>();
		
		numeros.put(1, 69);
		numeros.put(2, 88);
		numeros.put(3, 37);
		numeros.put(4, 59);
		
		System.out.println("Esta � nossa lista: "+numeros);
		
		System.out.println("Esse � o tamanho da nossa lista: "+numeros.size());
		
		System.out.println("Esse � o primeiro n�mero: "+numeros.get(1));
		
		if(numeros.containsValue(37)) {
			System.out.println("O valor 37 faz parte da lista.");
		}else {
			System.out.println("O valor 37 n�o faz parte da lista.");
		}
		
		if(numeros.containsKey(2)) {
			System.out.println("A chave 2 faz parte da lista.");
		}else {
			System.out.println("A chave 2 n�o faz parte da lista.");
		}
		
		if (numeros.remove(1, 69)) {
			System.out.println("1 = 69 foi removido com sucesso.");
		}else {
			System.out.println("1 = 69 n�o foi poss�vel fazer a remo��o.");
		}
		
		System.out.println("O n�mero: "+numeros.remove(3)+" foi removido com sucesso.");
		
		System.out.println("Esta � nossa lista: "+numeros);
		
		numeros.clear();
		
		System.out.println("Esta � nossa lista: "+numeros);
		
		if (numeros.isEmpty()) {
			System.out.println("O clear funcionou, a lista est� fazia.");
		}else {
			System.out.println("Ainda h� valores na lista.");
		}
	}

}
