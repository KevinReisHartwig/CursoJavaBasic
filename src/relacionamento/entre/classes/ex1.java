package relacionamento.entre.classes;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			
		System.out.println("digite o nome da agenda: ");
		String nome = entrada.next();
		
		ex1Agenda agenda = new ex1Agenda(nome);
		
		ex1Contatos[] contatos = new ex1Contatos[3];
		
		for(int i = 0; i < contatos.length; i++) {
			System.out.println("entre com as informações do contato " + (i+1));
			ex1Contatos c = new ex1Contatos();
			
			System.out.println("entre com o nome: ");
			nome = entrada.next();
			c.setNome(nome);
			
			System.out.println("entre com o telefone: ");
			String telefone = entrada.next();
			c.setTelefone(telefone);
			
			System.out.println("entre com o email: ");
			String email = entrada.next();
			c.setEmail(email);
			
			contatos[i] = c;
																									
		}
		agenda.setContatos(contatos);
		
		if(agenda != null) {
			System.out.println(agenda.obterInfo());
			
		}
		entrada.close();
		
	}

}
