/*
 Faça um programa que peça o tamanho de um arquivo para download 
(em MB) e a velocidade de um link de Internet (em Mbps), calcule e 
informe o tempo aproximado de download do arquivo usando este link 
(em minutos)
 */
package lista1;

import java.util.Scanner;

public class ex14 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite o tamanho do arquivo em mb: ");
		double arquivoMb = entrada.nextDouble();
		
		System.out.println("digite a velocidade da internet em MB: ");
		double velocidadeMb = entrada.nextDouble();
		
		double tempo = arquivoMb / velocidadeMb;
		
		System.out.println("o tempo para baixar em minutos é " + tempo);
		
		entrada.close();
	}

}
