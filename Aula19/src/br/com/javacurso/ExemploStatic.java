package br.com.javacurso;

public class ExemploStatic {
	
	public static void main(String[] args) {
		Teste t1 = new Teste();
		Teste t2 = new Teste();
		
		System.out.println(t1.atributo);
		System.out.println(t2.atributo);
		System.out.println(t1.atributoStatic);
		System.out.println(t2.atributoStatic);
		System.out.println(Teste.atributoStatic);
		
		t1.atributo = 10;
		t2.atributo = 20;
		t1.atributoStatic = 50;//n�o preciso setar para as demais inst�ncias, � o mesmo para toda a classe
		
		System.out.println(t1.atributo);
		System.out.println(t2.atributo);
		System.out.println(t1.atributoStatic);
		System.out.println(t2.atributoStatic);
		System.out.println(Teste.atributoStatic);
		
		t1.oi();
		t1.hello();
		t2.oi();
		t2.hello();
		//Teste.oi();
		Teste.hello(); //forma correta de chamar m�todos de inst�ncia, � atrav�s da classe diretamente e n�o atrav�s de uma inst�ncia.
		
	}

}
