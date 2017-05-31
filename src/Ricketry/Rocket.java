package Ricketry;
public class Rocket {

	double mass;
	double thrust;
	double surfaceArea;
	double coefficientOfDrag;
	
	
	public Rocket(double mass, double CoD, double surfaceArea, double length) {
		this.mass += mass;
		this.coefficientOfDrag = CoD;
	}

	public Rocket(NoseCone nc, Motor m, Fins f, Body b){
		
	}
	
	
}
