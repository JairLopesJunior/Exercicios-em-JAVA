package com.fatec.lista2;

import java.util.Scanner;

public class Exercicio08 {
	
	static Scanner scan;
	
	// Usando a fun��o strcmp (procure na internet o que significa e como utilizar) fa�a um
	// programa que leia o seu nome e sobrenome em 2 vari�veis diferentes. Verifique se as strings
	// s�o iguais ou diferentes e imprima na tela uma mensagem dizendo se uma � maior que a outra
	// ou se s�o iguais. Utilize IF-ELSE e strcmp.

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Informe seu primeiro nome: ");
		String name = scan.next();
		
		System.out.println("Informe seu �ltimo nome: ");
		String lastName = scan.next();

		if(name.equals(lastName)) {
			System.out.println("O primeiro nome '" + name + "' e o �ltimo nome '" + lastName + "' s�o iguais.");
		}else {
			System.out.println("O primeiro nome '" + name + "' e o �ltimo nome '" + lastName + "' n�o s�o iguais.");
		}
		
		if(name.length() == lastName.length()) {
			System.out.println("O tamanho do primeiro nome '" + name + "' e o tamanho do �ltimo nome '" + lastName + "' s�o iguais.");
		}else {
			System.out.println("O tamanho do primeiro nome '" + name + "' e o tamanho do �ltimo nome '" + lastName + "' n�o s�o iguais.");
		}
	}

}
