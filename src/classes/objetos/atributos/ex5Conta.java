package classes.objetos.atributos;

public class ex5Conta {
	public static void main(String[] args) {
		ex5 conta = new ex5();
		
		conta.numero = "123435";
		conta.agencia = "1242";
		conta.especial = false;
		conta.limiteEspecial = 1000;
		conta.saldo = -100;
		
		System.out.println("seu saldo da conta " + conta.numero + " = " + conta.saldo);
	}

}
