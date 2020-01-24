package Exercicio06;

public class MediaAluno {
	
	public void adicionarNotas(int[] notas){
		for(int i = 0; i < notas.length; i++){
			if(notas[i] >= 0 && notas[i] <= 100) {
				System.out.println(notas[i]);
			}else{
				System.out.println("Erro ao adicionar");
			}
		}
	}
	
	public void calcularMedia(int[] notas){
		double soma = 0;
		for(int i = 0; i < notas.length; i++){
			soma += notas[i];
		}
		soma = soma / notas.length;
		System.out.println("A media do aluno é: " + soma);
	}
}
