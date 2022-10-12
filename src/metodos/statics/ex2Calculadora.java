package metodos.statics;

public class ex2Calculadora {
	public static void main(String[] args) {
		
		imprimirTela(ex2.somar(2, 3));
		imprimirTela(ex2.subtrair(5, 4));
		imprimirTela(ex2.multiplicar(2, 2));
		imprimirTela(ex2.dividir(4, 2));
		imprimirTela(ex2.potencia(5,2));
		
		
		imprimirTela(ex2.fatorialNR(5));
		
		
	}
	
	static void imprimirTela(int num) {
		System.out.println(num);
	}
	
	
	

}
