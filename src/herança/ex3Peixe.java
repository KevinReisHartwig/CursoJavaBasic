package herança;

public class ex3Peixe extends ex3Animal{
	
	private String nome;
	private String caracteristicas;
	private int comprimento;
	private String cor;
	private String ambiente;
	private double velocidae;
	
	
	public ex3Peixe() {
		this.setNome("tubarão");
		this.setAmbiente("mar");
		this.setCor("cinzento");
		this.caracteristicas = "barbatanas e cauda";
		this.setNome("tubarão");
		this.setComprimento(300);
		this.setPatas(0);
		this.setVelocidae(1.5);
		
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	@Override
	public String toString() {
		return "ex3Peixe [nome=" + nome + ", caracteristicas=" + caracteristicas + ", comprimento=" + comprimento
				+ ", cor=" + cor + ", ambiente=" + ambiente + ", velocidae=" + velocidae + "]";
	}

	
	
	
	
	
	
	

}
