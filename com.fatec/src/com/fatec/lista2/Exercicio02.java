package com.fatec.lista2;

import java.util.Random;
import java.util.Scanner;

public class Exercicio02 {
	static Scanner scan;
	
	// Preencher um vetor com números inteiros (10 unidades); solicitar um número do teclado.
	// Pesquisar se esse número existe no vetor. Se existir, imprimir em qual posição do vetor esse
	// número está. Se não existir, imprimir alguma mensagem que não existe.

	public static void main(String[] args) {		
		// Criando o VETOR de 10 posições
		int[] numeros = new int[10];
		
		// Instanciando a Classe Random
		Random gerador = new Random();
		
		// Gerando números aleátorios de 0 a 999
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = gerador.nextInt(1000);
			System.out.println(numeros[i]);
		}
		
		scan = new Scanner(System.in);
		System.out.println("Informe um número: ");
		int num = scan.nextInt();
		for(int j = 0; j < numeros.length; j++) {
			if(numeros[j] == num) {
				System.out.printf("O número %d está na posição %d do VETOR!!", num, j);
				return;
			}
		}
		System.out.printf("Número %d não existe no VETOR!!", num);
	}

}
