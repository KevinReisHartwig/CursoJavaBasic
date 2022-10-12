package interfaces;

public class cubo extends figura3D {

	private int lado;

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public double calculaArea() {
		return 6 * (lado * lado);
	}

	@Override
	public double calcularVolume() {
		return lado * lado * lado;
		// Math.pow(lado, 3);
	}

}
