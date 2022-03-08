package com.fatec.lista2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;

public class Exercicio09 {
	
	static Scanner scan;
	
	// Faça um programa que leia do teclado 10 números e armazene em um vetor. Depois ordene o
	// vetor de forma crescente. Após isso imprima esse vetor.

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
			.sorted()
			.forEach(System.out::println);
		
	}

}
