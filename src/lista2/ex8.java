/*
 8. Faça um programa que pergunte o preço de três produtos e informe 
qual produto você deve comprar, sabendo que a decisão é sempre 
pelo mais barato. */
package lista2;

import java.util.Scanner;

public class ex8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite o primeiro produto: ");
		double produto1 = entrada.nextDouble();
		
		System.out.println("digite o segundo produto: ");
		double produto2 = entrada.nextDouble();
		
		System.out.println("digite o terceiro produto: ");
		double produto3 = entrada.nextDouble();
		
		if(produto1 < produto2 && produto1 < produto3) {
			System.out.println("voce deve comprar o primeiro produto");
		
		}else if(produto2 < produto1 && produto2 < produto3) {
			System.out.println("voce deve comprar o segundo produto");
		
		}else if(produto3 < produto2 && produto3 < produto1) {
			System.out.println("voce de deve comprar o terceiro produto");
		
		}else {
			System.out.println("todos tem o mesmo preço voce escolhe");
		}
	entrada.close();
	}
	

}
