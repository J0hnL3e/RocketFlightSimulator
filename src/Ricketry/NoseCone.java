package Ricketry;
public class NoseCone{
	private double mass;
	private double length;
	private double diameter;
	private double C;
	//Test
	//Material can vary from plastic and foam
	public NoseCone(double mass, double length, double diameter) {
		this.mass = mass;
		this.length = length;
		this.diameter = diameter;
		this.C = length/diameter;
	}
	
	public double getMass(){
		return this.mass;
	}

	public double getSurfaceArea(){
			return (3.14159)* Math.pow((diameter/2), 2) + (3.14159)*(diameter/2)*(Math.sqrt(Math.pow(diameter/2,2)+Math.pow(this.length, 2)));
	}
	
	public double getLength(){
		return this.length;
	}
	public double getDiameter(){
		return this.diameter;
	}
	
	
}
