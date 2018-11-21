package br.com.javacurso;

import java.util.Calendar;

public class blabla {
	
	public static void main(String[] args) {
	       Calendar calendario = Calendar.getInstance();

	       System.out.println("Data/Hora atual: "+ calendario.getTime());
	       System.out.println("Ano: "+ calendario.get(Calendar.YEAR));
	       System.out.println("Mês: "+ calendario.get(Calendar.MONTH));
	       System.out.println("Dia do Mês: "+ calendario.get(Calendar.DAY_OF_MONTH));
	}
}