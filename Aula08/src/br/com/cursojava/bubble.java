package br.com.cursojava;

import java.util.Arrays;

public class bubble {
	public static void main(String[] args) {
		int[] numeros = {3,2,5,1,4,8,9,7,6};
		int temp = 0;
		for(int i = 0; i<numeros.length-1;i++){
			for(int j = i+1;j<numeros.length;j++){
				if (numeros[i]>numeros[j]){
					temp = numeros[i];
					numeros[i]=numeros[j];
					numeros[j]=temp;
					
				}//if
			}//for j
		}//for i
		for(int g = 0;g<numeros.length;g++){
			System.out.print(numeros[g]+" ");
		//Arrays.toString(numeros) - pode usar isso no print
		}//for
		System.out.println("");
		System.out.println(Arrays.toString(numeros));
	}

}
