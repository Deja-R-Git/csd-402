package Module9;
//Program 2: Write a program to create a new file titled data.file, if the file does not exist.
// Then write to the new file, adding 10 randomly generated numbers, or append 10 randomly generated numbers
// to a previous file. Each integer is to be separated by a space. Close the file, then reopen the file
// and read the data from the file and display it.

import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class RandomNumbers {
    public static void main(String []args){
        String filename = "data.file";
        File file = new File(filename);

        try {
//checks if the file exists
            boolean fileExists = file.exists();
            String operationMessage = fileExists ? "Appending to existing file" : "Creating new file";
            System.out.println(operationMessage + ": " + filename);

// Open file in append mode to write to file, adds to end by default
            FileWriter fileWriter = new FileWriter(file, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

// Generate and write 10 random numbers
            Random random = new Random();
            System.out.println("Writing 10 random numbers to file:");
            for (int i = 0; i < 10; i++) {
                int randomNumber = random.nextInt(100); // Random number between 0-99
                printWriter.print(randomNumber + " ");
                System.out.print(randomNumber + " ");
            }
            System.out.println(); // New line after displaying numbers

// Close the file (can delete data.file on the left to restart file)
            printWriter.close();
            System.out.println("File closed successfully after writing.");

// Reopen the file and read data
            System.out.println("\nReading all data from file:");
            Scanner fileScanner = new Scanner(file);

// Use a delimiter to separate by spaces
            fileScanner.useDelimiter(" ");

            // Read and display all numbers
            while (fileScanner.hasNext()) {
                if (fileScanner.hasNextInt()) {
                    // Read integer values
                    int number = fileScanner.nextInt();
                    System.out.print(number + " ");
                } else {
                    // Skip any non-integer values
                    fileScanner.next();
                }
            }
            System.out.println(); // New line after displaying numbers

            // Close the scanner
            fileScanner.close();

        } catch (IOException e) {
            System.out.println("An error occurred during file operations: " + e.getMessage());

        }
    }
}
