//peça quatro notas e mostre a media
package lista1;

import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite a primeira nota: ");
		double nota1 = entrada.nextDouble();
		
		System.out.println("digite a segunda nota: ");
		double nota2 = entrada.nextDouble();
		
		System.out.println("digite a terceita nota: ");
		double nota3 = entrada.nextDouble();
		
		System.out.println("digite a quarta nota: ");
		double nota4 = entrada.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("a media é " + media);
		
		entrada.close();
		
		
		
	}

}
