package classes.objetos.atributos;

import java.util.Date;

public class ex4LivroBiblioteca {
	public static void main(String[] args) {
		
		
		ex4 livro = new ex4();
		livro.nome = "Java a melhor linguagem";
		livro.autor = "Sun Microsystems";
		livro.quantPag = 10000000;
		livro.anoLançamento = 1991;
		livro.preço = 250;
		livro.emprestado = false;
		livro.quemPegouEmprestado = "ninguem";
		livro.dataEntrega = new Date();
		
		
		System.out.println("o nome do livro é " + livro.dataEntrega);
		
		}

}
