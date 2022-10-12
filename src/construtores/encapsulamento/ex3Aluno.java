package construtores.encapsulamento;

import java.util.Scanner;


public class ex3Aluno {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		ex3 aluno = new ex3();
		
		System.out.println("digite o nome do aluno: ");
		aluno.setNome(entrada.next());
		
		System.out.println("digite a matricula: ");
		aluno.setMatricula(entrada.next());
		
		System.out.println("digite o nome do curso: ");
		aluno.setNomeCurso(entrada.next());
		
		for(int i = 0; i < aluno.getNomeDisciplina().length; i++) {
			System.out.println("entre com o nome da disciplica " + i);
			aluno.setNomeDisciplinaPos(i, entrada.next());
			
			
		}
		for(int i = 0; i < aluno.getNotasDisciplinas().length; i++) {
			System.out.println("obtento nas notas das disciplinas " + aluno.getNomeDisciplina()[i]);
			for(int j = 0; j < aluno.getNotasDisciplinas()[i].length; j++) {
				System.out.println("digite a nota " + (j+1) + "°: ");
				aluno.setNomePosIJ(i, j, entrada.nextDouble());
			}
			
			
		}
		aluno.mostraInfo();
		
		for(int i = 0; i < aluno.getNomeDisciplina().length; i++) {
			if(aluno.verificarAprovado(i)) {
				System.out.println("Disciplina " + aluno.getNomeDisciplina()[i] + " Aprovado");
			}else {
				System.out.println("Disciplina " + aluno.getNomeDisciplina()[i] + " Reprovado");
			}
		}
		entrada.close();
		
	}

}
