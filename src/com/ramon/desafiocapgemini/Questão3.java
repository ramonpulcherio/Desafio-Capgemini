package com.ramon.desafiocapgemini;

import java.util.Scanner;

public class Questão3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Digita a frase escolhida? ");
		String frase = sc.nextLine();

		System.out.println(frase.replace(" ", ""));
		String[] grid = new String[frase.length()];

		double raiz = Math.ceil(Math.sqrt(frase.length()));
		
		
	}

}
