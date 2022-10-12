/*
 10.Faça um Programa que peça a temperatura em graus Celsius, 
transforme e mostre em graus Farenheit.
 */
package lista1;

import java.util.Scanner;

public class ex10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite a temperatura em celcius: ");
		double temperaturaC = entrada.nextDouble();
		
		double temperaturaFar = (temperaturaC * 1.8) + 32;
		
		System.out.println(temperaturaC+ " Farenheit em celcius é " + temperaturaFar);
		
		entrada.close();
		
		
		
		
		
	}

}
