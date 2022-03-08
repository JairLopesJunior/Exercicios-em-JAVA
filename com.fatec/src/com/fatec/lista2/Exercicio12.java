package com.fatec.lista2;

import java.util.Scanner;

public class Exercicio12 {
	
	static Scanner scan;
	// Ler do teclado o nome, sexo e idade do usuário. Se sexo for feminino e idade menor que 25
	// imprimir o nome da pessoa e a palavra ACEITA. Caso contrario imprimir NAO ACEITA.

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		String name = scan.next();
		
		System.out.println("Informe seu sexo: (M) ou (F)");
		String sex = scan.next();
		
		System.out.println("Informe sua idade: ");
		int age = scan.nextInt();

		if(sex.equalsIgnoreCase("F") && age < 25) {
			
			System.out.println(name + " ACEITA");
			return;
		}
		System.out.println(name + " NÃO ACEITA");
	}

}
