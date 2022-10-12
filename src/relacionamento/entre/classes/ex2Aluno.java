package relacionamento.entre.classes;

public class ex2Aluno {
	private String nome;
	private String matricula;
	private double[] nota;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double[] getNota() {
		return nota;
	}

	public void setNota(double[] nota) {
		this.nota = nota;
	}

	public String obterInfo() {
		String info = "nome do aluno = " + nome + "";
		info += "Matricula = " + matricula + " ; ";
		info += "notas: ";

		double soma = 0;
		for (double notas : nota) {
			soma += notas;
			info += notas + " ";

		}
		double media = soma / 4;
		info += "\n" + "media = " + media + " - ";
		if (media >= 7) {
			info += "aprovado!";
		} else {
			info += "aprovado!";
		}

		return info;
	}

	public double obterMedia() {
		double soma = 0;
		for (double notas : nota) {
			soma += notas;

		}
		return soma / 4;

	}

}
