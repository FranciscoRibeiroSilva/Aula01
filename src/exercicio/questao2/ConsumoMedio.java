package exercicio.questao2;

import java.util.*;
public class ConsumoMedio {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double distancia, combustivelGasto, media;
		
		System.out.print("Informe a quantidade de combustivel gasto=> ");
		combustivelGasto = sc.nextDouble();
		System.out.print("Informe a distância percorrida=> ");
		distancia = sc.nextDouble();
		media = combustivelGasto/distancia;
		System.out.print("Consumo médio do automóvel=> "+media);
	}
}
