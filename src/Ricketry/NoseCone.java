package Ricketry;
public class NoseCone{
	private double mass;
	private double surfaceArea;
	private String shape;
	private double length;
	private double diameter;
	private String material;
	//Test
	//Material can vary from plastic and foam
	public NoseCone(double mass, String shape, double length, double diameter, String material) {
		this.mass = mass;
		this.shape = shape;
		this.length = length;
		this.diameter = diameter;
	}
	
	public double getMass(){
		return this.mass;
	}

	public String getMaterial(){
		return this.material;
	}
	
	//Need CoD numbers for each material
	public double getCoD(){
		if (material.equals("plastic") || material.contains("fiber"))
			return 0.0;
		else if (material.equals("foam"))
			return 0.0;
		return 0.0;
	}
	public double getSurfaceArea(){
		//Need equations for calculation
		return this.surfaceArea;
	}
	
	public String getShape(){
		return this.shape;
	}
	
	public double getLength(){
		return this.length;
	}
	public double getDiameter(){
		return this.diameter;
	}

}
