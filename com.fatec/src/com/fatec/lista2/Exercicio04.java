package com.fatec.lista2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicio04 {
	
	static Scanner scan;
	
	// Receba do teclado 10 números e armazene eles em um vetor. Depois faça os seguintes
	// procedimentos armazenando os valores em outros 3 vetores:
	// 	- Pegar cada item do vetor e somar com o valor de algoritmo logo subsequente. Por ex: se
	// 	o numero é 13 então tem que somar 13 com 14 e armazenar na posição que estava o 13.
	// 	E fazer assim para todas as “casas” do vetor.
	// 	- Pegue cada item do vetor e some com a média do vetor.
	// 	- Pegue cada item do vetor e multiplique pelo quadrado dele mesmo. Ex: se é 3 então:
	// 	3*3² = 27. Armazenar o 27 onde era o 3

	public static void main(String[] args) {
		int[] numeros = new int[10];
		scan = new Scanner(System.in);
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.printf("Informe o %dº número:\n", (i+1));
			int num = scan.nextInt();
			numeros[i] = num;
		}

		System.out.println("==============================================================================");
		System.out.println("- Pegar cada item do vetor e somar com o valor de algoritmo logo subsequente. Por ex: se o numero é 13 então tem que somar 13 com 14 e armazenar na posição que estava o 13.");
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(((numeros[i]+1) + numeros[i]));
		}
		
		System.out.println("\n");
		System.out.println("==============================================================================");
		System.out.println("- Pegue cada item do vetor e some com a média do vetor.");
		for(int i = 0; i < numeros.length; i++) {
			Double mediaVetor = getMediaVetor(numeros);
			System.out.println((mediaVetor + numeros[i]));
		}
		
		System.out.println("\n");
		System.out.println("==============================================================================");
		System.out.println("- Pegue cada item do vetor e multiplique pelo quadrado dele mesmo. Ex: se é 3 então: 3*3² = 27. Armazenar o 27 onde era o 3");
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(Math.pow(numeros[i], numeros[i]));
		}
	}
	
	private static Double getMediaVetor(int[] numeros) {
		List<Integer> listaDeNomes = Arrays.stream(numeros).boxed().collect(Collectors.toList());;
		return listaDeNomes
				.stream()
				.mapToInt(m -> m)
				.average()
				.getAsDouble();
	}

}
