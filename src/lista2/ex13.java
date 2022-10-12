/*
 13.Faça um Programa que leia um número e exiba o dia correspondente 
da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve 
aparecer valor inválido.
 */
package lista2;

import java.util.Scanner;

public class ex13 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite o dia da semana: ");
		int dia = entrada.nextInt();
		
		switch(dia) {
		case 1:
			System.out.println("domingo");
			break;
		case 7:
			System.out.println("sabado");
			break;
		case 2:
			System.out.println("segunda");
			break;
		case 3:
			System.out.println("terça");
			break;
		case 4:
			System.out.println("quarta");
			break;
		case 5:
			System.out.println("quinta");
			break;
		case 6:
			System.out.println("sexta");
			break;
		default:
			System.out.println("dia invalido");
			
			
			
		}
		entrada.close();
		
		
		
	}

}
