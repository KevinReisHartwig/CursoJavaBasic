/*
 6. Faça um Programa que leia três números e mostre o maior deles.
 */
package lista2;

import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("informe o primeiro numero: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("informe o segundo numero: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("informe o terceiro numero: ");
		double num3 = entrada.nextDouble();
		
		if(num1 > num2 && num1 > num3 ) {
			System.out.println("o maior numero é o primeiro " + num1);
			
		}else if(num2 > num1 && num2 > num3) {
			System.out.println("o maior é o segundo " + num2);
		
		}else if(num3 > num1 && num3 > num2) {
			System.out.println("o maior deles é o terceiro " + num3);
		
		}else {
			System.out.println("é iguais");
		}
		
		entrada.close();
		
		
	}

}
