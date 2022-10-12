/*
 13.Faça um Programa que pergunte quanto você ganha por hora e o 
número de horas trabalhadas no mês. Calcule e mostre o total do seu 
salário no referido mês, sabendo-se que são descontados 11% para o 
Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um 
programa que nos dê:
. salário bruto.
a. quanto pagou ao INSS.
b. quanto pagou ao sindicato.
c. o salário líquido.
d. calcule os descontos e o salário líquido, conforme a tabela 
abaixo:
+ Salário Bruto : R$ - IR (11%) : R$ - INSS 
(8%) : R$ - Sindicato ( 5%) : R$ = Salário
Liquido : R$
Obs.: Salário Bruto - Descontos = Salário Líquido
 */
package lista1;

import java.util.Scanner;

public class ex13 {
	public static void main(String[] args) {
		
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("digite seu valor/hora: ");
	double valorHora = entrada.nextDouble();
	
	System.out.println("digite suas horas trabalhadas: ");
	double horas = entrada.nextDouble();
	
	double salarioBruto = valorHora * horas;
	double inss = (salarioBruto / 100) * 8;
	double sindicato = (salarioBruto / 100) * 5;
	double ir = (salarioBruto / 100) * 11;
	double totalDesconto = inss + sindicato + ir;
	double salarioLiquido = salarioBruto - totalDesconto;
	
	
	
	
	System.out.println("seu salario bruto é de " + salarioBruto);
	System.out.println("seu inss é de " + inss);
	System.out.println("seu sindicato é de " + sindicato);
	System.out.println("seu IR é de " + ir);
	System.out.println("seu salario liquido é de " + salarioLiquido);
	
	entrada.close();

}
}