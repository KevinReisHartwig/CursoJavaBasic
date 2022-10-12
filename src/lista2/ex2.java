/*
 2. Faça um Programa que peça um valor e mostre na tela se o valor é 
positivo ou negativo.
 */
package lista2;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("informe um numero: ");
		
		double numero = entrada.nextDouble();
		
		if(numero >= 0) {
			System.out.println("positivo");
		}else {
			System.out.println("negativo");
		}
		
		entrada.close();
		
		
	}
}
