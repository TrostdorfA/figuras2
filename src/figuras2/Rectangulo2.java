package figuras2;

public class Rectangulo2 {

	double ancho, alto;


	public Rectangulo2(double ancho, double alto) {
		this.ancho = ancho;
		this.alto = alto;
	}

	@Override
	public String toString() {
		return "Rectangulo2 [ancho=" + ancho + ", alto=" + alto + "]";
	}
	
	public double getPerimetro() {
		return this.alto * 2 + this.ancho * 2;
	}
}
