/*
 4. Faça um Programa que verifique se uma letra digitada é vogal ou 
consoante.
 */
package lista2;

import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite uma letra: ");
		String letra = entrada.next();
		
		/*if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
			System.out.println("é vogal");
		}else {
			System.out.println("consoante");
		}*/
			
			
		if(letra.length() > 1) {
			System.out.println("não é uma letra");
		}else {
			
		
	
		switch(letra) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
		case "A":
		case "E":
		case "O":
		case "U":
		case "I": 
		System.out.println("vogal");
		break;
		default:
			System.out.println("consoante");
		
		
		}
		}
		entrada.close();
	}
}
