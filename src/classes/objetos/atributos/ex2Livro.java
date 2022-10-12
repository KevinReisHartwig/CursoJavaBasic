package classes.objetos.atributos;

public class ex2Livro {
	public static void main(String[] args) {
		ex2 livro = new ex2();
		livro.nome = "Java a melhor linguagem";
		livro.autor = "Sun Microsystems";
		livro.quantPag = 10000000;
		livro.anoLançamento = 1991;
		
		System.out.println("o nome do livro é " + livro.nome);
	}
}
