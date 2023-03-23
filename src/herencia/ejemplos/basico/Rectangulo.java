package herencia.ejemplos.basico;

public class Rectangulo extends FormaDosD {

	public boolean esCuadrado() {
		if (altura == ancho)
			return true;
		return false;
	}

	public double area() {
		return altura * ancho;
	}
}

