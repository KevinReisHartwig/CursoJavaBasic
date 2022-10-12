package herança;

public class ex1 {
	public static void main(String[] args) {
		System.out.println("-----Teste conta-----");
		
		ex1Conta contaBancaria = new ex1Conta();
		contaBancaria.setNomeCliente("lula ladrão");
		contaBancaria.setNumConta("1333");
		
		contaBancaria.depositar(100);
		
		realizarSaque(contaBancaria, 50);
		
		realizarSaque(contaBancaria, 70);
		
		System.out.println(contaBancaria);
		
		System.out.println("-----Teste poupança-----");
		
		ex1ContaPoupança contapoupanca = new ex1ContaPoupança();
		contapoupanca.setNomeCliente("lula presidente");
		contapoupanca.setNumConta("22");
		
		contapoupanca.setDiaRendimente(4);
		
		contapoupanca.depositar(100);
		
		realizarSaque(contapoupanca, 50);
		
		realizarSaque(contapoupanca, 70);
		
		if(contapoupanca.calcularNovoSaldo(0.5)) {
			System.out.println("rendimento aplicado, novo saldo é de " + contapoupanca.getSaldo());
		}else {
			System.out.println("hoje não é dia de rendimento, novo saldo não calculado");
		}
		
		System.out.println(contapoupanca);
		
		System.out.println("-----Teste conta especial-----");
		
		ex1ContaEspecial contaEspecial = new ex1ContaEspecial();
		contaEspecial.setNomeCliente("conta especial");
		contaEspecial.setNumConta("1991993");
		contaEspecial.setLimite(50);
		
		contaEspecial.depositar(100);
		
		realizarSaque(contaEspecial, 50);
		
		realizarSaque(contaEspecial, 70);
		
		realizarSaque(contaEspecial, 80);
		
	
		
		System.out.println(contaEspecial);
		
	}
	private static void realizarSaque(ex1Conta conta, double valor) {
		if(conta.sacar(valor)) {
			System.out.println("saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
		}else {
			System.out.println("saldo insuficiente para saque de " + valor +" seu saldo é de apenas " + conta.getSaldo());
		}
		
		
		
	}
	
	
}

