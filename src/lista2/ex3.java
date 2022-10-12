/*
 3. Faça um Programa que verifique se uma letra digitada é "F" ou "M". 
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
 */
package lista2;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("digite seu sexo feminino = F e masculino = M : ");
	String sexo = entrada.next();
	
	if(sexo.equalsIgnoreCase("F")) {
		System.out.println("você é do sexo feminino");
	}else if(sexo.equalsIgnoreCase("M")) {
		System.out.println("você é do sexo masculino");
	}else {
		System.out.println("sexo invalido enexistente");
	}
	
	entrada.close();
			
			
	
	
	

	}

}
