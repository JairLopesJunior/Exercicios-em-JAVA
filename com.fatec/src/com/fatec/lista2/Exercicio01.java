package com.fatec.lista2;

import java.util.Scanner;

public class Exercicio01 {
	static Scanner scan;
	
	// 1) Fazer um programa que gere a saída.
	// * * * * * * * * * * * *
	// O,2,4,6,8,10,12,14
	// * * * * * * * * * * * *

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Informe um número: ");
		Integer num = scan.nextInt();
		for(int i = 0; i <= num; i++) {
			if(i % 2 == 0) {
				System.out.printf("%d, ", i);
			}
		}
	}

}
