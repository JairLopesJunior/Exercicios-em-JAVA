package com.fatec.lista2;

import java.util.Scanner;

public class Exercicio13 {
	
	static Scanner scan;
	
	// Receber do teclado uma string (seu nome) e imprimir quantas letras A, E, I, O, U tem esta
	// string. Considerar minúscula e maiúscula. Pode utilizar em algum momento o strlen

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		String name = scan.next();
		int countA = 0;
		int countE = 0;
		int countI = 0;
		int countO = 0;
		int countU = 0;
		
		for(int i = 0; i < name.length(); i++) {
			
			if(name.charAt(i) == 'a' || name.charAt(i) == 'A') {
				countA++;
			}else if(name.charAt(i) == 'e' || name.charAt(i) == 'E') {
				countE++;
			}else if(name.charAt(i) == 'i' || name.charAt(i) == 'I') {
				countI++;
			}else if(name.charAt(i) == 'o' || name.charAt(i) == 'O') {
				countO++;
			}else if(name.charAt(i) == 'u' || name.charAt(i) == 'U') {
				countU++;
			}
		}
		System.out.println("O nome " + name + " contém " + countA + " (A).");
		System.out.println("O nome " + name + " contém " + countE + " (E).");
		System.out.println("O nome " + name + " contém " + countI + " (I).");
		System.out.println("O nome " + name + " contém " + countO + " (O).");
		System.out.println("O nome " + name + " contém " + countU + " (U).");

	}

}
