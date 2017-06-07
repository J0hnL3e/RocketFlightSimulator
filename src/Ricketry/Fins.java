package Ricketry;
public class Fins{
	
	private double mass;
	private double rootChordLength;
	private double tipChordLength;
	private double sweepAng;
	private double height;
	
	//Material is defaulted to plywood 
	public Fins(double rootChordLength, double tipChordLength, double sweepAng, double height, double mass){
		this.mass = mass;

	}
	
	public double getMass(){
		return this.mass;
	}
	
	public double getSurfaceArea(){
		//Need calculations
		return 0.0;
	}
	
	//Needs numbers for CoD
	public double getCoD(){
		return 90.0;
	}
}
