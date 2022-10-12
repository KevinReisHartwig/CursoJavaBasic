package interfaces;

public class piramide extends figura3D {

	private double altura;
	private double arestaBase;
	private double apotema;
	private int poliBase;

	public int getPoliBase() {
		return poliBase;
	}

	public void setPoliBase(int poliBase) {
		this.poliBase = poliBase;
	}

	private figura2D base;

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getArestaBase() {
		return arestaBase;
	}

	public void setArestaBase(double arestaBase) {
		this.arestaBase = arestaBase;
	}

	public double getApotema() {
		return apotema;
	}

	public void setApotema(double apotema) {
		this.apotema = apotema;
	}

	public figura2D getBase() {
		return base;
	}

	public void setBase(figura2D base) {
		this.base = base;
	}

	@Override
	public double calculaArea() {
		if (base != null) {
			return (poliBase * ((arestaBase * apotema) / 2)) + base.calculaArea();

		}
		return 0;

	}

	@Override
	public double calcularVolume() {
		if (base != null) {
			return (base.calculaArea() * altura) / 3;
		}
		return 0;

	}

}
