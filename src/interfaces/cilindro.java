package interfaces;

public class cilindro extends figura3D {

	private double altura;
	private double raio;

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calculaArea() {
		double areaBase = Math.PI * (raio * raio);
		double areaLateral = 2 * Math.PI * raio * altura;
		double areaTotal = (2 * areaBase) + areaLateral;
		return areaTotal;
	}

	@Override
	public double calcularVolume() {
		return Math.PI * (raio * raio) * altura;
	}

}
