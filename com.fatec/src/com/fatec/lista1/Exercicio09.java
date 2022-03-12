package com.fatec.lista1;

import java.util.Scanner;

public class Exercicio09 {
	
	static Scanner scan;
	
	// 9) Digite um nome do teclado, calcule e mostre quantas letras tem.

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		System.out.println("Informe um nome: ");
		String name = scan.next();
		
		System.out.println("O nome " + name + " tem " + name.length() + " letras.");
	}

}
