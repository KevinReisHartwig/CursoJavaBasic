package interfaces;

public class quadrado extends figura2D {

	private int lado;

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public double calculaArea() {

		return lado * lado;
	}

}
