/*
 5. Modifique o programa anterior de maneira a guardar os 
compromissos de todo o ano, organizados por mês, dia e hora 
(só 8 horas por dia).
 */
package matriz;

import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String[][][] compromissos = new String[12][31][8];
		boolean sair = false;
		byte opcao;
		while (!sair) {
			System.out.println("digite 1 para adicionar compromisso ");
			System.out.println("digite 2 para verificar compromisso ");
			System.out.println("digite 0 para sair: ");

			opcao = entrada.nextByte();

			if (opcao == 1) { // adicionar compromisso
				boolean mesValido = false;
				int mes = 0;
				while (!mesValido) {
					System.out.println("entre com o mês: ");
					mes = entrada.nextInt();

					if (mes > 0 && mes <= 12) {
						mesValido = true;

					} else {
						System.out.println("digite novamente o mês esta invalido: ");
					}

				}

				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println("entre com o dia do mês: ");
					dia = entrada.nextInt();

					if (dia > 0 && dia <= 31) {
						diaValido = true;

					} else {
						System.out.println("digite novamente dia invalido: ");
					}

				}
				boolean horaValido = false;
				int hora = 0;
				while (!horaValido) {
					System.out.println("digite a hora do dia: ");
					hora = entrada.nextInt();

					if (hora >= 0 && hora <= 8) {
						horaValido = true;

					} else {
						System.out.println("digite novamente hora invalida: ");
					}
				}
				mes--;
				dia--;
				System.out.println("digite o compromisso: ");
				compromissos[mes][dia][hora] = entrada.next();

			} else if (opcao == 2) { // verificar compromisso
				boolean mesValido = false;
				int mes = 0;
				while (!mesValido) {
					System.out.println("entre com o mês: ");
					mes = entrada.nextInt();

					if (mes > 0 && mes <= 12) {
						mesValido = true;

					} else {
						System.out.println("digite novamente mês esta invalido: ");
					}

				}

				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println("entre com o dia do mês: ");
					dia = entrada.nextInt();

					if (dia > 0 && dia <= 31) {
						diaValido = true;

					} else {
						System.out.println("digite novamente o dia esta invalido: ");
					}

				}
				boolean horaValido = false;
				int hora = 0;
				while (!horaValido) {
					System.out.println("digite a hora do dia: ");
					hora = entrada.nextInt();

					if (hora >= 0 && hora <= 8) {
						horaValido = true;

					} else {
						System.out.println("digite novamente hora invalida: ");
					}
				}
				mes--;
				dia--;
				System.out.println("o compromisso agendado é: ");
				System.out.println(compromissos[mes][dia][hora]);

			} else if (opcao == 0) {// sair
				sair = true;
			} else {
				System.out.println("digite novamente numero invalido: ");
			}
		}
		entrada.close();
	}

}
