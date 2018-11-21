package br.com.cursojava;

import java.util.HashMap;
import java.util.Map;


public class HashMapExamples {
	
	public static void main(String[] args) {
		
		Map<Integer, String> nomes = new HashMap<Integer, String>();
		
		nomes.put(88, "Fred");
		nomes.put(77, "Anthue");
		//nomes.put(66, null);
		System.out.println();
		
		System.out.println(nomes.get(88));
		System.out.println(nomes.get(77));
		
		System.out.println(nomes.size());
		
		if (nomes.isEmpty()){
			System.out.println("Está vazio.");
		}else{
			System.out.println("Não está vazio.");
		}
		
		if (nomes.containsValue("Fred")){
			System.out.println("Fred está entre os nomes.");
		}else{
			System.out.println("Fred não está entre os nomes.");
		}
		
		if (nomes.containsKey(77)){
			System.out.println("O número 77 está entre as chaves.");
		}else{
			System.out.println("o número 77 não está entre as chaves.");
		}
		
		for (Map.Entry<Integer, String> item : nomes.entrySet()) {
			System.out.printf("%d = %s\n",item.getKey(), item.getValue());
		}


	}

}
