package Ricketry;
public class Fins{
	
	private double mass;
	private double rootChordLength;
	private double tipChordLength;
	private double sweepAng;
	private double height;
	
	//Material is defaulted to plywood 
	public Fins(double rtChrLength, double tpChrLength, double sweepAng, double height, double mass){
		this.mass = mass;
		this.rootChordLength = rtChrLength;
		this.tipChordLength = tpChrLength;
		this.sweepAng = sweepAng;
		this.height = height;
	}
	
	public double getSurfaceArea(double rootchord, double tipchord, double sweep, double height){
		//pl1 = partial length 1
		double pl1 = Math.tan(sweep)*4;
		//pa1 = partial area 1
		double pa1 = Math.sqrt(Math.pow(pl1, 2) + Math.pow(height,2));
		//pl2 = partial length 2 
		double pl2 = tipchord - pl1;
		//pa2 = partial area 2
		double pa2 = pl2 * height;
		//pl3 = partial area 3
		double pl3 = rootchord - pl1;
		//pa3 = partial area 3
		double pa3 = Math.sqrt(Math.pow(pl3, 2) + Math.pow(height,2));
		return 2 * (pa1+ pa2 + pa3);
	}

	public double getMass(){
		return this.mass;
	}
	
	public double getHeight(){
		return this.height;
	}
	
	public double getRootChordLength(){
		return this.rootChordLength;
	}
	
	public double getTipChordLength(){
		return this.tipChordLength;
	}
	
	public double sweepAngle(){
		return this.sweepAng;
	}
	
	//Needs numbers for CoD
	public double getCoD(){
		return 90.0;
	}
}
