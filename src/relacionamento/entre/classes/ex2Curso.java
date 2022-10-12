package relacionamento.entre.classes;

public class ex2Curso {
	private String nome;
	private String horario;
	private ex2Professor professor;
	private ex2Aluno[] alunos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public ex2Professor getProfessor() {
		return professor;
	}

	public void setProfessor(ex2Professor professor) {
		this.professor = professor;
	}

	public ex2Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(ex2Aluno[] alunos) {
		this.alunos = alunos;
	}

	public String obterInfo() {
		String info = "nome do curso = " + nome + "\n";

		if (professor != null) {
			info += professor.obterInfo();
		}

		if (alunos != null) {
			System.out.println("---alunos---");
			for (ex2Aluno aluno : alunos) {
				if (aluno != null) {
					info += aluno.obterInfo();
					info += "\n";

				}

			}
			info += "\nMedia turma = " + obterMediaTurma();
		}

		return info;

	}

	public double obterMediaTurma() {
		double soma = 0;
		for (ex2Aluno aluno : alunos) {
			if (aluno != null) {
				soma += aluno.obterMedia();
			}
		}
		return soma / alunos.length;

	}

}
