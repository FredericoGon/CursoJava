package br.com.cursojava;

public class Exercicios02 {
	public static void main(String[] args) {
		int[] num = new int[]{1,3,2};
		int a = num[0];
		int b = num[1];
		int c = num[2];
		num[0]=Math.max(a, Math.max(b, c));
		num[2]=Math.min(a, Math.min(b, c));
		if (a>b && b>c){
			num[1] = b;
		}
		if (b>a && a>c){
			num[1] = a;
		}
		if (a>c && c>b){
			num[1] = c;
		}
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		//foto
	}

}
