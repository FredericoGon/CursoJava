package br.com.javacurso;

public class PeixeVoador extends Peixe implements Voador{
	
	@Override
	public void voar(){
		System.out.println("Peixe flies");
	}

}
