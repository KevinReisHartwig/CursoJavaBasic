/*
 2. Escreva	uma	classe	para	representar	um	Curso,	que	tem	nome	e	horário.	
Cada	curso	tem	um	Professor,	que	possui	nome,	departamento	e	email.	
Cada	Curso	também	pode	ter	vários	alunos	(tipo	Aluno).	Cada	Aluno	tem	
nome,	matricula	e	4	notas. Escreva	um	programa	teste	que	crie	um	Curso	
com	5	alunos,	e	que	preça	para	o	usuário	entrar	com	as	4	notas	de	cada	
aluno.	Ao	final,	imprima	a	média	de	cada	aluno,	se	o	mesmo	está	aprovado
(media	maior	ou	igual	a	7),	e	qual	é	a	média	da	turma
 */
package relacionamento.entre.classes;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("entre com o nome: ");
		String nome = entrada.next();

		System.out.println("entre com o horario do curso: ");
		String horario = entrada.next();

		System.out.println("entre com o nome do professor: ");
		String nomeProf = entrada.next();

		System.out.println("entre com o departamento do professor: ");
		String departamento = entrada.next();

		System.out.println("entre com o email do professor: ");
		String email = entrada.next();

		ex2Curso curso = new ex2Curso();
		curso.setNome(nome);
		curso.setHorario(horario);

		ex2Professor professor = new ex2Professor();
		professor.setNome(nomeProf);
		professor.setDepartamento(departamento);
		professor.setEmail(email);

		curso.setProfessor(professor);

		System.out.println("----alunos----");

		ex2Aluno[] alunos = new ex2Aluno[5];

		for (int i = 0; i < alunos.length; i++) {

			System.out.println("entre com o nome do aluno " + (i + 1));
			String nomeALuno = entrada.next();

			System.out.println("entre com o nome da matricula " + (i + 1));
			String nomeMatricula = entrada.next();

			double[] notas = new double[4];

			for (int j = 0; j < notas.length; j++) {
				System.out.println("entre com a nota " + (j + 1));
				notas[j] = entrada.nextDouble();
			}
			ex2Aluno aluno = new ex2Aluno();
			aluno.setNome(nomeALuno);
			aluno.setMatricula(nomeMatricula);
			aluno.setNota(notas);
			alunos[i] = aluno;
		}

		curso.setAlunos(alunos);

		System.out.println(curso.obterInfo());

		entrada.close();

	}

}
