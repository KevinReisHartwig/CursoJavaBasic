/*
 1. Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-
9. Após isso determine o maior número da matriz e a sua posição 
(linha, coluna).
 */
package matriz;

import java.util.Random;

public class ex1 {
	public static void main(String[] args) {

		int[][] numerosAleatorios = new int[4][4];

		Random numerosRandom = new Random();

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios.length; j++) {
				numerosAleatorios[i][j] = numerosRandom.nextInt(10);
			}

		}
		int maior = 0;
		int linha = 0;
		int coluna = 0;
		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios.length; j++) {
				if (numerosAleatorios[i][j] > maior) {
					maior = numerosAleatorios[i][j];
					linha = i;
					coluna = j;
				}

			}
		}
		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios.length; j++) {
				System.out.print(numerosAleatorios[i][j] + " ");

			}
			System.out.println();

		}

		System.out.println("o maior valor é " + maior);
		System.out.println("esta na linha " + linha);
		System.out.println("e na coluna " + coluna);

	}

}
