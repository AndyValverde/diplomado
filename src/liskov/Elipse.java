package liskov;

public class Elipse implements Figura {
	private double radioMayor;

	private double radioMenor;

	public Elipse(double radioMayor, double radioMenor) {
		super();
		this.radioMayor = radioMayor;
		this.radioMenor = radioMenor;
	}

	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return 3.1416*radioMayor*radioMenor;
	}

	public double getRadioMayor() {
		return radioMayor;
	}

	public void setRadioMayor(double radioMayor) {
		this.radioMayor = radioMayor;
	}

	public double getRadioMenor() {
		return radioMenor;
	}

	public void setRadioMenor(double radioMenor) {
		this.radioMenor = radioMenor;
	}
	
	
}
