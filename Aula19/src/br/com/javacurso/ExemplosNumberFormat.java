package br.com.javacurso;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;


public class ExemplosNumberFormat {
	
	public static void main(String[] args) throws ParseException {
		
		double numero = 12345678.90;
		
		System.out.println(numero);
		System.out.println("Exemplos de getCurrency: ");
		System.out.println(NumberFormat.getCurrencyInstance().format(numero));
		
		Locale ptBr = new Locale("pt", "BR");
		System.out.println(NumberFormat.getCurrencyInstance(ptBr).format(numero));
		
		Locale enUS = new Locale("en", "US");
		System.out.println(NumberFormat.getCurrencyInstance(enUS).format(numero));
		
		System.out.println("Exemplos de getInstance: ");
		System.out.println(NumberFormat.getInstance().format(numero));
		
		System.out.println(NumberFormat.getInstance(Locale.US).format(numero));
		//NumberFormat.
		
		double numero2 = 2.0/3.0;
		System.out.println(numero2);
		
		
		System.out.println("Exemplos de getPercent: ");
		System.out.println(NumberFormat.getPercentInstance().format(numero2));
		
		
		System.out.println("Exemplos de getInteger: ");
		System.out.println(NumberFormat.getIntegerInstance().format(numero2));
		
		System.out.println("Exemplos de parse: ");
		Number number = NumberFormat.getInstance().parse("3456");
		System.out.println(number);
		double v = number.doubleValue() + 6500;
		System.out.println(v);
		

		
	
//		
//		
//		//Calendar cal = Calendar().getInstance;
//		Calendar c = Calendar.getInstance();
//		
//		System.out.println(c.getTime());
//		System.out.println(c.getTimeInMillis());
//		c.set(2019, 11, 04,16, 15,30);
//	
//		System.out.println(c.getTime());
		
	//	DataFormat df =DateFormat.getDateInstance().format() ;
//		String  data = DateFormat.getInstance().format(01/10/2000);
//		System.out.println(data);
//		
		
		
		

		
		
		
		
	}

}
