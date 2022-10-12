/*
24.Faça um Programa que leia 2 números e em seguida pergunte ao 
usuário qual operação ele deseja realizar. O resultado da operação 
deve ser acompanhado de uma frase que diga se o número é:
. par ou ímpar;
a. positivo ou negativo;
b. inteiro ou decimal.

 */
package lista2;

import java.util.Scanner;

public class ex19 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int resultado = 0;
		boolean validade = true;
		System.out.println("digite o primeiro numero: ");
		int num1 = entrada.nextInt();
		System.out.println("digite o segundo numero: ");
		int num2 = entrada.nextInt();
		System.out.println("digite sua operação + - * /: ");
		String operacao = entrada.next();
		
		
		switch(operacao) {
		case "-":
			resultado = num1 - num2;
			break;
		case "+":
			resultado = num1 + num2;
			break;
		case "*":
			resultado = num1 * num2;
			break;
		case "/":
			resultado = num1 * num2;
			break;
		default:
			System.out.println("operação invalida");
			validade = false;
			
		}
		
		if(validade) {
			if(resultado >= 0) {
				System.out.println("positivo");
			}else {
				System.out.println("negativo");
			}
			if(resultado % 2 == 0) {
				System.out.println("par");
			}else {
				System.out.println("impar");
			}
		}
		
		entrada.close();
		
		
		
	}

}
