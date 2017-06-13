package Ricketry;

public class Parachute {

	private double diameter;
	private double surfaceArea;
	private double mass;
	private double coefficientOfDrag;
	
	public Parachute(double diameter, double mass, double CoD) {
		this.diameter = diameter;
		this.mass = mass;
		this.surfaceArea = Math.PI * (diameter/2) * (diameter/2);
		
	}
	
	public double getMass(){
		return this.mass;
	}
	
	public double getSurfaceArea(){
		return this.surfaceArea;
	}

}
