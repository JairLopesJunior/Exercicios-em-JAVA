package com.fatec.lista1;

import java.util.Scanner;

public class Exercicio03 {
	
	static Scanner scan;
	
	// 3) Ler um número do teclado e imprimir todos os números de 1 até o número lido.

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Informe um número: ");
			Integer number = scan.nextInt();
			
			if(number < 1) {
				System.out.println("Informe um número válido.");
			}else {
				for(int i = 1; i <= number; i++) {
					System.out.println(i);
				}
			}
		}

	}

}
