package tratamento.de.erros;

import java.util.Scanner;

public class teste {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		agenda agendas = new agenda();

		int opcao = 1;
		while (opcao != 3) {
			opcao = obterOpcao(entrada);

			if (opcao == 1) { // consultarcontato
				consultarContato(entrada, agendas);

			} else if (opcao == 2) { // add contato
				adicionarContato(entrada, agendas);
			}
		}

	}

	public static void adicionarContato(Scanner entrada, agenda agendas) {
		System.out.println("criando um contato, entre com as informações");
		String nome = lerInformacaoString(entrada, "entre com o nome do contato: ");
		String telefone = lerInformacaoString(entrada, "entre com o telefone do contato: ");
		String email = lerInformacaoString(entrada, "entre com o email do contato: ");

		contato contatos = new contato();
		contatos.setNome(nome);
		contatos.setTelefone(telefone);
		contatos.setEmail(email);

		System.out.println("contato a ser criado: ");
		System.out.println(contatos);

		try {
			agendas.adicionarContato(contatos);
		} catch (AgendaCheiaExeption e) {
			System.out.println(e.getMessage());
			System.out.println("contatos da agenda");
			System.out.println(agendas);
		}

	}

	public static void consultarContato(Scanner entrada, agenda agendas) {
		String nomeContato = lerInformacaoString(entrada, "entre com o nome do contato a ser pesquisado: ");
		try {
			if (agendas.consultaContatoPorNome(nomeContato) >= 0) {
				System.out.println("contato existe");

			}
		} catch (ContatoNaoExisteException e) {
			System.out.println(e.getMessage());
		}

	}

	public static String lerInformacaoString(Scanner entrada, String msg) {
		System.out.println(msg);
		String scan = entrada.nextLine();
		return scan;

	}

	public static int obterOpcao(Scanner entrada) {
		boolean entradaValida = false;
		int opcao = 3;

		while (!entradaValida) {
			System.out.println("digite a opção desejada:");
			System.out.println("1 - consultar contado");
			System.out.println("2 - adicionar contado");
			System.out.println("3 - sair: ");

			try {
				String scan = entrada.nextLine();
				opcao = Integer.parseInt(scan);

				if (opcao == 1 || opcao == 2 || opcao == 3) {
					entradaValida = true;

				} else {

					throw new Exception("entrada invalida");
				}
			} catch (Exception e) {
				System.out.println("entrada invalida digite novamamente\n");
			}

		}
		return opcao;

	}

}
