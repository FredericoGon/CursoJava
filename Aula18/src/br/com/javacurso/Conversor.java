package br.com.javacurso;

public class Conversor {
	
	public double fromCelsiusToFarenheit(int graus1){
		return (graus1*1.8) + 32;
	}

	public double fromFarenheitToCelsius(int graus1){
		return (graus1-32)/1.8;
	}

	
}
