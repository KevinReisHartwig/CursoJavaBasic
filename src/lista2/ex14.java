/*
 14.Faça um programa que lê as duas notas parciais obtidas por um aluno 
numa disciplina ao longo de um semestre, e calcule a sua média. A 
atribuição de conceitos obedece à tabela abaixo:
o Média de Aproveitamento Conceito 
o Entre 9.0 e 10.0 A 
o Entre 7.5 e 9.0 B 
o Entre 6.0 e 7.5 C 
o Entre 4.0 e 6.0 D 
o Entre 4.0 e zero E
O algoritmo deve mostrar na tela as notas, a média, o conceito 
correspondente e a mensagem “APROVADO” se o conceito for 
A, B ou C ou “REPROVADO” se o conceito for D ou E
 */
package lista2;

import java.util.Scanner;

public class ex14 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("informe a primera nota: ");
		double nota1 = entrada.nextDouble();
		
		System.out.println("informe a segunda nota: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		String aproveitamento = "";
		
		if(media > 9 && media <= 10) {
			aproveitamento = "A";
			
		}else if(media > 7.5 && media <= 9.0 ) {
			aproveitamento = "B";
			
		}else if(media > 6 && media <= 7.5 ) {
			aproveitamento = "C";
			
		}else if(media > 4 && media <= 6 ) {
			aproveitamento = "D";
			
		}else if(media >= 0 && media <= 4 ) {
			aproveitamento = "E";
			
		}
		System.out.println("sua media foi de " + media);
		System.out.println("seu aproveitamento foi " + aproveitamento);
		
		switch(aproveitamento) {
		case "A":
		case "B":
		case "C":
			System.out.println("Aprovado");
		break;
		case "D":
		case "E":
			System.out.println("Reprovado");
			break;
		}
		entrada.close();
		
		
		
		
		
		
	}

}
