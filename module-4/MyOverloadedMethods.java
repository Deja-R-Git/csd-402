//Juedeja Richard_ Module 4_6-15-25
//This Java program will show four overloaded methods that return the average of an array

import java.util.Arrays;
//helps convert array into string

public class MyOverloadedMethods{
	public static short average (short [] array){
		int length = array.length;
		short sum = 0;
		for(short num : array) {
		sum += num;
		}
		return(short) (sum / array.length);
	}

	public static int average (int [] array){
		int length = array.length;
		int sum = 0;
		for(int num : array) {
		sum += num;
		}
		return(int) (sum / array.length);
	}

	public static long average (long [] array){
		int length = array.length;
		long sum = 0;
		for(long num : array) {
		sum += num;
		}
		return(long) (sum / array.length);
	}

	public static double average (double [] array){
		int length = array.length;
		double sum = 0;
		for(double num : array) {
		sum += num;
		}
		return(double) (sum / array.length);
	}

//add values to the arrays
//arrays of different types and lengths initialized

	public static void main(String[] args) {
		short[] firstArray= {12, 14, 16, 18, 20};
		int[] secondArray= {1, 2, 3, 4};
		long[] thirdArray= {120L, 130L, 140L,150L, 160L, 170L};
		double[] fourthArray= {3.45, 5.12, 6.78};
		
//Prints out the original list of values for each array and then the average
		System.out.println("The original list of values for this array" + Arrays.toString(firstArray));
		System.out.println("This is the average of the short array-" + average(firstArray));

		System.out.println("The original list of values for this array" + Arrays.toString(secondArray));
		System.out.println("This is the average of the int array-" + average(secondArray));

		System.out.println("The original list of values for this array" + Arrays.toString(thirdArray));
		System.out.println("This is the average of the long array-" + average(thirdArray));

		System.out.println("The original list of values for this array" + Arrays.toString(fourthArray));
		System.out.println("This is the average of the double array-" + average(fourthArray));

	}
}