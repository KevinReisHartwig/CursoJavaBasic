/*Faça um Programa que pergunte quanto você ganha por hora e o 
número de horas trabalhadas no mês. Calcule e mostre o total do seu 
salário no referido mês.*/
package lista1;

import java.util.Scanner;

public class ex8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite seu valor/hora: ");
		double valorHora = entrada.nextDouble();
		
		System.out.println("digite suas horas trabalhadas: ");
		double horas = entrada.nextDouble();
		
		double salario = valorHora * horas;
		
		System.out.println("seu salario é de " + salario);
		
		entrada.close();
		
	}

}
