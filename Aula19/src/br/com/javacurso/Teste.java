package br.com.javacurso;

public class Teste {
	
	public static int atributoStatic;
	public int atributo;
	
	public void oi(){
		System.out.println("Oi!!");
		System.out.println("O valor do atributo �: "+atributo);
		System.out.println("O valor do atributo est�tico �: "+atributoStatic);
	}
	
	public static void hello(){
		System.out.println("Hello!!");
		//M�todos est�ticos s� acessam vari�veis est�ticas, n�o conseguem acessar vari�veis de inst�ncia.
		//System.out.println("O valor do atributo �: "+atributo);
		System.out.println("O valor do atributo est�tico �: "+atributoStatic);
	}

}//class
