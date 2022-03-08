package com.fatec.lista2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Exercicio11 {
	
	static Scanner scan;
	
	// Fa�a um programa que leia do teclado 10 n�meros inteiros e armazene em um vetor. Sem
	// ordenar, determine o maior e o menor n�mero e imprima-os na tela.

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("Informe o " + (i+1) + "� n�mero:");
			int num = scan.nextInt();
			numbers[i] = num;
		}
		
		List<Integer> numbersList = Arrays.stream(numbers).boxed().toList();
		Integer smallestNumber = numbersList
			.stream()
			.min(Comparator.comparingInt(n -> n))
			.get();
		
		Integer higherNumber = numbersList
				.stream()
				.max(Comparator.comparingInt(n -> n))
				.get();
			
		System.out.println("O menor n�mero do VETOR � " + smallestNumber);
		System.out.println("O maior n�mero do VETOR � " + higherNumber);
	}

}
