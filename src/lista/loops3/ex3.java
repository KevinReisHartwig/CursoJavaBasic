/*
 * 3. Faça um programa que leia e valide as seguintes informações:
a. Nome: maior que 3 caracteres;
b. Idade: entre 0 e 150;
c. Salário: maior que zero;
d. Sexo: 'f' ou 'm';
e. Estado Civil: 's', 'c', 'v', 'd';
 */
package lista.loops3;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nome;
		int idade;
		double salario;
		String sexo;
		String estadoCivil;
		
		boolean verifica = false;
		do {
			System.out.println("digite seu nome: ");
			nome = entrada.next();
			
			if(nome.length() <= 3) {
				System.out.println("invalido pois tem 3 letras ou menos!");
			}else {
				System.out.println("voce digitou o nome corretamente");
				verifica = true;
			}
		}while(!verifica);
		
		verifica = false;
		
		do {
			System.out.println("digite sua idade: ");
			idade = entrada.nextInt();
			
			if(idade >= 0 && idade <=150) {
				System.out.println("idade valida");
				verifica = true;
					
			}else {
				System.out.println("idade invalida digite novamente");
			}
			
		}while(!verifica);
		
		verifica = false;
		
		do {
			System.out.println("digite seu salario: ");
			salario = entrada.nextDouble();
			
			if(salario > 0) {
				System.out.println("salario valido");
				verifica = true;
			}else {
				System.out.println("salario invalido digite novamente");
			}
		}while(!verifica);
		
		verifica = false;
		
		do {
			System.out.println("digite seu sexo F/M: ");
			sexo = entrada.next();
			
			if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				System.out.println("sexo valido");
				verifica = true;
				
			}else {
				System.out.println("sexo invalido digite novamente");
			}
				
				
		}while(!verifica);
		
		verifica = false;
		
		do {
			System.out.println("digite seu estado civil s,v,c,d: ");
			estadoCivil = entrada.next();
			
			if(estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("d")) {
				System.out.println("estado civil valido");
				verifica = true;
			}else {
				System.out.println("estado civil incorreto digite novamente");
			}
		}while(!verifica);
		
		entrada.close();
		
		
			
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
