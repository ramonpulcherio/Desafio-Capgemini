package com.ramon.desafiocapgemini;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questão3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o texto que deseja encriptar? ");
		String frase = sc.nextLine();
		System.out.println(encrypt(frase));
	}

	public static String encrypt(String text) {

		text = text.replace(" ", "");

		int dimension = (int) Math.ceil(Math.sqrt(text.length()));

		char[][] grid = new char[dimension][dimension];

		List<Character> characters = new ArrayList<>();
		for (int i = 0; i < text.length(); i++) {
			characters.add(text.charAt(i));
		}

		try {
			for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid[i].length; j++) {
					if (characters.isEmpty()) {
						break;
					}

					grid[i][j] = characters.remove(0);
				}
			}
		} catch (Exception e) {
		}

		String encryptedText = "";
		try {

			for (int i = 0; i < grid[i].length; i++) {
				for (int j = 0; j < grid.length; j++) {

					encryptedText += grid[j][i];
				}
				encryptedText += " ";
			}
		} catch (Exception e) {
		}

		System.out.println("O texto encriptado fica da seguinte forma: ");
		return encryptedText;

	}
}