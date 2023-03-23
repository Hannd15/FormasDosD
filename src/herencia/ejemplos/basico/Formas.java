package herencia.ejemplos.basico;

public class Formas {

	public static void main(String[] args) {

		Deltoide t1 = new Deltoide();
		Deltoide t2 = new Deltoide();

		t1.altura = 4.0;
		t1.ancho = 4.0;

		t2.altura = 8.0;
		t2.ancho = 12.0;

		System.out.println("Informacion para t1: ");
		t1.mostrarDimension();
		System.out.println("El area es " + t1.area());

		System.out.println("");

		System.out.println("Informacion para t2: ");
		t2.mostrarDimension();
		System.out.println("El area es " + t2.area());
		
		FormaDosD forma = new FormaDosD();
		
		forma.altura = 10;
		forma.ancho = 20;

	}

}

