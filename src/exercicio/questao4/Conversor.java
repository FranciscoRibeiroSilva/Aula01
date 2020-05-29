package exercicio.questao4;

import java.util.*;
public class Conversor {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		double f, c;
		
		System.out.print("Informe a temperatura em Celsius=> ");
		c = sc.nextDouble();
		f = ((9*c+160)/5);
		System.out.print("Temperatura em Fahrenheit=> "+f);
	}

}
