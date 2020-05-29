package exercicio.questao3;

import java.util.*;
public class FolhaPagamento {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		double salarioFixo, totalVendas, salarioFinal;
		String nome;
		
		System.out.print("Informe o nome do funcionario=> ");
		nome = sc.next();
		System.out.print("Informe o salario do funcionario=> ");
		salarioFixo = sc.nextDouble();
		System.out.print("Informe o total de venda(em dinheiro) do funcionario=> ");
		totalVendas = sc.nextDouble();
		salarioFinal = (salarioFixo+(0.15*totalVendas));
		System.out.print("Nome: "+nome+"\nSalario Fixo: "+salarioFixo+"\nTotal de Vendas: "+totalVendas+"\nSalario Final: "+salarioFinal);
		
	}
}
