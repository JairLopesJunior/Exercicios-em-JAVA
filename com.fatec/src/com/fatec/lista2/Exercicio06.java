package com.fatec.lista2;

import java.util.Scanner;

public class Exercicio06 {
	
	static Scanner scan;
	
	// Usando a fun��o strcat (procure na internet o que significa e como utilizar) fa�a um programa
	// para concatenar duas strings que foram lidas do teclado (seu nome e sobrenome).

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Informe seu primeiro nome: ");
		String name = scan.next();
		
		System.out.println("Informe seu �ltimo nome: ");
		String lastName = scan.next();

		System.out.println("O seu nome completo � " + name + " " + lastName);
	}

}
