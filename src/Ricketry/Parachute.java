package Ricketry;

public class Parachute {

	private double diameter;
	private double surfaceArea;
	private double mass;
	
	public Parachute(double diameter, double mass) {
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
	
	public double getDiameter(){
		return this.diameter;
	}
	

}
