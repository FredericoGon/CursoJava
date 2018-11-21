package br.com.cursojava;

public class ForExemplos {
	public static void main(String[] args) {
		int i = 10;
		for(;i>5;i--){
			System.out.printf("%d",i);
		}//for1
		for(;i<10;){
			System.out.printf("%d",i);
			++i;
		}//for2
		for(;;){
			System.out.printf("%d",i);
			i--;
			if(i==0){
				break;
			}//if
		}//for3
	}//main
}//class
