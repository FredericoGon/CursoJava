package br.com.javacurso;

import java.text.NumberFormat;
import java.util.Locale;

public class pratica {
	
	public static void main(String[] args) {
		double numero = 876543;
		System.out.println(numero);
		System.out.println(NumberFormat.getInstance().format(numero));
		
		
		System.out.println(NumberFormat.getCurrencyInstance(Locale.UK).format(numero));
		
		
		
		double numero2 = 0.06;
		System.out.println(NumberFormat.getPercentInstance().format(numero2));
	}

}
