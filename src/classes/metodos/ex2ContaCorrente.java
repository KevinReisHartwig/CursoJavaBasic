package classes.metodos;

public class ex2ContaCorrente {
	public static void main(String[] args) {
		
	
	
	ex2 conta = new ex2();
	
	conta.agencia = "1242425";
	conta.numero = "23353";
	conta.especial = true;
	conta.limiteEspecial = 1000;
	conta.saldo = -100;
	
	boolean saqueEfetuado = conta.realizarSaque(1000);
	
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
