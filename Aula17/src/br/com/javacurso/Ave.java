package br.com.javacurso;

public class Ave extends Animal implements Voador{

	@Override
	public void comer() {
		System.out.println("Nham!! Fly Fly");
	}
	
	@Override
	public void voar(){
		System.out.println("Ave flies, not all, but this one does");
	}

}
