/*
 1. Escreva	uma classe chamada	Contador,	que	tem	um	atributo	estático	que	
é	incrementado	sempre	que	a	classe	for	instanciada. Crie	métodos	para	
zerar,	incrementar	e	retornar	o	valor	do	contador. Desenvolva	um	
programa	para	testar	essa	classe
 */
package metodos.statics;

public class ex1 {
	
	private static int cont;
	
	public ex1() {
		cont++;
	}
	
	public static void incrementar() {
		cont++;
	}
	
	public static void zerar() {
		cont = 0;
	}
	
	public static int obterValor() {
		return cont;
	}
	
		
	

}
