package br.com.cursojava;

public class Exercicio06 {
	public static void main(String[] args) {
		int n = 1;
		boolean primo = true;
		while (n<50){
						int div = 2;
			while (div<n){
				//double div = n%x;
				if(n%div==0){
					primo = false;
					break;
				//System.out.println(n);
				}
				++div;
				}
			if (primo){
				System.out.println(n);
			}
			n++;
			}				
	}

}
