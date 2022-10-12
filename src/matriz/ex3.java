/*
 3. Capture do teclado valores para preenchimento de uma matriz M 
3x3. Após a captura imprima a matriz criada e encontre a 
quantidade de números pares, a quantidade de números ímpares.
 */
package matriz;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[][] vetor = new int[3][3];

		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor[i].length; j++) {
				System.out.print("entre com um valor da pos i,j {" + i + "," + j + "} : ");

				vetor[i][j] = entrada.nextInt();

			}

		}
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor[i].length; j++) {
				System.out.print(vetor[i][j] + " ");

			}
			System.out.println();
		}
		int numPares = 0;
		int numImpas = 0;
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor[i].length; j++) {
				if (vetor[i][j] % 2 == 0) {
					numPares++;
				} else {
					numImpas++;
				}

			}
		}
		System.out.println("numeros pares = " + numPares);
		System.out.println("numeros impas= " + numImpas);

		entrada.close();

	}

}
