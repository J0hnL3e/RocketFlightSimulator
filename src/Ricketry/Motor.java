package Ricketry;
public class Motor{
	private double mass;
	private double thrust;
	//Add burn-time?
	public Motor(double mass, double thrust) {
		this.mass = mass;
		this.thrust = thrust;
	}
	
	public double getMass(){
		return this.mass;
	}
	
	public double getThrust(){
		return this.thrust;
	}
}
