//JuedejaRichard_Module8_7-6-25
//A method that receives an ArrayList populated with an Integer data type holding the integers received from user input.
//The user input is to accept Integers that are then assigned to the ArrayList until a value of 0 is entered, which is also assigned to the ArrayList.
//The ArrayList is then to be sent to the method.
//The method is then to return the largest value in the ArrayList.
//If the ArrayList is sent in empty, the method will then return 0.
//The method signature is to be public static Integer max (ArrayList list).
package Module8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JuedejaArrayListTest {
    public static Integer max(ArrayList<Integer> numbers){
//when there is nothing in the list return the number zero
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }
//max from collections automatically finds the largest integer in the array List
        Integer maxNumber = Collections.max(numbers);
        System.out.print("This is the Largest Number:" + maxNumber);
//returns the value of maxNumber variable
        return maxNumber;
    }

    public static void main(String[] args) {
//create a new array List
        ArrayList<Integer> numbers = new ArrayList<>();
//scanner allows for user input and prompt
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a new number for the list (enter 0 to quit): ");

        int input = scanner.nextInt();
        scanner.nextLine();
//iterates over the list, adds number to array list and prompts for another number
        for (int i = 1; i <= input; i++){
            System.out.println("Enter another number for the list (enter 0 to quit): ");
            int number = scanner.nextInt();
            numbers.add(number);
            }
//prints out array
        System.out.println(numbers);

        scanner.close();
//when zero is entered, no longer prompt for new number
        while (true) {
            if (input == 0) {
                break;


            }


        }
        JuedejaArrayListTest.max(numbers);
    }

}