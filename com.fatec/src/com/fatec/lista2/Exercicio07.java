package com.fatec.lista2;

import java.util.Scanner;

public class Exercicio07 {
	
	static Scanner scan;
	
	// Usando a fun��o strlen (procure na internet o que significa e como utilizar) fa�a um programa
	// que leia o seu nome e sobrenome em 2 vari�veis diferentes e imprima o numero de caracteres
	// de cada uma delas

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Informe seu primeiro nome: ");
		String name = scan.next();
		
		System.out.println("Informe seu �ltimo nome: ");
		String lastName = scan.next();
		
		System.out.println("O seu primeiro nome � " + name + " e tem " + name.length() + " caracteres");
		System.out.println("O seu �ltimo nome � " + lastName + " e tem " + lastName.length() + " caracteres");
	}
}
