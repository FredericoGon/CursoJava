package br.com.javacurso;

public class Conversor {

	public double converter(double numero) {
		if (numero<=50) {
			return numero;
		}else if(numero<=100) {
			return numero*0.95;
		}else if(numero<=200) {
			return numero*0.9;
		}else if(numero>200) {
			return numero*0.8;
		}
		return numero;
	}//converter
}//class
