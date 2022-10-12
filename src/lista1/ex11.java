/*
 11.Faça um Programa que peça 2 números inteiros e um número real. 
Calcule e mostre:
a. o produto do dobro do primeiro com metade do segundo .
b. a soma do triplo do primeiro com o terceiro.
c. o terceiro elevado ao cubo.
 */
package lista1;

import java.util.Scanner;

public class ex11 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite o primeiro numero inteiro: ");
		int numero1 = entrada.nextInt();
		
		System.out.println("digite o segundo numero inteiro: ");
		int numero2 = entrada.nextInt();
		
		System.out.println("digite o terceiro numero em real: ");
		double numero3 = entrada.nextDouble();
		
		int resultado1 = (numero1 * 2) * (numero2/2);
		double resultado2 = (numero1 * 3) + numero3;
		double resultado3 = Math.pow(numero3, 3);
		
		System.out.println("resultado 1: " + resultado1);
		System.out.println("resultado 2: " + resultado2);
		System.out.println("resultado 3: " + resultado3);
		
		entrada.close();
		
		
		
		
		
		
	}

}
