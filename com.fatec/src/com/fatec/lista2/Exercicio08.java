package com.fatec.lista2;

import java.util.Scanner;

public class Exercicio08 {
	
	static Scanner scan;
	
	// Usando a função strcmp (procure na internet o que significa e como utilizar) faça um
	// programa que leia o seu nome e sobrenome em 2 variáveis diferentes. Verifique se as strings
	// são iguais ou diferentes e imprima na tela uma mensagem dizendo se uma é maior que a outra
	// ou se são iguais. Utilize IF-ELSE e strcmp.

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Informe seu primeiro nome: ");
		String name = scan.next();
		
		System.out.println("Informe seu último nome: ");
		String lastName = scan.next();

		if(name.equals(lastName)) {
			System.out.println("O primeiro nome '" + name + "' e o último nome '" + lastName + "' são iguais.");
		}else {
			System.out.println("O primeiro nome '" + name + "' e o último nome '" + lastName + "' não são iguais.");
		}
		
		if(name.length() == lastName.length()) {
			System.out.println("O tamanho do primeiro nome '" + name + "' e o tamanho do último nome '" + lastName + "' são iguais.");
		}else {
			System.out.println("O tamanho do primeiro nome '" + name + "' e o tamanho do último nome '" + lastName + "' não são iguais.");
		}
	}

}
