package Exercicio04;

public class TrocaNumero {

	public void ObterValoresInversos(int num1, int num2){
		int num3 = num1;
		num1 = num2;
		num2 = num3;
		System.out.println("O num1 com o valor do num2 é " + num1 + ", e o num2 com o valor do num1 é " + num2);
	}
}
