package Exercicio01;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		java.util.Scanner scan = new Scanner(System.in);
		MaiorNumero maiorNumero = new MaiorNumero();
		
		System.out.println("Informe o primeiro numero");
		int num1 = scan.nextInt();
		
		System.out.println("Informe o segundo numero");
		int num2 = scan.nextInt();
		
		System.out.println("O maior numero retornado é: " + maiorNumero.imprimirMaiorNumero(num1, num2));
	}

}
