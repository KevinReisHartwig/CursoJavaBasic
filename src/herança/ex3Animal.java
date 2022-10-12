package herança;

public class ex3Animal {
	private String nome;
	private int comprimento;
	private int patas;
	private String cor;
	private String ambiente;
	private double velocidae;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getComprimento() {
		return comprimento;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public double getVelocidae() {
		return velocidae;
	}
	public void setVelocidae(double velocidae) {
		this.velocidae = velocidae;
	}
	@Override
	public String toString() {
		return "ex3Animal [nome=" + nome + ", comprimento=" + comprimento + ", patas=" + patas + ", cor=" + cor
				+ ", ambiente=" + ambiente + ", velocidae=" + velocidae + "]";
	}
	
	
	
	
	

}
