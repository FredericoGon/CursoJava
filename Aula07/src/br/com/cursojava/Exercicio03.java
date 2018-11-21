package br.com.cursojava;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira um número: ");
		int n1 = Integer.parseInt(teclado.nextLine());
		System.out.println("Insira um número: ");
		int n2 = Integer.parseInt(teclado.nextLine());
		System.out.println("Insira um número: ");
		int n3 = Integer.parseInt(teclado.nextLine());
		System.out.println("Insira um número: ");
		int n4 = Integer.parseInt(teclado.nextLine());
		System.out.println("Insira um número: ");
		int n5 = Integer.parseInt(teclado.nextLine());
		teclado.close();
		for (;(n1>n2) && (n1>n3) && (n1>n4) && (n1>n5);){
			System.out.println(n1);
			break;
		}//for1
		for (;(n2>n1) && (n2>n3) && (n2>n4) && (n2>n5);){
			System.out.println(n2);
			break;
		}//for2
		for (;(n3>n1) && (n3>n2) && (n3>n4) && (n3>n5);){
			System.out.println(n3);
			break;
		}//for3
		for (;(n4>n1) && (n4>n3) && (n4>n2) && (n4>n5);){
			System.out.println(n4);
			break;
		}//for4
		for (;(n5>n1) && (n5>n3) && (n5>n4) && (n5>n2);){
			System.out.println(n5);
			break;
		}//for5
	}
}
