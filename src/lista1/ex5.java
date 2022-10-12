// faça um programa que converta metros para centimetros
package lista1;

import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite a quantidade de metros: ");
		double metros = entrada.nextDouble();
		
		double cm = metros * 100;
		
		System.out.println(metros + " metros em centimetros é " + cm);
		
		entrada.close();
		
	}

}
