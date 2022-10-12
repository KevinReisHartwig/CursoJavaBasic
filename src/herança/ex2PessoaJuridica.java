package herança;

public class ex2PessoaJuridica extends ex2Pessoa{
	
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public double calcularImposto() {
		
		return this.getRendaBruta() * 0.1;
		
		
	}

	@Override
	public String toString() {
		return "ex2PessoaJuridica [cnpj=" + cnpj + ", calcularImposto()=" + calcularImposto() + "]";
	}
	
	

}
