//Juedeja Richard_Module7_6-29-25
// This program creates the UseFans class with a collection of Fan instances.
//Create a method taking a collection of Fan instances for displaying without using the toString() method.
//Create a method that takes a single instance of a Fan for displaying without using the toString() method.
//Use the ‘this’ reference throughout the Fan class where allowed.
//Write test code that creates a collection of Fans and displays the functionality of all the Fan instances in the collection.

//packages that help with making a collection with arrays

import java.util.List;
import java.util.ArrayList;

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


//creates the collection of fan instances(objects) with arraylist
	public static void main(String[] args) {
		List<Fan> fanList = new ArrayList<>();
		fanList.add(new Fan(true, Fan.MEDIUM, 4, "blue"));
		fanList.add(new Fan(true, Fan.SLOW, 8, "red"));
		fanList.add(new Fan(false, Fan.FAST, 3, "purple"));
		
//shows full arraylist of fans and their values
		displayCollection(fanList);


//displays the info for one fan		
		Fan oneFan = fanList.get(0);
		displayFan(oneFan);	

	}
}

