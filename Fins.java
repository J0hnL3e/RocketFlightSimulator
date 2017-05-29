
public class Fins extends Rocket{
	
	private double mass;
	private String material;
	private double surfaceArea;
	
	//Instead of asking for slant height and all those, just using Surface Area
	//Available Materials: Plywood, Cardboard (Tube), Fiber-glass/tube, Balsa
	public Fins(double mass, double surfaceArea, String material){
		this.mass = mass;
		this.surfaceArea = surfaceArea;
		this.material = material;
	}
	
	public double getMass(){
		return this.mass;
	}
	
	public double getMaterial(){
		return this.material;
	}
	
	public double getSurfaceArea(){
		return this.surfaceArea;
	
	//Needs numbers for CoD
	public double getCoD(){
		if (material.equals("plywood"))
			return 0.0;
		else if (material.equals("carboard") }} material.equals("tube"))
			return 0.0;
		else if (material.contains("fiber"))
			return 0.0;
		else if (material.equals("balsa"))
			return 0.0
	}
}
