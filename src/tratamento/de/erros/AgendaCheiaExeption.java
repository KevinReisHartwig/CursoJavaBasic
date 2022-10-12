package tratamento.de.erros;

public class AgendaCheiaExeption extends Exception {

	@Override
	public String getMessage() {
		return "agenda já esta cheia";
	}

}
