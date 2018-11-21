package br.com.javacurso;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		View cadastro = new View();
		cadastro.mostrarMenu(teclado);
		teclado.close();
	}//main
}//class