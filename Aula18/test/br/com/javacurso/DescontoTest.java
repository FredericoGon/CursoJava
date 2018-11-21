package br.com.javacurso;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class DescontoTest {
	
	private Desconto desc;
	
	@Before
	public void antes(){
		desc = new Desconto();
	}
	
	@Test
	public void descontoDez(){
		double resultado = desc.descontar(10);
		Assert.assertEquals(10, resultado, 0);
	}
	
	@Test
	public void descontoZero(){
		double resultado = desc.descontar(0);
		Assert.assertEquals(0, resultado, 0);
	}
	
	@Test
	public void descontoNegativo(){
		double resultado = desc.descontar(-10);
		Assert.assertEquals(0, resultado, 0);
	}
	
	@Test
	public void descontoMilEOito(){
		double resultado = desc.descontar(1800);
		Assert.assertEquals(1800, resultado, 0);
	}
	
	@Test
	public void descontoMilEOitoEum(){
		double resultado = desc.descontar(1800.1);
		Assert.assertEquals(1710, resultado, 0.1);
	}
	
	@Test
	public void descontoDoisMilEQuatro(){
		double resultado = desc.descontar(2400);
		Assert.assertEquals(2280, resultado, 0);
	}
	
	@Test
	public void descontoDoisMilEQuatroEum(){
		double resultado = desc.descontar(2400.1);
		Assert.assertEquals(1872.1, resultado, 0.1);
	}
	
	@Test
	public void descontoTresMileQuinhentos(){
		double resultado = desc.descontar(3599.99);
		Assert.assertEquals(2807.99, resultado, 0.1);
	}
	
	@Test
	public void descontoTresMilESeissentos(){
		double resultado = desc.descontar(3600);
		Assert.assertEquals(2448, resultado, 0);
	}
	
	@Test
	public void descontoTresMilESeisMais(){
		double resultado = desc.descontar(5000);
		Assert.assertEquals(3400, resultado, 0.1);
	}
	
}
