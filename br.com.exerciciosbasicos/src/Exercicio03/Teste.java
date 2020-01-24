package Exercicio03;

import java.math.BigInteger;

public class Teste {

	public static void main(String[] args) {
		
		ImprimirNumeros imprimirNumeros = new ImprimirNumeros();
		
		int numero = 30;
		System.out.println(imprimirNumeros.obterSomaNumerosImpares(numero));
		
		int numero2 = 30;
		System.out.println(imprimirNumeros.obterMultiplicacaoNumerosPares(numero2));
		
	}

}
