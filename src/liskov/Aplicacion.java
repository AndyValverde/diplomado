package liskov;

public class Aplicacion {

	public static void main (String[] args) {

		Elipse elipse = new Elipse(10,5);
		System.out.println(elipse.calculaArea());
		
		Figura circulo = new Circulo(7);
		System.out.println(circulo.calculaArea());
		
		Elipse circulo2 = new Circulo(7);
		System.out.println(circulo2.calculaArea());
		manageFigura(elipse);

		manageFigura(circulo2);
	}
	
	public static void manageFigura (Elipse elipse) {
		elipse.setRadioMayor(10.0);
		elipse.setRadioMenor(5.0);

		System.out.println(elipse.getRadioMayor());
		System.out.println(elipse.getRadioMenor());
		System.out.println("En manejaElipses" + elipse.calculaArea());
	}
}
