package br.com.cursojava;

public class Exercicio4 {
	public static void main(String[] args){
		int distancia = 200;
		int tempohora = 240;
		double tempomin = tempohora/60;
		System.out.println(tempomin);
		double velocidade = distancia/tempomin;
		System.out.println("A velocida é: "+velocidade+"Km/h");
	}
}