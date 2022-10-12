/*
 5. Altere o programa anterior permitindo ao usuário informar as 
populações e as taxas de crescimento iniciais. Valide a entrada e 
permita repetir a operação.
 */
package lista.loops3;

import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double popA;
		double popB;
		double taxaA;
		double taxaB;
		boolean verifica = false;
		int cont = 0;
		
		do {
			System.out.println("digite a população A: ");
			popA = entrada.nextDouble();
			
			if(popA > 0) {
				System.out.println("população valida");
				verifica = true;
			}else {
				System.out.println("população invalida");
			}
			
		}while(!verifica);
		
		verifica = false;
		
		do {
			System.out.println("digite a população B: ");
			popB = entrada.nextDouble();
			
			if(popB > 0) {
				System.out.println("população valida");
				verifica = true;
			}else {
				System.out.println("população invalida");
			}
			
		}while(!verifica);
		
		verifica = false;
		
		do {
			System.out.println("digite a taxa A: ");
			taxaA = entrada.nextDouble();
			
			if(taxaA > 0) {
				System.out.println("taxa da população valida");
				verifica = true;
			}else {
				System.out.println("taxa da opulação invalida");
			}
			
		}while(!verifica);
		
		verifica = false;
		
		do {
			System.out.println("digite a taxa B: ");
			taxaB = entrada.nextDouble();
			
			if(taxaB > 0) {
				System.out.println("taxa da população valida");
				verifica = true;
			}else {
				System.out.println("taxa da opulação invalida");
			}
			
		}while(!verifica);
		
		
		while(popA <= popB) {
			popA += (popA /100)*taxaA;
			popB += (popB /100 )*taxaB;
			cont++;
		
			
		}
		System.out.println("a população A " + popA);
		System.out.println("a população B " + popB);
		System.out.println("taxa A " + taxaA);
		System.out.println("taxa B " + taxaB);
		System.out.println("e o ano é " + cont);
		
		entrada.close();
		
		
		
		
		
	}

}
