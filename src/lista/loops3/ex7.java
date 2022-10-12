package lista.loops3;

import java.util.Scanner;

public class ex7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;
		int maior = Integer.MIN_VALUE;
	
		for(int i = 0; i <=5 ; i++) {
			System.out.println("digite um numero: ");
			num = entrada.nextInt();
			
			if(num > maior) {
				maior = num;
				
			}
		
		
		
		}
		entrada.close();
		System.out.println("o maior numero foi " + maior);
	}

}
