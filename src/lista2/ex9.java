/*
 9. Faça um Programa que leia três números e mostre-os em ordem 
decrescente.
 */
package lista2;

import java.util.Scanner;

public class ex9 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite o primeiro numero: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("digite o segundo numero: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("digite o terceiro numero: ");
		double num3 = entrada.nextDouble();
		
		if(num1 <= num2 && num1 <= num3 && num2 <= num3 ) {
			System.out.println("a ordem decrescente é " + num1 + " - " + num2 + " - " + num3);
		}else if(num1 <= num2 && num1 <= num3 && num3 <= num2 ) {
			System.out.println("a ordem decrescente é " + num1 + " - " + num3 + "-" + num2);
		
		}else if(num2 <= num1 && num2 <= num3 && num1 <= num3 ) {
			System.out.println("a ordem decrescente é " + num2 + " - " + num1 + " - " + num3);
		}else if(num2 <= num1 && num2 <= num3 && num3 <= num1 ) {
			System.out.println("a ordem decrescente é " + num2 + " - " + num3 + " - " + num1);
		}else if(num3 <= num1 && num3 <= num2 && num1 <= num2 ) {
			System.out.println("a ordem decrescente é " + num3 + " - " + num1 + " - " + num2);
		}else if(num3 <= num1 && num3 <= num2 && num2 <= num1 ) {
			System.out.println("a ordem decrescente é " + num3 + " - " + num2 + " - " + num1);
		}
		
		entrada.close();
			
					
		
		
		
	}

}
