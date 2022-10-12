package interfaces;

public class circulo extends figura2D {

	private double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calculaArea() {
		return raio * raio * Math.PI;
	}

}
