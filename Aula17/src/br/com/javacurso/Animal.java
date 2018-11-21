package br.com.javacurso;

public abstract class Animal{
	
	public abstract void comer();
	
	public void respirar(){
		System.out.println(this.getClass().getSimpleName()+" Oxygen");
	}

}//class
