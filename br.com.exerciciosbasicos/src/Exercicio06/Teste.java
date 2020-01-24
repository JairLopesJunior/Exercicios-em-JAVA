package Exercicio06;

public class Teste {

	public static void main(String[] args){
		
		MediaAluno mediaAluno = new MediaAluno();
		
		int[] notas = {20,50,80,44,60,20};
		mediaAluno.adicionarNotas(notas);
		mediaAluno.calcularMedia(notas);
	}
}
