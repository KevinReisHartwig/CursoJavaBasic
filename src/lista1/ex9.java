/*9. Faça um Programa que peça a temperatura em graus Farenheit, 
transforme e mostre a temperatura em graus Celsius
 */
package lista1;

import java.util.Scanner;

public class ex9 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite a temperatura em farenheit: ");
		double temperaturaFar = entrada.nextDouble();
		
		double temperaturaC = (5 * (temperaturaFar-32) / 9);
		
		System.out.println(temperaturaFar+ " Farenheit em celcius é " + temperaturaC);
		
		entrada.close();
		
		
		
		
	}

}
