package tratamento.de.erros;

public class contato {

	private static int contador = 0;

	public contato() {
		contador++;
		id = contador;

	}

	@Override
	public String toString() {
		return "contato [id=" + id + ", nome=" + nome + ", telefone=" + telefone + ", email=" + email + "]\n";

	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private int id;
	private String nome;
	private String telefone;
	private String email;

}
