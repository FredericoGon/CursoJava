package br.com.java;

import java.util.Scanner;

public class AppContato {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		CadastroContatos cadastro = new CadastroContatos();
		cadastro.mostrarMenu(teclado);
		teclado.close();
	}//main
}//class
