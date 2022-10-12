/*
16.Faça um programa que calcule as raízes de uma equação do segundo 
grau, na forma ax2 + bx + c. O programa deverá pedir os valores de a, 
b e c e fazer as consistências, informando ao usuário nas seguintes 
situações:
a. Se o usuário informar o valor de A igual a zero, a equação não é 
do segundo grau e o programa não deve fazer pedir os demais 
valores, sendo encerrado;
b. Se o delta calculado for negativo, a equação não possui raizes 
reais. Informe ao usuário e encerre o programa;
c. Se o delta calculado for igual a zero a equação possui apenas 
uma raiz real; informe-a ao usuário;
d. Se o delta for positivo, a equação possui duas raiz reais; 
informe-as ao usuário;
 */
package lista2;

import java.util.Scanner;

public class ex16 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("informe A: ");
		double a = entrada.nextInt();
		if(a <= 0) {
			System.out.println("não pode A menor que 0");
		}else {
			System.out.println("informe B: ");
			double b = entrada.nextInt();
			
			System.out.println("informe C: ");
			double c = entrada.nextInt();
			
			double delta = Math.pow(b, 2) - (4*a*c);
			
			if(delta < 0) {
				System.out.println("delta negativo");
			}else {
				double x1 = ((-b) + Math.sqrt(delta)) / (2*a);
				double x2 = ((-b) - Math.sqrt(delta)) / (2*a);
				System.out.println("x1 é " + x1);
				System.out.println("x2 é " + x2);
			}
			
			entrada.close();
		
			
		
		}
		
		
		
		
		
		
		
		
		
	}

}
