package com.fatec.lista1;

import java.util.Scanner;

public class Exercicio06 {
	
	static Scanner scan;
	
	// 6) Receber um nome do teclado e imprimir as 4 primeiras letras do nome.

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Informe um nome: ");
		String name = scan.next();
		
		System.out.println("As 4 primeiras letras do nome é: " + name.substring(0, 4));
	}

}
