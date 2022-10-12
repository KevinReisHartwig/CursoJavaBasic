/*
 2. Cria	uma	classe	para	representar	uma	conta	corrente	que	possui	um	
número,	um	saldo,	um	status	que	informa	se	ela	é	especial	ou	não,	um	
limite. Desenvolva	métodos	para	realizar	saque	(verificando	se	o	cliente	
pode	realizar	saques),	despositar	dinheiro,	consultar	saldo	e	verificar	se	o	
cliente	está	usando	cheque	especial	ou	não.	Desenvolva	um	programa	
para	testar	essa	classe
 */
package classes.metodos;

public class ex2 {
	String numero;
	String agencia;
	boolean especial;
	double limiteEspecial;
	double saldo;
	
	boolean realizarSaque(double quantiaASacar) {
		
		if(saldo >= quantiaASacar) {
			saldo -= quantiaASacar;
			return true;
		}else {
			if(especial) {
				double limite = limiteEspecial + saldo;
				if(limite >= quantiaASacar) {
					saldo -= quantiaASacar;
					return true;
				}else {
					return false;
				}
				
				
			}else {
				return false;
				
			}
			
		}
		
	}
	void depositar(double valorDeposito) {
		saldo += valorDeposito;
		
		
	}
	void consultarSaldo() {
		System.out.println("saldo = " + saldo);
	}
	boolean verificarUsoChuqueEspecial() {
		return saldo < 0;
			
		
	}
	

}
