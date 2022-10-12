//faça um programa que imprima dois numeros e mostra a soma
package lista1;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite o primeiro numero: ");
		int numeroUm = entrada.nextInt();
		
		System.out.println("digite o segundo numero: ");
		int numeroDois = entrada.nextInt();
		
		int resultado = numeroUm + numeroDois;
		
		System.out.println("a soma dos dois numeros é " + (numeroUm + numeroDois));
		
		System.out.println("a soma dos dois numeros é " + resultado);
		
		
		entrada.close();
	}

}
