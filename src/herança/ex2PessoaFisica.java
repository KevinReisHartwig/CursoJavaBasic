package herança;

public class ex2PessoaFisica extends ex2Pessoa{
	
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public double calcularImposto() {
		
		double renda = this.getRendaBruta();
		
		if(renda <= 1440) {
			return 0;
		}
		
		if(renda > 1400 && renda <= 2100) {
			return (renda * 0.10) - 100;
		}
		
		if(renda > 2100 && renda <= 2800) {
			return (renda * 0.15) - 270;
		}
		
		if(renda > 2800 && renda <= 3600) {
			return (renda * 0.25) - 500;
		}
		return (renda * 0.30) - 700;
	}

	@Override
	public String toString() {
		return "ex2PessoaFisica [cpf=" + cpf + ", calcularImposto()=" + calcularImposto() + "]";
	}

	
	

}
