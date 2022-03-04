package com.ramon.desafiocapgemini;

import java.util.Scanner;

public class Questão2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos números inteiros você quer digitar?? ");
		int numeros = sc.nextInt();

		
		int[] vet = new int[numeros];
		int cont =0;

		for (int i = 0; i < numeros; i++) {
			System.out.println("Digite um número: ");
			vet[i] = sc.nextInt();
		}
		System.out.println("Digite o valor de x: ");
		int valorx = sc.nextInt();
		
		for (int j = 0; j < vet.length; j++) {
			
			for (int z = 0; z < vet.length; z++) {
				
				if ((vet[j] - vet[z]) == valorx) {
					cont++;
					
			
					
				} 
				
				
			}
			
			
		}
		System.out.println("O valor dos pares é de:" + cont);
	}
	
	
	
	

}
