package com.fatec.lista1;

import java.util.Scanner;

public class Exercicio08 {
	
	static Scanner scan;
	
	// 8) Receber um nome do teclado e imprimir as letras na posição par.

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Informe um nome: ");
		String name = scan.next();

		for(int i = 1; i <= name.length(); i++) {
			if(i % 2 == 0) {
				System.out.println(name.substring(i-1, i) + " |");
			}
		}
	}

}
