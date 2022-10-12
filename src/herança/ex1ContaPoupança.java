package herança;

import java.util.Calendar;

public class ex1ContaPoupança extends ex1Conta{
	
	private int diaRendimento;

	
	

	public int getDiaRendimente() {
		return diaRendimento;
	}

	public void setDiaRendimente(int diaRendimente) {
		this.diaRendimento = diaRendimente;
	}
	
	public String toString() {
		return "ex1ContaPoupança [diaRendimente=" + diaRendimento + "]";
	}
	
	public boolean calcularNovoSaldo(double taxaRendimento) {
		Calendar hoje = Calendar.getInstance();
		
		if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
			//saldo += saldo * taxaRendimento;
			this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
			return true;
			
		}
		return false;
	}
	
	

}
