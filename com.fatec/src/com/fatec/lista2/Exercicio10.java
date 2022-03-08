package com.fatec.lista2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Exercicio10 {
	
	static Scanner scan;
	
	// Faça um programa que leia do teclado 10 números inteiros e armazene em um vetor.
	// Depois ordene o vetor de forma decrescente. Após isso imprima esse vetor.

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("Informe o " + (i+1) + "º número:");
			int num = scan.nextInt();
			numbers[i] = num;
		}
		
		List<Integer> numbersList = Arrays.stream(numbers).boxed().toList();
		
		numbersList
			.stream()
			.sorted(Comparator.reverseOrder())
			.forEach(System.out::println);
	}

}
