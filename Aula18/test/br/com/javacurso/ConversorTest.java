package br.com.javacurso;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


public class ConversorTest {
	
	private Conversor conv;
	
	@Before
	public void Antes(){
		conv = new Conversor();
	}
	
	@Test
	public void deZeroCParaF(){
		double resultado = conv.fromCelsiusToFarenheit(0);
		Assert.assertEquals(32, resultado, 0);
	}
	
	@Test
	public void deTrintaCParaF(){
		double resultado = conv.fromCelsiusToFarenheit(30);
		Assert.assertEquals(86, resultado, 0);
	}
	
	@Test
	public void deCemCParaF(){
		double resultado = conv.fromCelsiusToFarenheit(100);
		Assert.assertEquals(212, resultado, 0);
	}
	
	
	@Test
	public void deZeroFParaC(){
		double resultado = conv.fromFarenheitToCelsius(0);
		Assert.assertEquals(-18, resultado, 0.5);
	}
	
	@Test
	public void deTrintaFParaC(){
		double resultado = conv.fromFarenheitToCelsius(30);
		Assert.assertEquals(-1, resultado, 0.5);
	}
	
	@Test
	public void deCemFParaC(){
		double resultado = conv.fromFarenheitToCelsius(100);
		Assert.assertEquals(38, resultado, 0.5);
	}

}
