package com.fatec.lista1;

import java.util.Scanner;

public class Exercicio02 {
	
	static Scanner scan;
	
	// 2) Fa�a um programa que pegue um nome at� 20 caracteres do teclado e depois escreva-o na
	// tela de tr�s pra frente.

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Informe um nome de at� 20 caracteres: ");
			String name = scan.next();
			
			if(name.length() > 20) {
				System.out.println("O nome " + name + " possui mais que 20 caracteres, por favor informe um nome v�lido.");
			}else {
				StringBuilder str = new StringBuilder(name);
				String invertedName = str.reverse().toString();
				System.out.println("O nome " + name + " invertido � " + invertedName);
				return;
			}
		}

	}

}
