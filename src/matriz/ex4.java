/*
 4. Faça um programa para armazenar em uma matriz os 
compromissos de uma agenda pessoal. Cada dia do mês deve 
conter 24 horas, onde para cada uma destas 24 horas podemos 
associar um tarefa específica (compromisso agendado). O 
programa deve ter um menu onde o usuário indica o dia do mês 
que deseja alterar e a hora, entrando em seguida com o 
compromisso, ou então, o usuário pode também consultar a 
agenda, fornecendo o dia e a hora para obter o 
compromisso armazenado.
 */
package matriz;

import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String[][] compromissos = new String[31][24];
		boolean sair = false;
		byte opcao;
		while (!sair) {
			System.out.println("digite 1 para adicionar compromisso ");
			System.out.println("digite 2 para verificar compromisso ");
			System.out.println("digite 0 para sair: ");

			opcao = entrada.nextByte();

			if (opcao == 1) { // adicionar compromisso
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

					if (hora >= 0 && hora <= 24) {
						horaValido = true;

					} else {
						System.out.println("digite novamente hora invalida: ");
					}
				}
				dia--;
				System.out.println("digite o compromisso: ");
				compromissos[dia][hora] = entrada.next();

			} else if (opcao == 2) { // verificar compromisso
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

					if (hora >= 0 && hora <= 24) {
						horaValido = true;

					} else {
						System.out.println("digite novamente hora invalida: ");
					}
				}
				dia--;
				System.out.println("o compromisso agendado é: ");
				System.out.println(compromissos[dia][hora]);

			} else if (opcao == 0) {// sair
				sair = true;
			} else {
				System.out.println("digite novamente numero invalido: ");
			}
		}
		entrada.close();
	}

}
