package classes.objetos.atributos;

public class ex6Contatos {
	public static void main(String[] args) {
		ex6 contatos = new ex6();
		
		contatos.nome = "kevin";
		contatos.endereco = "SMJ";
		contatos.email = "kevindosreishartwig1221";
		contatos.numeros = new int[3];
		contatos.numeros[0] = 996004415;
		
		System.out.println("meu nome = " + contatos.nome + " e meu numero = " + contatos.numeros[0]);
	}

}
