package classes.objetos.atributos;

public class ex3LivroLivraria {
	public static void main(String[] args) {
		
	
	ex3 livro = new ex3();
	livro.nome = "Java a melhor linguagem";
	livro.autor = "Sun Microsystems";
	livro.quantPag = 10000000;
	livro.anoLançamento = 1991;
	livro.preço = 250;
	
	System.out.println("o nome do livro é " + livro.nome);
	
	}
}
