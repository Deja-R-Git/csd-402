import java.util.*;

public class Main {
	public static void main(String[]arg) {
		int Q;
		int waterMass;
		int initialtemperature;
		int finaltemperature;

		Scanner input = new Scanner(System.in);

		System.out.print("How many kilograms of water do you want to heat up?");
		String waterMass = input.nextLine;

		System.out.print("\nWhat is the temperature now?");
		initialtemperature = input.nextLine;

		System.out.print("\nWhat temperature do you want to reach?");
		finaltemperature = input.nextLine;

		Q = (finaltemperature - initialtemperature)*4184;

		System.out.println("You need" + Q + "joules of energy to heat up" + waterMass + "kg of water" + "to" + finaltemperature + "degrees Celsius");
	}

}