/*
 1. Faça um programa que peça uma nota, entre zero e dez. Mostre uma 
mensagem caso o valor seja inválido e continue pedindo até que o 
usuário informe um valor válido
 */
package lista.loops3;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		boolean verifica = false;
		
		do {
			System.out.println("digite uma nota: ");
			double nota = entrada.nextDouble();
			
			if(nota >= 0 && nota <= 10) {
				System.out.println("voce digitou a nota " + nota);
				verifica = true;
			}else {
				System.out.println("nota invalida digite novamente!");
			}
			
		}while(verifica == false); // ou !verifica
		
		entrada.close();
		
	}

}
