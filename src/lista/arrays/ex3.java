/*
 3. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de 
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá 
ser o quadrado do respectivo elemento de A, ou seja:
B[i] = A[i] * A[I]
 */
package lista.arrays;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("digite o valor na posição " +i+"=");
			vetorA[i] = entrada.nextInt();
			vetorB[i] = vetorA[i] * vetorA[i];
			
			
			
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
		entrada.close();
	}

}
