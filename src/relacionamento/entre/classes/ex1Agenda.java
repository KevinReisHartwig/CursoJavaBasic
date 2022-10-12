/*
 1. Escreva	uma	classe	Agenda,	que	contém	vários	contatos	do	tipo	Contato.	
Cada	contato	possui	nome,	telefone	e	email. A	Agenda	também	possui	um	
nome.	Crie	um	programa	teste	que	peça	para	o	usuário	entrar	com	o	
nome	da	Agenda	e	em	seguida	3	contatos.	Crie	métodos	que	retornem	
uma	String	com	a	informação	de	cada	contato	e	também	de	todos	os	
contatos	da	agenda.
 */
package relacionamento.entre.classes;

public class ex1Agenda {
	private String nome;
	private ex1Contatos[] contatos;

	public ex1Agenda() {
		
	}

	public ex1Agenda(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ex1Contatos[] getContatos() {
		return contatos;
	}

	public void setContatos(ex1Contatos[] contatos) {
		this.contatos = contatos;
	}
	
	public String obterInfo() {
		String info = "nome = " + nome + "\n";
		
		if(contatos != null) {
			for(ex1Contatos c: contatos) {
				info += c.obterInfo() + "\n";
			}
		}
		return info;
				
				
	}
	
}