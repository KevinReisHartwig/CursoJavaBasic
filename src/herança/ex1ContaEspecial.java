package herança;

public class ex1ContaEspecial extends ex1Conta {
	
	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public String toString() {
		return "ex1ContaEspecial [limite=" + limite + "]";
	
	}
	
	public boolean sacar(double valor) {
		double saldoComLimite = this.getSaldo() + limite;
		
		if((saldoComLimite - valor) >=0 ) {
			this.setSaldo(this.getSaldo() - valor);
			return true;
		}
		return false;
	}
	
	

}
