// faça um que peça o raio do circulo, e mostre sua area
package lista1;

import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite o raio: ");
		double raio = entrada.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("a area do raio " + raio + " é " + area);
		
		entrada.close();
			
		
	}

}
