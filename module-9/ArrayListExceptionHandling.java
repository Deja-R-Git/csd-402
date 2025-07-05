package Module9;
//JuedejaRichard_Module9_7-5-25
// Program 1: Write a program that uses an ArrayList filled with a minimum of 10 Strings.
// Use a ‘for-each’ loop to print the ArrayList collection. Then ask a user which element
// they would like to see again. Then, attempt printing the element in a try/catch format
// which will result in the element being displayed. If the element value received is invalid,
// display a message that an Exception has been thrown displaying “Out of Bounds”. In this program,
// include the use of Autoboxing/Auto-Unboxing, working with a user String input.


import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExceptionHandling{

    public static void main(String []args){
//Fruit arraylist items index 0-9 with 10 elements
        ArrayList<String> fruits= new ArrayList<> ();
        fruits.add("Apple");
        fruits.add("Nectarine");
        fruits.add("Kiwi");
        fruits.add("Raspberry");
        fruits.add("Strawberry");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Blueberry");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Fruit List:");
        for(String fruit:fruits) {
            System.out.println(fruit);
        }
//created scanner object instance (open)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which Fruit would you like to see again?: ");

//exception handling try/catch block
       try{
           String userInput = scanner.nextLine();
//Get user input as String and convert to Integer (auto-unboxing will happen)
           Integer index = Integer.parseInt(userInput);
// Try to print the element at the specified index
           System.out.println("The fruit at index " + index + " is: " + fruits.get(index));

// e is shorthand for exception
       } catch (IndexOutOfBoundsException e) {
           // Handle index out of bounds exception
           System.out.println("Exception thrown: Out of Bounds");

       } catch (NumberFormatException e) {
           // Handle case where user didn't enter a valid number
           System.out.println("Exception thrown: Please enter a valid number");

       } finally {
           //must close scanner
           scanner.close();
       }

    }
}

