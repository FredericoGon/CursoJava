package br.com.javacurso;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class CalendarExamples {
	
	public static void main(String[] args){
	        Calendar calendario = Calendar.getInstance();
	        Date data = calendario.getTime();
	         
	        DateFormat f3 = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
	        System.out.println("Data e hora norte-americana: "+f3.format(data));
	         
	        DateFormat f4 = DateFormat.getDateInstance(DateFormat.FULL, Locale.FRANCE);
	        System.out.println("Data e hora Francesa: "+f4.format(data));
	}
}