package Ricketry;
import java.util.Scanner;
public class Flight {
	public static void main(String[] args) {
		System.out.println("Welcome to the Ricketry Flight Simulator. Please enter rocket dimensions when specified, separated by commas.");
		Scanner main = new Scanner(System.in);
		//Getting NoseCone dimensions
		System.out.print("Nosecone: Please enter the mass, length, and diameter: ");
		String[] ncTemp = main.nextLine().split(",");
		double[] noseconeDoubles = divideNumericalParts(ncTemp);
		/*
		double[] noseconeDoubles = new double[3];
		for (int i = 0; i < temp.length; i++){
			noseconeDoubles[i] = Double.parseDouble(temp[i]);
		} */
		System.out.print("Nosecone: Please enter the shape and material: ");
		String[] noseconeStrings = main.nextLine().split(",");
		NoseCone tip = new NoseCone(noseconeDoubles[0], noseconeStrings[0], noseconeDoubles[1], noseconeDoubles[2], noseconeStrings[1]);
		//Getting motor dimensions
		System.out.print("Motor: Please enter the thrust and mass and times for delay and burn of the motor: ");
		String[] motorTemp = main.nextLine().split(",");
		double[] motorDoubles = divideNumericalParts(motorTemp);
		//double[] motorDoubles = {Double.parseDouble(motorTemp[0]), Double.parseDouble(motorTemp[1])};
		Motor end = new Motor(motorDoubles[0], motorDoubles[1], motorDoubles[2], motorDoubles[3]);
		//Getting Parachute Dimensions
		System.out.print("Parachute: Please enter the diameter, mass, and CoD: ");
		String[] parTemp = main.nextLine().split(",");
		double[] parDoubles = divideNumericalParts(parTemp);
		Parachute fall = new Parachute(parDoubles[0], parDoubles[1], parDoubles[2]);
		//Getting Body Dimensions
		System.out.print("Body: Please enter the mass, length, and diameter: ");
		String[] bodTemp = main.nextLine().split(",");
		double[] bodDoubles = divideNumericalParts(bodTemp);
		Body airframe = new Body(bodDoubles[0], bodDoubles[1], bodDoubles[2]);
		//Getting Fin Dimensions
		System.out.print("Fins: Please enter the lengths for root chord, tip chord, sweep angle, height, and mass: ");
		String[] finTemp = main.nextLine().split(",");
		double[] finDoubles = divideNumericalParts(finTemp);
		Fins drag = new Fins(finDoubles[0], finDoubles[1], finDoubles[2], finDoubles[3], finDoubles[4]);
		//Constructing Rocket
		Rocket rick = new Rocket(tip, airframe, fall, drag, end);
		System.out.println("Rocket has been created.");
		System.out.println("Estimated altitude is... " + rick.flight() + "ft." );
		/*String[] rocketParts = {"NoseCone", "Body", "Fins", "Motor", "Parachute"};
		for (int i = 0; i < rocketParts.length; i++){
			String rocketPart = rocketParts[i];
			if (rocketPart.equals("NoseCone")){
				for (int i = 0; i < )
			}
		}*/
		main.close();
		
	}
	
	public static double[] divideNumericalParts(String[] temp){
		double[] output = new double[temp.length];
		for (int i = 0; i < temp.length; i++){
			output[i] = Double.parseDouble(temp[i]);
		}
		return output;
	}

}
