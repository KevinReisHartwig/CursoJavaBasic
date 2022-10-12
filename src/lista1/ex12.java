/*
 12.Tendo como dados de entrada a altura de uma pessoa, construa um 
algoritmo que calcule seu peso ideal, usando a seguinte fórmula: 
(72.7*altura) - 58
 */
package lista1;

import java.util.Scanner;

public class ex12 {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("entre com a altura: ");
	double altura = entrada.nextDouble();
	
	double pesoIdeal = (72.7*altura) - 58;
	
	System.out.println("o peso ideal para sua altura é " + pesoIdeal);
	
	entrada.close();


}
}
