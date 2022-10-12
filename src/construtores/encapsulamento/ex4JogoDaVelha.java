package construtores.encapsulamento;

import java.util.Scanner;


public class ex4JogoDaVelha {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		ex4 jogoDaVelha = new ex4();
		
		System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");
        
        boolean ganhou = false;
        char sinal;
        int linha = 0, coluna = 0;
        
        while (!ganhou){
            
            if (jogoDaVelha.vezJogador1()){ 
                
                System.out.print("Vez do jogador 1. ");
                sinal = 'X';
            } else {
                
                System.out.println("Vez do jogador 2. ");
                sinal = 'O';
            }
            linha = valor("linha", entrada);
            coluna = valor("coluna", entrada);
            
            if(!jogoDaVelha.validarJogada(linha, coluna, sinal)) {
            	System.out.println("posição invalida, tente novamente");
            }
            jogoDaVelha.imprimirTabuleiro();
            
            if(jogoDaVelha.verificarGanhador('X')) {
            	ganhou = true;
                System.out.println("Parabéns, jogador 1 ganhou!");
            }else if(jogoDaVelha.verificarGanhador('O')) {
            	ganhou = true;
                System.out.println("Parabéns, jogador 2 ganhou!");
            }else if (jogoDaVelha.getJogada() > 9){
                ganhou = true;
                System.out.println("Ninguém ganhou essa partida!");
            }
            
        }
	}
       static int valor (String tipoValor, Scanner entrada)   {
    	   int valor = 0;
    	   boolean valorValida = false;
           while (!valorValida){
        		
        		
        	   System.out.println("Entre com a " + tipoValor + "(1,2 ou 3): ");
        	   valor = entrada.nextInt();
        	   if (valor >=1 && valor <= 3){
        		   valorValida = true;
        	   } else {
        		   System.out.println("Entrada inválida, tente novamente (1, 2 ou 3): ");
            }
        }
           valor--;
           return valor;
     }
		
	
}

