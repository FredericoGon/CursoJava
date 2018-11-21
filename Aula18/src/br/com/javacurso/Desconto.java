package br.com.javacurso;

public class Desconto {
	
	public double descontar(double numero){
		if (numero <= 0){
			return 0.0;
		}else if (numero <= 1800){
			return numero;
		}else if (numero <=  2400){
			return numero*0.95;
		}else if (numero < 3600){
			return numero*0.78;
		}else{
			return numero*0.68;

		}//if
	}//descontar
}//class
