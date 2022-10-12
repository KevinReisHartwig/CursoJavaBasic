/*
 9. Faça um programa que imprima na tela apenas os números ímpares 
entre 1 e 50.
 */
package lista.loops3;

import java.util.Scanner;

public class ex9 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 0; i<=50; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		entrada.close();
	}

}
