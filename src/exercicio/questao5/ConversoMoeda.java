package exercicio.questao5;

import java.util.*;
public class ConversoMoeda {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		double valor, cotacao;
		
		System.out.print("Informe a quantidade de dolar=> ");
		valor = sc.nextDouble();
		System.out.print("Informe a cotação=> ");
		cotacao = sc.nextDouble();
		System.out.print("R$ "+valor*cotacao);
	}
}
