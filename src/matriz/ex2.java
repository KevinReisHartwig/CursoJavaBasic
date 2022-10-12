/*
 2. Gere e imprima uma matriz M 10x10 com valores aleatórios entre 
0-9. Após isso indique qual é o maior e o menor valor da linha 5 e 
qual é o maior e o menor valor da coluna 7.
 */
package matriz;

import java.util.Random;

public class ex2 {
	public static void main(String[] args) {
		int[][] valoresAleatorios = new int[10][10];
		Random numerosRandom = new Random();

		for (int i = 0; i < valoresAleatorios.length; i++) {
			for (int j = 0; j < valoresAleatorios[i].length; j++) {
				valoresAleatorios[i][j] = numerosRandom.nextInt(10);

				System.out.print(valoresAleatorios[i][j] + " ");

			}
			System.out.println();

		}
		int maiorL5 = 0;
		int menorL5 = 11;
		int linha5 = 5;
		for (int i = 0; i < valoresAleatorios[linha5].length; i++) {
			if (valoresAleatorios[linha5][i] > maiorL5) {
				maiorL5 = valoresAleatorios[linha5][i];

			}
			if (valoresAleatorios[linha5][i] < menorL5) {
				menorL5 = valoresAleatorios[linha5][i];
			}
		}
		System.out.println("o maior da linha 5 é " + maiorL5);
		System.out.println("o menor da linha 5 é " + menorL5);

		int maiorC7 = 0;
		int menorC7 = 11;
		int col7 = 7;

		for (int i = 0; i < valoresAleatorios.length; i++) {
			if (valoresAleatorios[i][col7] > maiorC7) {
				maiorC7 = valoresAleatorios[i][col7];
			}
			if (valoresAleatorios[i][col7] < menorC7) {
				menorC7 = valoresAleatorios[i][col7];
			}
		}
		System.out.println("o maior da coluna 7 é " + maiorC7);
		System.out.println("o menor da coluna 7 é " + menorC7);

	}

}
