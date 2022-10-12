/*
 5. Faça um programa para a leitura de duas notas parciais de um aluno. 
O programa deve calcular a média alcançada por aluno e apresentar:
o A mensagem "Aprovado", se a média alcançada for maior ou 
igual a sete;
o A mensagem "Reprovado", se a média for menor do que sete;
o A mensagem "Aprovado com Distinção", se a média for igual a 
dez.
 */
package lista2;

import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite a primeira nota: ");
		double nota1 = entrada.nextDouble();
		
		System.out.println("digite a segunda nota: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2)/2;
				
		if(media >= 7 && media != 10) {
			System.out.println("aprovado");
		}else if(media == 10) {
			System.out.println("aprovado com distinção");
		}else {
			System.out.println("reprovado");
		}
		
		entrada.close();
		
	}

}
