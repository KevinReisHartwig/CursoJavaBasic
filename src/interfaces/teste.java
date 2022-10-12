package interfaces;

public class teste {
	public static void main(String[] args) {
		quadrado t1 = new quadrado();
		t1.setLado(2);
		t1.setNome("quadrado");

		circulo t2 = new circulo();
		t2.setRaio(2);
		t2.setNome("circulo");

		triangulo t3 = new triangulo();
		t3.setBase(3);
		t3.setAltura(2);
		t3.setNome("triangulo");

		cubo t4 = new cubo();
		t4.setLado(3);
		t4.setNome("cubo");

		cilindro t5 = new cilindro();
		t5.setRaio(2);
		t5.setAltura(3);
		t5.setNome("cilindro");

		piramide t6 = new piramide();
		t6.setAltura(3);
		t6.setApotema(4);
		t6.setArestaBase(2);
		t6.setBase(t1);
		t6.setPoliBase(4);
		t6.setNome("piramide");

		figuraGeometrica[] figuras = new figuraGeometrica[6];
		figuras[0] = t1;
		figuras[1] = t2;
		figuras[2] = t3;
		figuras[3] = t4;
		figuras[4] = t5;
		figuras[5] = t6;

		for (figuraGeometrica figura : figuras) {
			System.out.println("----------------");
			System.out.println(figura.getNome());

			if (figura instanceof figura2D) {
				figura2D f2d = (figura2D) figura;
				System.out.println(f2d.calculaArea());
			}

			if (figura instanceof figura3D) {
				figura3D f3d = (figura3D) figura;
				System.out.println(f3d.calculaArea());
				System.out.println(f3d.calcularVolume());
			}

		}
	}

}
