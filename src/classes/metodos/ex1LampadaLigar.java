package classes.metodos;

public class ex1LampadaLigar {
	public static void main(String[] args) {
		ex1 lampada = new ex1();
		
		lampada.ligada = false;
						
		lampada.mostrarEstado();
		
		lampada.mudarEstado();
		
		lampada.mostrarEstado();
		
		
	}

}
