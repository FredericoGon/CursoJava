package br.com.javacurso;

public class DeLorean extends Carro implements Turbinavel, Voador{

	@Override
	public void acionarTurbo() {
		System.out.println("Acionar Turbo");
		
	}

	@Override
	public void desligarTurbo() {
		System.out.println("Desligar Turbo");
		
	}

	@Override
	public void voar() {
		System.out.println("Deloean Flies");
		
	}
	
	
	
}//class
