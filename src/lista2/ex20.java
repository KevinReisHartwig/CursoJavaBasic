/*
 20.Faça um programa que faça 5 perguntas para uma pessoa sobre um 
crime. As perguntas são:
. "Telefonou para a vítima?"
a. "Esteve no local do crime?"
b. System.out.println("Telefonou para a vítima?");
b. "Mora perto da vítima?"
c. "Devia para a vítima?"
d. "Já trabalhou com a vítima?" O programa deve no final emitir 
uma classificação sobre a participação da pessoa no crime. Se 
a pessoa responder positivamente a 2 questões ela deve ser 
classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 
como "Assassino". Caso contrário, ele será classificado como 
"Inocente".
 */
package lista2;

import java.util.Scanner;

public class ex20 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int cont = 0;
		
		System.out.println("Telefonou para a vítima?");
		String resp1 = entrada.next();
		
		System.out.println("Mora perto da vítima?");
		String resp2 = entrada.next();
		
		System.out.println("Devia para a vítima?");
		String resp3 = entrada.next();
		
		System.out.println("Já trabalhou com a vítima?");
		String resp4 = entrada.next();
		
		System.out.println("Esteve no local do crime?");
		String resp5 = entrada.next();
		
		if(resp1.equalsIgnoreCase("s")) {
			cont++;
		}
		if(resp2.equalsIgnoreCase("s")) {
			cont++;
		}
		if(resp3.equalsIgnoreCase("s")) {
			cont++;
		}
		if(resp4.equalsIgnoreCase("s")) {
			cont++;
		}
		if(resp5.equalsIgnoreCase("s")) {
			cont++;
		}
		if(cont == 2) {
			System.out.println("Suspeita");
		}else if(cont == 3 || cont == 4) {
			System.out.println("Cúmplice");
		}else if(cont == 5) {
			System.out.println("assasino");
		}else {
			System.out.println("vitima");
		}
		entrada.close();
	}
	

}
