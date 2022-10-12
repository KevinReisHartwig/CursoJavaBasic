/*
 4. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de 
mesmo tamanho, sendo que cada elemento do vetor B deverá ser a 
raiz quadrada do respectivo elemento de A, ou seja:
B[i] = sqrt(A[i]). 
 */
package lista.arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double[] vetorA = new double[15];
		double[] vetorB = new double[vetorA.length];
		
		DecimalFormat df = new DecimalFormat("###,###,###");  //tirar as casas decimais
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("digite o valor na posição " +i+"=");
			vetorA[i] = entrada.nextInt();
			vetorB[i] = Math.sqrt(vetorA[i]);
			
			
			
		}
		System.out.println("vetor A: ");
		for(int i=0; i < vetorA.length; i++) {
			System.out.print(vetorA[i]+" ");
			
		}
		System.out.println(" ");
		System.out.println("vetor B: ");
		for(int i=0; i < vetorB.length; i++) {
			System.out.print(df.format(vetorB[i])+" ");
		}
		entrada.close();
	}

}
