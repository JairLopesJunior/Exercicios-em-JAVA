package com.fatec.lista1;

import java.util.Scanner;

public class Exercicio10 {
	
	static Scanner scan;
	
	// 10) Receber do teclado um nome e imprimir tantas vezes quantos forem seus caracteres.

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		System.out.println("Informe um nome: ");
		String name = scan.next();

		for(int i = 0; i < name.length(); i++) {
			System.out.println(name);
		}
	}

}
