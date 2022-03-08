package com.fatec.lista2;

import java.util.Scanner;

public class Exercicio05 {
	
	static Scanner scan;
	
	// Usando a função strcpy (procure na internet o que significa e como utilizar) faça um programa
	// que leia o seu nome do teclado, armazene em uma variável, depois utilize strcpy e depois
	// printa na tela uma outra variável com o seu nome.

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		String name = scan.next();
		
		String copyName = name;
		
		System.out.println("O seu nome é " + copyName);

	}

}
