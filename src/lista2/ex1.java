//1. Faça um Programa que peça dois números e imprima o maior deles.
package lista2;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite o primeiro numero: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("digite o segundo numero: ");
		double num2 = entrada.nextDouble();
		
		if(num1 > num2) {
			System.out.println("o primeiro numero é maior "+num1);
			
		}else {
			System.out.println("o segundo é o maior " + num2);
		}
		
		entrada.close();
		
		
	
	
	
	
	
	}

}
