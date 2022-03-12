package com.fatec.lista1;

import java.util.ArrayList;
import java.util.List;

public class Exercicio01 {
		
	// 1) Faça um programa que apresente o total da soma dos cem primeiros números inteiros.

	public static void main(String[] args) {	
		List<Integer> numeros = new ArrayList<>();
		
		for(int i = 1; i <= 100; i++) {
			numeros.add(i);
		}
		
		int total = numeros
			.stream()
			.mapToInt(n -> n)
			.sum();
		
		System.out.println("O total da soma dos cem primeiros números é " + total);
	}

}
