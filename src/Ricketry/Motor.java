package Ricketry;
public class Motor{
	private double mass;
	private double thrust;
	private double delayTime;
	private double burnTime;
	
	public Motor(double mass, double thrust, double delayTime, double burnTime) {
		this.mass = mass;
		this.thrust = thrust;
		this.delayTime = delayTime;
		this.burnTime = burnTime;
	}
	
	public double getMass(){
		return this.mass;
	}
	
	public double getThrust(){
		return this.thrust;
	}
	
	public double getDelayTime(){
		return this.delayTime;
	}
	 
	public double getBurnTime(){
		return this.burnTime;
	}
}
