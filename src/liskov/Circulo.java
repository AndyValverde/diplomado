package liskov;

public class Circulo extends Elipse {

	public Circulo(double radio) {
		super(radio, radio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return 3.1416*this.getRadioMayor()*this.getRadioMenor();
	}
	/** Este estaroia mal cuando quieras utilizar a circulo como elipse
	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return 3.1416*this.getRadioMayor()*this.getRadi	oMayor();
	}
	*/
}
