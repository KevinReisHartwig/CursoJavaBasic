package tratamento.de.erros;

import java.util.Arrays;

public class agenda {

	private contato[] contatos;

	public agenda() {
		contatos = new contato[5];

	}

	public void adicionarContato(contato c) throws AgendaCheiaExeption {

		boolean cheia = true;
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] == null) {
				contatos[i] = c;
				cheia = false;
				break;

			}

		}
		if (cheia) {
			throw new AgendaCheiaExeption();
		}

	}

	public int consultaContatoPorNome(String nome) throws ContatoNaoExisteException {

		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] != null) {
				if (contatos[i].getNome().equalsIgnoreCase(nome)) {
					return i;

				}
			}
		}
		throw new ContatoNaoExisteException(nome);

	}

	@Override
	public String toString() {

		return "agenda [contatos=" + Arrays.toString(contatos) + "]";

	}

}
