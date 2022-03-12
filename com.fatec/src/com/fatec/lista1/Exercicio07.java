package com.fatec.lista1;

import java.util.Scanner;

public class Exercicio07 {
	
	static Scanner scan;
	
	// 7) Receber um nome do teclado e imprimir as letras na posição ímpar.

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Informe um nome: ");
		String name = scan.next();

		for(int i = 1; i <= name.length(); i++) {
			if(i % 2 == 1) {
				System.out.println(name.substring(i-1, i) + " |");
			}
		}
	}

}
