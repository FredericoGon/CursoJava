package br.com.cursojava;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Quantos dias fazem que você nasceu? ");
		int diasin = Integer.parseInt(teclado.nextLine());
		teclado.close();
		int anos = diasin / 360;
		int anosf = (int) Math.floor(anos);
		// System.out.println(anosf);
		int meses = (diasin % 360) / 30;
		int mesesf = (int) Math.floor(meses);
		// System.out.println(mesesf);
		int dias = ((diasin % 360) % 30);
		// System.out.println(dias);
		teclado.close();
		System.out.println("Sua idade é de: " + anosf + " anos, " + mesesf + " meses, e " + dias + " dias.");
	}

}
