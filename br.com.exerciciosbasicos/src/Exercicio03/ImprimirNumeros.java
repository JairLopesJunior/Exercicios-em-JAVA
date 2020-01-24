package Exercicio03;

public class ImprimirNumeros {

	public int obterSomaNumerosImpares(int numero){
		
		int soma = 0;
				
		for(int i = numero; i >= 0; i--){
			if(i % 2 == 1){
				soma += i;	
			}
		}
		return soma;
	}
	
	public int obterMultiplicacaoNumerosPares(int numero2){
		
		int soma2 = 1;
				
		for(int i = 1; i <= numero2; i++){
			if(i % 2 == 0){
				soma2 *= i;	
			}
		}
		return soma2;
	}
}
