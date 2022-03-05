package com.fatec.lista2;

import java.util.Random;
import java.util.Scanner;

public class Exercicio02 {
	static Scanner scan;
	
	// Preencher um vetor com n�meros inteiros (10 unidades); solicitar um n�mero do teclado.
	// Pesquisar se esse n�mero existe no vetor. Se existir, imprimir em qual posi��o do vetor esse
	// n�mero est�. Se n�o existir, imprimir alguma mensagem que n�o existe.

	public static void main(String[] args) {		
		// Criando o VETOR de 10 posi��es
		int[] numeros = new int[10];
		
		// Instanciando a Classe Random
		Random gerador = new Random();
		
		// Gerando n�meros ale�torios de 0 a 999
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = gerador.nextInt(1000);
			System.out.println(numeros[i]);
		}
		
		scan = new Scanner(System.in);
		System.out.println("Informe um n�mero: ");
		int num = scan.nextInt();
		for(int j = 0; j < numeros.length; j++) {
			if(numeros[j] == num) {
				System.out.printf("O n�mero %d est� na posi��o %d do VETOR!!", num, j);
				return;
			}
		}
		System.out.printf("N�mero %d n�o existe no VETOR!!", num);
	}

}
