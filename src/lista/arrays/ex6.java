/*
 6. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir 
um vetor C, onde cada elemento de C é a soma dos respectivos 
elementos em A e B, ou seja:
C[i] = A[i] + B[i].
 */
package lista.arrays;

import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("digite o valor  do vetor A na posição " +i+"=");
			vetorA[i] = entrada.nextInt();
	}
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("digite o valor do vetor B na posição " +i+"=");
			vetorB[i] = entrada.nextInt();
		}
		for(int i = 0; i < vetorA.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
		}
		System.out.println("vetor A: ");
		for(int i=0; i < vetorA.length; i++) {
			System.out.print(vetorA[i]+" ");
			
		}
		System.out.println(" ");
		System.out.println("vetor B: ");
		for(int i=0; i < vetorB.length; i++) {
			System.out.print(vetorB[i]+" ");
		}
		System.out.println("");
		System.out.println("vetor C: ");
		for(int i=0; i < vetorC.length; i++) {
			System.out.print(vetorC[i]+" ");
			
		}
		entrada.close();
}
}