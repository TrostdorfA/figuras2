package figuras2;

public class Rectangulo2 {

	double ancho, alto;


	public Rectangulo2(double ancho, double alto) {
		this.ancho = ancho;
		this.alto = alto;
	}

	public double getPermitro() {
		return this.alto * 2 + this.ancho * 2;
	}

}
