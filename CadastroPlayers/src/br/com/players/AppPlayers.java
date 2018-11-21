package br.com.players;

import java.util.Scanner;

public class AppPlayers {
	
	public static void main(String[] args) {
		
		View players = new View();
		Scanner teclado = new Scanner(System.in);
		players.menu(teclado);
		
		teclado.close();
	}

}
