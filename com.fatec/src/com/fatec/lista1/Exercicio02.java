package com.fatec.lista1;

import java.util.Scanner;

public class Exercicio02 {
	
	static Scanner scan;
	
	// 2) Faça um programa que pegue um nome até 20 caracteres do teclado e depois escreva-o na
	// tela de trás pra frente.

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Informe um nome de até 20 caracteres: ");
			String name = scan.next();
			
			if(name.length() > 20) {
				System.out.println("O nome " + name + " possui mais que 20 caracteres, por favor informe um nome válido.");
			}else {
				StringBuilder str = new StringBuilder(name);
				String invertedName = str.reverse().toString();
				System.out.println("O nome " + name + " invertido é " + invertedName);
				return;
			}
		}

	}

}
