package construtores.encapsulamento;

public class ex3 {
	private String nome;
	private String matricula;
	private String nomeCurso;
	private String [] nomeDisciplina;
	private double [][] notasDisciplinas;
	
	public ex3() {
		nomeDisciplina = new String[3];
		notasDisciplinas = new double[3][4];
		
	}

	public ex3(String nome, String matricula, String nomeCurso, String[] nomeDisciplina, double[][] notasDisciplinas) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.nomeCurso = nomeCurso;
		this.nomeDisciplina = new String[3];
		this.notasDisciplinas = new double[3][4];
	}

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

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String[] getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String[] nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public double[][] getNotasDisciplinas() {
		return notasDisciplinas;
	}

	public void setNotasDisciplinas(double[][] notasDisciplinas) {
		this.notasDisciplinas = notasDisciplinas;
	}
	
	public void mostraInfo() {
		System.out.println("nome: " + nome);
		System.out.println("nome do curso: " + nomeCurso);
		System.out.println("matricula: " + matricula);
		
		for(int i = 0; i < notasDisciplinas.length; i++) {
			System.out.println("notas da disciplina " + nomeDisciplina[i]);
			for(int j = 0; j < notasDisciplinas[i].length; j++) {
				System.out.println(notasDisciplinas[i][j] + " ");
			}
			System.out.println();
			
		}
		
	}
	
	public boolean verificarAprovado(int indice) {
		double soma = 0;
		
		for(int i = 0; i < notasDisciplinas[indice].length; i++) {
			soma += notasDisciplinas[indice][i];
		}
		
		double media = soma/4;
		
		if(media >= 7) {
			return true;
		}
		
		return false;
				
		
	}
	public void setNomeDisciplinaPos(int pos, String nomeDisciplina) {
		this.nomeDisciplina[pos] = nomeDisciplina;
	}
	public void setNomePosIJ(int posI, int posJ, double nota) {
		this.notasDisciplinas[posI][posJ] = nota;
		
	}
	

}
