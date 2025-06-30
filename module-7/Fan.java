//Juedeja Richard_Module6_6-29-25
// This program creates the Fan class with private fields, Booleans and instances to display functionality of the class

//packages that help with making a collection with arrays

import java.util.List;
import java.util.ArrayList;

public class Fan {
	//constants
	public static final int STOPPED = 0;
	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;

//fields

	private boolean fanIsOn = true;
	private String speed = STOPPED;
	private int radius = 6;
	public String color = white;

	//no argument constructor
	public Fan() {

	}

	//argument constructor gives Fan information
	public Fan() {
		this.fanIsOn = fanIsOn;
		this.speed = speed;
		this.radius = radius;
		this.color = color;
	}

	//setters
	public void setFanIsOn() {
		this.fanIsOn = fanIsOn;
	}

	public void setSpeed() {
		this.speed = speed;
	}

	public void setRadius() {
		this.radius = radius;
	}

	public void setColor() {
		this.color = color;
	}

	//getters
	public boolean getfanIsOn() {
		return fanIsOn;
	}

	public String getSpeed() {
		return speed;
	}

	public int getRadius() {
		return radius;
	}

	public String getColor() {
		return color;
	}



	public class UseFans{
//method for showing fan attributes

	public void displayFan(Fan fan){
		System.out.println("First Fan Attributes:");
		System.out.println("Is the fan on?:" + fan.fanIsOn());
		System.out.println("Speed:" + fan.speed());
		System.out.println("Radius:" + fan.radius());
		System.out.println("Color:" + fan.color());

	}
//loop through collection and print each fan
	public void displayCollection(List <Fan> fans){
		for(Fan fan:fans) {
			displayFan(fan);
		}
	}



//Test code that will create fan objects and use the methods//
//fan1 will start with no argument constructor
	public static void main(String[] args) {
		fan fan1 = new fan();

//use setter methods to give fan attributes
		fan1.setfanIsOn(true);
		fan1.setSpeed(fan.MEDIUM);
		fan1.setRadius(4);
		fan1.setColor("blue");

//print out and display attributes with getters
		System.out.println("Fan1 New Attributes:");
		System.out.println("Is the fan on?:" + fan1.getfanIsOn());
		System.out.println("Speed:" + fan1.getSpeed());
		System.out.println("Radius:" + fan1.getRadius());
		System.out.println("Color:" + fan1.getColor());

//changing fan2 attributes with setter methods
		fan fan2 = new fan();
		fan2.setRadius(9);
		fan2.setColor("green");
		System.out.println(fan2.toString());

//giving fan3 initial values with argument constructor
		fan fan3 = new fan(true, fan.SLOW, 3, "purple");

		System.out.println("Fan3 New Attributes:");
		System.out.println("Is the fan on?:" + fan3.getfanIsOn());
		System.out.println("Speed:" + fan3.getSpeed());
		System.out.println("Radius:" + fan3.getRadius());
		System.out.println("Color:" + fan3.getColor());
		}
	}
}





