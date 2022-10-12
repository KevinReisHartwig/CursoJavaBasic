package classes.metodos;

import java.util.Scanner;

public class ex3Aluno {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		ex3 aluno = new ex3();
		
		System.out.println("digite o nome do aluno: ");
		aluno.nome = entrada.next();
		
		System.out.println("digite a matricula: ");
		aluno.matricula = entrada.next();
		
		System.out.println("digite o nome do curso: ");
		aluno.nomeCurso = entrada.next();
		
		for(int i = 0; i < aluno.nomeDisciplina.length; i++) {
			System.out.println("entre com o nome da disciplica " + i);
			aluno.nomeDisciplina[i] = entrada.next();
			
		}
		for(int i = 0; i < aluno.notasDisciplinas.length; i++) {
			System.out.println("obtento nas notas das disciplinas " + aluno.nomeDisciplina[i]);
			for(int j = 0; j < aluno.notasDisciplinas[i].length; j++) {
				System.out.println("digite a nota " + (j+1) + "°: ");
				aluno.notasDisciplinas[i][j] = entrada.nextDouble();
			}
			
			
		}
		aluno.mostraInfo();
		
		for(int i = 0; i < aluno.nomeDisciplina.length; i++) {
			if(aluno.verificarAprovado(i)) {
				System.out.println("Disciplina " + aluno.nomeDisciplina[i] + " Aprovado");
			}else {
				System.out.println("Disciplina " + aluno.nomeDisciplina[i] + " Reprovado");
			}
		}
		entrada.close();
		
	}

}
