/*
 2. Faça um programa que leia um nome de usuário e a sua senha e não 
aceite a senha igual ao nome do usuário, mostrando uma mensagem 
de erro e voltando a pedir as informações
 */
package lista.loops3;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String nome;
		String senha;
		boolean valida = false;
		
		do {
			System.out.println("digite o nome do usuario: ");
			nome = entrada.next();
			
			System.out.println("digite a senha: ");
			senha = entrada.next();
			
			if(nome.equalsIgnoreCase(senha)) {
				System.out.println("senha igual ao nome de usuario digite novamente");
			}else {
				System.out.println("senha e usuario validas");
				valida = true;
			}
		}while(!valida);
		entrada.close();
	}

}
