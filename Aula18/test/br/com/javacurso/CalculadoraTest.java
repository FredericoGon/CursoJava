package br.com.javacurso;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	
	private Calculadora calc;
	
	@Before
	public void AntesDeCadaTest(){
		calc = new Calculadora();
	}
	
	@After
	public void DepoisDeCadaTest(){
		System.out.println("Terminou mais um teste.");
	}
	
	@Test
	public void testSomarDoisMaisDois(){
		double resultado = calc.somar(2.0, 2.0);
		Assert.assertEquals(4.0, resultado, 0);		
	}//testSomar
	
	@Test
	public void testSomarDoisMaisTres(){
		double resultado = calc.somar(2.0, 3.0);
		Assert.assertEquals(5.0, resultado, 0);	
	}
	
	@Test
	public void testSomarCincoMaisVinte(){
		double resultado = calc.somar(5.0, 20.0);
		Assert.assertEquals(25.0, resultado, 0);	
	}
	
	@Test
	public void testDeduzirDoisMaisDois(){
		double resultado = calc.deduzir(2.0, 2.0);
		Assert.assertEquals(0, resultado, 0);		
	}
	
	@Test
	public void testDeduzirDoisMaisTres(){
		double resultado = calc.deduzir(2.0, 3.0);
		Assert.assertEquals(-1.0, resultado, 0);	
	}
	
	@Test
	public void testDeduzirCincoMaisVinte(){
		double resultado = calc.deduzir(5.0, 20.0);
		Assert.assertEquals(-15.0, resultado, 0);	
	}
	
}//class
