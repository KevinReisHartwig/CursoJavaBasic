/*
 17.Faça um Programa que peça um número correspondente a um 
determinado ano e em seguida informe se este ano é ou não bissexto.
 */
package lista2;

import java.util.Scanner;

public class ex17 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite o ano: ");
		int ano = entrada.nextInt();
		
		if((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.println("o ano é bissexto");
		
		}else {
		System.err.println("não é bissexto");
	}
		entrada.close();
}
}
