package construtores.encapsulamento;

public class ex2Conta {
	public static void main(String[] args) {
		ex2 conta = new ex2();
		
		conta.setAgencia("1242425");
		conta.setNumero("23353");
		conta.setEspecial(true);
		conta.setLimiteEspecial(1000);
		conta.setSaldo(-100);
		
		boolean saqueEfetuado = conta.realizarSaque(1000);
		
		System.out.println("sua conta " + conta.getNumero() + " tem saldo de " + conta.getSaldo());
		
		if(saqueEfetuado) {
			System.out.println("saque foi realizado com sucesso");
			conta.consultarSaldo();
		}else {
			System.out.println("saque não foi realizado por falta de limite especial e saldo");
		}
		
		conta.depositar(400);
		conta.consultarSaldo();
		
		if(conta.verificarUsoChuqueEspecial()) {
			System.out.println("esta usando cheque especial");
		}else {
			System.out.println("não esta usando cheque especial");
		}
		
		
		}
	}


