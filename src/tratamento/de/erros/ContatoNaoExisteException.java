package tratamento.de.erros;

public class ContatoNaoExisteException extends Exception {

	private String nomeContato;

	public ContatoNaoExisteException(String nomeContato) {
		super();
		this.nomeContato = nomeContato;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "contato " + nomeContato + " não existe na agenda";
	}
}
