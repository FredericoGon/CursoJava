package br.com.javacurso;

public class Teste {
	
	public static int atributoStatic;
	public int atributo;
	
	public void oi(){
		System.out.println("Oi!!");
		System.out.println("O valor do atributo é: "+atributo);
		System.out.println("O valor do atributo estático é: "+atributoStatic);
	}
	
	public static void hello(){
		System.out.println("Hello!!");
		//Métodos estáticos só acessam variáveis estáticas, não conseguem acessar variáveis de instância.
		//System.out.println("O valor do atributo é: "+atributo);
		System.out.println("O valor do atributo estático é: "+atributoStatic);
	}

}//class
