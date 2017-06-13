package Ricketry;
public class Rocket {

	private double mass;
	private double thrust;
	private double surfaceArea;
	private double burnTime;
	private double motorMass;

	public Rocket(NoseCone nc, Body b, Parachute p, Fins f, Motor m){
		this.mass = nc.getMass() + b.getMass();		
		this.thrust = m.getThrust();
		this.burnTime = m.getBurnTime();
		this.motorMass = m.getMass();
		this.surfaceArea = nc.getSurfaceArea() + b.getSurfaceArea() + f.getSurfaceArea();
	}
	
	public double flight() {
		double Cd = 0.75;
		double D;
		double v;
		double a = 9.8;
		double p = 1.275;
		double I;
		double m = this.mass;
		double t;
		double F;
		double d;
		
		I = this.thrust;
		v = I/m;
		D = 0.5 * Cd * p * Math.pow(v, 2) * this.surfaceArea;
		F = I/burnTime;
		F -= D;
		I = F * burnTime;
		v = I / (m - this.motorMass);
		t = v/9.8;
		d= v*t + (.5 * t * Math.pow(9.8,2));
		return d;
 
	}
	
}
 

	
