/*
 1. Escreva	uma classe para	representar	uma	lâmpada. Desenvolva	métodos	
para	ligar,	desligar	a	lampada.
 */
package classes.metodos;

public class ex1 {
	
	String modelo;
	String tensao;
	int garantia;
	String cor;
	int potencia;
	String tipoLuz;
	boolean tipoAbajur;
	String[] tipos;
	
	boolean ligada = false;
	
	void ligar() {
		ligada = true;
	}
	
	void desligar() {
		ligada = false;
		
	}
	
	void mostrarEstado() {
		if(ligada) {
			System.out.println("lampada ligada");
		}else {
			System.out.println("lampada desligada");
		}
		
	
	}
	void mudarEstado() {
		if(ligada) {
			desligar();
		}else {
			ligar();
		}
	}
	
	
	

}
