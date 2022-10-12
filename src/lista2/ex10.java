/*
 10.Faça um Programa que pergunte em que turno você estuda. Peça 
para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a 
mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor 
Inválido!", conforme o caso.
 */
package lista2;

import java.util.Scanner;

public class ex10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite M-matutino ou V-Vespertino ou N- Noturno: ");
		String turno = entrada.next();
		
		switch(turno) {
		case "m":
		case "M":
			System.out.println("matutino");
			break;
		case "v":
		case "V":
			System.out.println("vespetino");
			break;
		case "n":
		case "N":
			System.out.println("noturno");
			break;
		default:
			System.out.println("valor invalido");
		}
		entrada.close();	
	}

}
