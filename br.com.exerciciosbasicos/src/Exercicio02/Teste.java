package Exercicio02;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		NumeroDecrescente numeroDecrescente = new NumeroDecrescente();
		
		System.out.println("Informe um numero");
		int num = scan.nextInt();
		
		numeroDecrescente.imprimirNumeroDescrecente(num);

	}

}
