package com.fatec.lista1;

import java.util.Scanner;

public class Exercicio03 {
	
	static Scanner scan;
	
	// 3) Ler um n�mero do teclado e imprimir todos os n�meros de 1 at� o n�mero lido.

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Informe um n�mero: ");
			Integer number = scan.nextInt();
			
			if(number < 1) {
				System.out.println("Informe um n�mero v�lido.");
			}else {
				for(int i = 1; i <= number; i++) {
					System.out.println(i);
				}
			}
		}

	}

}
