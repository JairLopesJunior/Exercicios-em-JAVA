package Exercicio07;

public class Teste {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		
		Contato contato = new Contato();
		contato.setNome("Jair");
		contato.setEmail("email@gmail.com");
		
		Contato contato2 = new Contato();
		contato2.setNome("Joao");
		contato2.setEmail("joao@gmail.com");
		
		Contato contato3 = new Contato();
		contato3.setNome("Luan");
		contato3.setEmail("luan@gmail.com");
		
		Contato[] contatos = new Contato[3];
		contatos[0] = contato;
		contatos[1] = contato2;
		contatos[2] = contato3;
		
		agenda.adicionar(contatos);
		agenda.adicionar(contatos);
		agenda.adicionar(contatos);
		
		for(Contato a : agenda.getContatos()) {
			System.out.println("Nome: " + a.getNome());
			System.out.println("Email " + a.getEmail());
		}
		
	}

}
