/*
 * 10.Criar um vetor A com 10 elementos inteiros. Construir um vetor B de 
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá 
ser o resto da divisão do respectivo elemento de A por 2 (dois), ou 
seja: B[i] := A[i] % 2
 */
package lista.arrays;

import java.util.Scanner;

public class ex10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] vetorA = new int[8];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("digite o valor na posição " +i+"=");
			vetorA[i] = entrada.nextInt();
			vetorB[i] = vetorA[i] % 2;
			
			
			
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
