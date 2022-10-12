/*
 2. Escreva	uma	classe	Calculadora	que	tenha	os seguintes	métodos:	somar,	
subtrair,	multiplicar,	dividir (dois	números),	elevar	à	potência	n.	
Desenvolva	um	programa	para	testar	essa	classe
 */
package metodos.statics;

public class ex2 {
	
	public static int somar(int num1, int num2) {
		return (num1 + num2);
	}
	
	public static int subtrair(int num1, int num2) {
		return (num1 - num2);
		
	}
	
	public static int dividir(int num1, int num2) {
		return(num1 / num2);
	}
	
	public static int multiplicar(int num1, int num2) {
		return(num1 * num2);
	}
	
	public static int potencia(int num1, int num2) {
		int resultado = 1;
		for(int i = 1; i <= num2; i++) {
			resultado *= num1;
		}
		return resultado;
	}
	
	public static int fatorial(int num) {
		if(num < 0) {
			return 1;
		}
				
		int total = 1;
		for(int i = num; i > 1; i--) {
			total *= i;
		}
		return total;
	}
	
	public static int fatorialNR(int num) {
		if (num == 0) {
			return 1;
		}
		return num * fatorialNR(num -1);
	}
	
	

}

