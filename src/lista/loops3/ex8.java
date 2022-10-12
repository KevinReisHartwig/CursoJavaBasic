/*
 8. Faça um programa que leia 5 números e informe a soma e a média 
dos números.
 */
package lista.loops3;

import java.util.Scanner;

public class ex8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double nota;
		double soma = 0;
		double media;
		
		for(int i = 0; i <= 5; i++) {
			System.out.println("digite a nota: ");
			nota = entrada.nextDouble();
			soma += nota;
			
			
		}
		media = soma/5;
		System.out.println("a soma das notas foi " + soma);
		System.out.println(" a media foi de " + media);
		entrada.close();
	}
}
