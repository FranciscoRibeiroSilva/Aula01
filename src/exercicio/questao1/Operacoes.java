package exercicio.questao1;

import java.util.*;
public class Operacoes {
	public static void main(String args[]) {
		int num1, num2;
		double resultado;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite o primeiro valor númerico=> ");
		num1 = sc.nextInt();
		System.out.print("Digite o segundo valor númerico=> ");
		num2 = sc.nextInt();
		
		resultado = num1 + num2;
		System.out.println(num1+"+"+num2+"="+resultado);
		resultado = num1 - num2;
		System.out.println(num1+"-"+num2+"="+resultado);
		resultado = num1 * num2;
		System.out.println(num1+"*"+num2+"="+resultado);
		resultado = num1 / num2;
		System.out.println(num1+"/"+num2+"="+resultado);
	}
}
