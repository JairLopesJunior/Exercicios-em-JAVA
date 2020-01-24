package Exercicio05;

public class ComparaNumero {

	public void retornarNumerosDiferentes( int num1, int num2){
		
		if(num1 == num2 || num1 > num2){
			System.out.println("Os numeros são iguais, " + num1 + " e " + num2);
		}else {
			System.out.println("Os numeros são diferentes, " + num2 + " e " + num1);
		}
	}
}
