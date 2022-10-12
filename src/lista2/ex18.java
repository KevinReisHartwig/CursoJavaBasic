/*
 18.Faça um Programa que peça um número inteiro e determine se ele é 
par ou impar. Dica: utilize o operador módulo (resto da divisão).

 */
package lista2;

import java.util.Scanner;

public class ex18 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite um numeiro inteiro: ");
		int num = entrada.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("ele é par");
		}else {
			System.out.println("impar");
		}
		entrada.close();
		
	}

}
