package com.projetodata.gupy.io;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		List<Funcionario> funcionarios = new ArrayList<>();
		
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setNome("Maria");
		funcionario1.setDataNascimento(LocalDate.parse("18/10/2000", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		funcionario1.setSalario(new BigDecimal("2009.44"));
		funcionario1.setFuncao("Operador");
		funcionarios.add(funcionario1);
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setNome("João");
		funcionario2.setDataNascimento(LocalDate.parse("12/05/1990", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		funcionario2.setSalario(new BigDecimal("2284.38"));
		funcionario2.setFuncao("Operador");
		funcionarios.add(funcionario2);
		
		Funcionario funcionario3 = new Funcionario();
		funcionario3.setNome("Caio");
		funcionario3.setDataNascimento(LocalDate.parse("02/05/1961", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		funcionario3.setSalario(new BigDecimal("9836.14"));
		funcionario3.setFuncao("Coordenador");
		funcionarios.add(funcionario3);
		
		Funcionario funcionario4 = new Funcionario();
		funcionario4.setNome("Miguel");
		funcionario4.setDataNascimento(LocalDate.parse("14/10/1988", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		funcionario4.setSalario(new BigDecimal("19119.88"));
		funcionario4.setFuncao("Diretor");
		funcionarios.add(funcionario4);
		
		Funcionario funcionario5 = new Funcionario();
		funcionario5.setNome("Alice");
		funcionario5.setDataNascimento(LocalDate.parse("05/01/1995", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		funcionario5.setSalario(new BigDecimal("2234.68"));
		funcionario5.setFuncao("Recepcionista");
		funcionarios.add(funcionario5);
		
		Funcionario funcionario6 = new Funcionario();
		funcionario6.setNome("Heitor");
		funcionario6.setDataNascimento(LocalDate.parse("19/11/1999", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		funcionario6.setSalario(new BigDecimal("1582.72"));
		funcionario6.setFuncao("Operador");
		funcionarios.add(funcionario6);
		
		Funcionario funcionario7 = new Funcionario();
		funcionario7.setNome("Arthur");
		funcionario7.setDataNascimento(LocalDate.parse("31/03/1993", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		funcionario7.setSalario(new BigDecimal("4071.84"));
		funcionario7.setFuncao("Contador");
		funcionarios.add(funcionario7);
		
		Funcionario funcionario8 = new Funcionario();
		funcionario8.setNome("Laura");
		funcionario8.setDataNascimento(LocalDate.parse("08/07/1994", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		funcionario8.setSalario(new BigDecimal("3017.45"));
		funcionario8.setFuncao("Gerente");
		funcionarios.add(funcionario8);
		
		Funcionario funcionario9 = new Funcionario();
		funcionario9.setNome("Heloísa");
		funcionario9.setDataNascimento(LocalDate.parse("24/05/2003", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		funcionario9.setSalario(new BigDecimal("1606.85"));
		funcionario9.setFuncao("Eletricista");
		funcionarios.add(funcionario9);
		
		Funcionario funcionario10 = new Funcionario();
		funcionario10.setNome("Helena");
		funcionario10.setDataNascimento(LocalDate.parse("02/09/1996", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		funcionario10.setSalario(new BigDecimal("2799.93"));
		funcionario10.setFuncao("Gerente");
		funcionarios.add(funcionario10);
		
		funcionarios.forEach(System.out::println);

		// Remover o funcionário “João” da lista.
		String name = "João";
		removeFuncionario(funcionarios, name);
		System.out.println();
		System.out.println("================================================");
		System.out.println("Remover o funcionário “João” da lista.\n");
		funcionarios.forEach(System.out::println);
		
		// Os funcionários receberam 10% de aumento de salário, atualizar a lista de funcionários com novo valor.
		updateSalarioFuncionarios(funcionarios);
		System.out.println();
		System.out.println("================================================");
		System.out.println("Os funcionários receberam 10% de aumento de salário, atualizar a lista de funcionários com novo valor.\n");
		funcionarios.forEach(System.out::println);
		
		// Agrupar os funcionários por função em um MAP, sendo a chave a “função” e o valor a “lista de funcionários”.
		Map<String, Funcionario> funcionariosMap = new HashMap<>();
		agruparFuncionarios(funcionarios, funcionariosMap);
		System.out.println();
		System.out.println("================================================");
		System.out.println("Agrupar os funcionários por função em um MAP, sendo a chave a “função” e o valor a lista de funcionários. \n");
		funcionariosMap.forEach((key, value) -> {
			System.out.println("key: " + key + ", value: " + value);
		});
		
		// Imprimir os funcionários, agrupados por função.
		System.out.println();
		System.out.println("================================================");
		System.out.println("Imprimir os funcionários, agrupados por função.\n");
		funcionarios.stream()
        	.sorted((f1, f2) -> f1.getFuncao().compareTo(f2.getFuncao()))
        	.forEach(p -> System.out.println(p));
		
		// Imprimir os funcionários que fazem aniversário no mês 10 e 12.
		System.out.println();
		System.out.println("================================================");
		System.out.println("Imprimir os funcionários que fazem aniversário no mês 10 e 12.\n");
		for(Funcionario f: funcionarios) {
			if(f.getDataNascimento().getMonthValue() == 10 || f.getDataNascimento().getMonthValue() == 12) {
				System.out.println(f);
			}
		}
		
		// Imprimir o funcionário com a maior idade, exibir os atributos: nome e idade.
		System.out.println();
		System.out.println("================================================");
		System.out.println("Imprimir o funcionário com a maior idade, exibir os atributos: nome e idade.\n");
		Funcionario f = funcionarios.stream()
			.sorted((f1, f2) -> f1.getDataNascimento()
			.compareTo(f2.getDataNascimento()))
			.findFirst().get();
		System.out.println(String.format("Nome: %s, Idade: %o", f.getNome(), (LocalDate.now().getYear() - f.getDataNascimento().getYear())));
		
		// Imprimir a lista de funcionários por ordem alfabética.
		System.out.println();
		System.out.println("================================================");
		System.out.println("Imprimir a lista de funcionários por ordem alfabética.\n");
		funcionarios.stream()
        	.sorted((f1, f2) -> f1.getNome().compareTo(f2.getNome()))
        	.forEach(p -> System.out.println(p));
		
		//  Imprimir o total dos salários dos funcionários.
		System.out.println();
		System.out.println("================================================");
		System.out.println("Imprimir o total dos salários dos funcionários.\n");
		showTotalSalarios(funcionarios);
		
		
		// Imprimir quantos salários mínimos ganha cada funcionário, considerando que o salário mínimo é R$1212.00.
		System.out.println();
		System.out.println("================================================");
		System.out.println("Imprimir quantos salários mínimos ganha cada funcionário, considerando que o salário mínimo é R$1212.00.\n");
		showSalarioGanhaFuncionario(funcionarios);
	}
	
	private static void removeFuncionario(List<Funcionario> funcionarios, String name) {
		for(Funcionario f: funcionarios) {
			if(f.getNome().equals(name)) {
				funcionarios.remove(f);
				return;
			}
		}
	}
	
	private static void updateSalarioFuncionarios(List<Funcionario> funcionarios) {
		for(Funcionario f: funcionarios) {
			BigDecimal salarioAtual = f.getSalario();
			BigDecimal umCentesimoSalario = salarioAtual.divide(new BigDecimal("100"));
			BigDecimal valorAumento = umCentesimoSalario.multiply(new BigDecimal("10"));
			f.setSalario((salarioAtual.add(valorAumento))); 
		}
	}
	
	private static void agruparFuncionarios(List<Funcionario> funcionarios, Map<String, Funcionario> funcionariosMap) {
		for(Funcionario f: funcionarios) {
			funcionariosMap.put(f.getFuncao(), f);
		}
	}
	
//	private static void showFuncionarioMaiorSalario(List<Funcionario> funcionarios) {
//		Funcionario funcionarioMaiorSalario = funcionarios.stream().max(Comparator.comparing(Funcionario::getSalario)).get();
//		System.out.println(funcionarioMaiorSalario.getSalario());
//	}
	
	private static void showTotalSalarios(List<Funcionario> funcionarios) {
		BigDecimal salarioTotal = new BigDecimal(0F);
		for(Funcionario f: funcionarios) {
			salarioTotal = salarioTotal.add(f.getSalario());
		}
		System.out.println(salarioTotal);
	}
	
	private static void showSalarioGanhaFuncionario(List<Funcionario> funcionarios) {
		for(Funcionario f: funcionarios) {
			if(f.getSalario().compareTo(new BigDecimal("1212.00")) == 1) {
				int qtdSalarioMinimo = f.getSalario().divideToIntegralValue(new BigDecimal("1212.00")).intValue();		
				System.out.println(String.format("O/A %s ganha %o salários mínimo!!", f.getNome(), qtdSalarioMinimo));
			}else {
				System.out.println(String.format("O/A %s não ganha nem um salário mínimo completo!!", f.getNome()));
			}
		}
	}

}
