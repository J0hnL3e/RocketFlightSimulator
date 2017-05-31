package Ricketry;
public class Body{
	private double mass;
	private double length;
	private double diameter;
	private double surfaceArea;
	//Material is assumed to be Cardboard
	public Body(double mass, double length, double diameter) {
		this.mass = mass;
		this.length= length;
		this.diameter = diameter;
		this.surfaceArea = 2 * Math.PI * (this.diameter/2) * this.length;
	}
	public double getMass(){
		return this.mass;
	}
	
	public double getSurfaceArea(){
		return this.surfaceArea;
	}
	
	public double getLength(){
		return this.length;
	}
	public double getDiameter(){
		return this.diameter;
	}

}
