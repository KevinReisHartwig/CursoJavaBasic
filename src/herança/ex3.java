package herança;

public class ex3 {
	public static void main(String[] args) {
		ex3Animal camelo = new ex3Animal();
		camelo.setNome("camelo");
		camelo.setComprimento(150);
		camelo.setPatas(4);
		camelo.setCor("amarelo");
		camelo.setAmbiente("terra");
		camelo.setVelocidae(2);
		
		ex3Peixe tubarao = new ex3Peixe();
		tubarao.setCaracteristicas("barbatanas e cauda");
		
		ex3Mamifero ursoCanada = new ex3Mamifero();
		ursoCanada.setAlimento("mel");
		
		ex3Animal [] animais = new ex3Animal[3];
		
		animais[0] = camelo;
		animais[1] = tubarao;
		animais[2] = ursoCanada;
		
		System.out.println("-------------------------------");
		for(ex3Animal animal : animais) {
			System.out.println(animal.toString());
			System.out.println("---------------------------------");
		}
		
	}

}
