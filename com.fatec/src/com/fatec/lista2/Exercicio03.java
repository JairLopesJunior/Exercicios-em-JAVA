package com.fatec.lista2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio03 {
	
	static Scanner scan;
	// Escrever um programa, que leia valores inteiros at� ser lido o valor -50. Quando isso
	// acontecer o programa dever� escrever a soma e a m�dia dos valores lidos.

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Informe um n�mero: ");
			int num = scan.nextInt();
			list.add(num);
			
			if(num == -50) {
				System.out.printf("A SOMA dos valores lidos � %d\n", returnSomaValores(list));
				System.out.printf("A M�DIA dos valores lidos � %2f", returnMediaValores(list));
				return;
			}
		}	

	}
	
	private static Integer returnSomaValores(List<Integer> numeros) {
		return numeros
			.stream()
			.mapToInt(n -> n)
			.sum();
	}
	
	private static Double returnMediaValores(List<Integer> numeros) {
		return numeros
			.stream()
			.mapToInt(n -> n)
			.average()
			.getAsDouble();
	}

}
