/*
 11.As Organizações Tabajara resolveram dar um aumento de salário aos 
seus colaboradores e lhe contraram para desenvolver o programa que 
calculará os reajustes.
o Faça um programa que recebe o salário de um colaborador e o 
reajuste segundo o seguinte critério, baseado no salário atual:
o salários até R$ 280,00 (incluindo) : aumento de 20%
o salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
o salários de R$ 1500,00 em diante : aumento de 5% Após o 
aumento ser realizado, informe na tela:
o o salário antes do reajuste;
o o percentual de aumento aplicado;
o o valor do aumento;
o o novo salário, após o aumento.
 */
package lista2;

import java.util.Scanner;

public class ex11 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite seu salario: ");
		double salario = entrada.nextDouble();
		int porcentual = 0;
		if(salario <= 280) {
			porcentual = 20;
			
		}else if(salario > 280 && salario <= 700) {
			porcentual = 15;
		}else if(salario > 700 && salario <= 1500) {
			porcentual = 10;
		}else if(salario > 1500) {
			porcentual = 5;
		}
		double reajuste = (salario/100) * porcentual;
		
		System.out.println("seu salario antigo era de R$ "+salario);
		System.out.println("seu salario novo é de R$ " + (salario+reajuste));
		System.out.println("o percentual de aumento é " + porcentual);
		System.out.println("a quantidade do aumento é " + reajuste);
		entrada.close();
	}
	

}
