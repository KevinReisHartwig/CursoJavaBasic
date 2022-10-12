package herança;

public class ex3Mamifero extends ex3Animal{
	
	private String nome;
	private String alimento;
	private int patas;
	private String cor;
	private String ambiente;
	private double velocidae;
	
	
	public ex3Mamifero() {
		this.setNome("urso do canada");
		this.alimento = "mel";
		this.setComprimento(180);
		this.setPatas(4);
		this.setCor("vermelho");
		this.setAmbiente("terra");
		this.setVelocidae(0.5);
		
		
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	@Override
	public String toString() {
		return "ex3Mamifero [nome=" + nome + ", alimento=" + alimento + ", patas=" + patas + ", cor=" + cor
				+ ", ambiente=" + ambiente + ", velocidae=" + velocidae + "]";
	}

	
	
	
	

}
