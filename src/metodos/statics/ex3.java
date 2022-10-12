package metodos.statics;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num;
		
		do {
			System.out.println("informe um numero inteiro: ");
			num = entrada.nextInt();
			
			if(num < 0) {
				System.out.println("numero negativo ou invalido tente novamente!");
			}
		}while(num < 0);
		
		System.out.println(ex2.fatorial(num));
		entrada.close();
	}
		

}
