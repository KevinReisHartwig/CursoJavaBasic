//Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

package lista1;

import java.util.Scanner;

public class ex7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite o tamanho do quadrado: ");
		double lado = entrada.nextDouble();
		
		double area = Math.pow(lado, 2);
		
		System.out.println("a area do quadrado é " + area);
		
		System.out.println("o dobro da area do quadrado é " + (area*2));
		
		entrada.close();
		
		
		
		
		
	}

}
