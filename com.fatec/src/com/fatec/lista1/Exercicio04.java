package com.fatec.lista1;

import java.util.Scanner;

public class Exercicio04 {
	
	static Scanner scan;

	// 4) Fa�a um programa que receba do usu�rio dez temperaturas em graus Fahrenheit,
	// transforme-as em graus Celsius e armazene os resultados em um vetor. Terminada a entrada
	// de dados, os valores armazenados devem ser exibidos. Obs.: A f�rmula � C = 5/9 (F � 32).

	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		double[] vectorTemperature = new double[10];
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Informe a " + (i+1) + "� temperatura em (GRAUS FAHRENHEIT): ");
			double fahrenheit = scan.nextDouble();
			double fahrenheitConvertedCelsius = ((fahrenheit * 1.8) + 32);
			vectorTemperature[i] = fahrenheitConvertedCelsius;
		}
		
		for(double celsius: vectorTemperature) {
			System.out.println(celsius);
		}
	}

}
