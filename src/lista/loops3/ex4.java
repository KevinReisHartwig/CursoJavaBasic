/*
 4. Supondo que a população de um país A seja da ordem de 80000 
habitantes com uma taxa anual de crescimento de 3% e que a 
população de B seja 200000 habitantes com uma taxa de crescimento 
de 1.5%. Faça um programa que calcule e escreva o número de anos 
necessários para que a população do país A ultrapasse ou iguale a 
população do país B, mantidas as taxas de crescimento
 */
package lista.loops3;

public class ex4 {
	public static void main(String[] args) {
		
		int populacaoA = 80000;
		int populacaoB = 200000;
		int cont = 0;
		
		while(populacaoA <= populacaoB) {
			populacaoA += (populacaoA * 0.03);
			populacaoB += (populacaoB * 0.015);
			cont++;
		
			
		}
		System.out.println("a população A " + populacaoA);
		System.out.println("a população B " + populacaoB);
		System.out.println("e o ano é " + cont);
		
	}

}
