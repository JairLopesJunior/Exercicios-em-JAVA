package com.fatec.lista1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio05 {
	
	static Scanner scan;
	
	// 5) Leia um vetor de 10 valores inteiros e exiba todos os valores ímpares.

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Informe o " + (i+1) + "º número: ");
			Integer number = scan.nextInt();
			numbers.add(number);
		}
		
		numbers
			.stream()
			.filter(number -> number % 2 == 1)
			.forEach(System.out::println);
	}

}
