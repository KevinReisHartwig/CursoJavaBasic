/*
 15.Faça um Programa que peça os 3 lados de um triângulo. O programa 
deverá informar se os valores podem ser um triângulo. Indique, caso 
os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou 
escaleno.
o Dicas:
o Três lados formam um triângulo quando a soma de quaisquer 
dois lados for maior que o terceiro;
o Triângulo Equilátero: três lados iguais;
o Triângulo Isósceles: quaisquer dois lados iguais;
o Triângulo Escaleno: três lados diferentes;

 */
package lista2;

import java.util.Scanner;

public class ex15 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("informe o lado 1: ");
		int lado1 = entrada.nextInt();
		
		System.out.println("informe o lado 2: ");
		int lado2 = entrada.nextInt();
		
		System.out.println("informe o lado 3: ");
		int lado3 = entrada.nextInt();
		
		if((lado1 + lado2) > lado3 || 
				(lado2 + lado3) > lado1 ||
				(lado3 + lado1) > lado2) {
			
			if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
				System.out.println("triangulo equilatero");
			}else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.println("triangulo escaleno");
			}else if(lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
				System.out.println("triangulo isoceles");
			}
		
	}else {
		System.out.println("triangulo invalido");
	}
		entrada.close();
	}
}
