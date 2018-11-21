package br.com.javacurso;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ConversorTeste {
	
	private Conversor conv;
	
	@Before
	public void antes() {
		conv = new Conversor();
	}
	
	@Test
	public void cem() {
		double resultado = conv.converter(100);
		Assert.assertEquals(95, resultado, 0);
	}
	
	@Test
	public void zero() {
		double resultado = conv.converter(0);
		Assert.assertEquals(0, resultado, 0);
	}
	
	@Test
	public void cinquenta() {
		double resultado = conv.converter(50);
		Assert.assertEquals(50, resultado, 0);
	}
	
	@Test
	public void cinquentaEUm() {
		double resultado = conv.converter(50.01);
		Assert.assertEquals(47.5, resultado, 0.1);
	}
	
	@Test
	public void cemEUm() {
		double resultado = conv.converter(100.01);
		Assert.assertEquals(90.00, resultado, 0.1);
	}
	
	@Test
	public void duzentos() {
		double resultado = conv.converter(200);
		Assert.assertEquals(180, resultado, 0);
	}
	
	@Test
	public void duzentosEUm() {
		double resultado = conv.converter(200.01);
		Assert.assertEquals(160, resultado, 0.1);
	}
	
	@Test
	public void duzentosEDois() {
		double resultado = conv.converter(202);
		Assert.assertEquals(161.6, resultado, 0.1);
	}

}
