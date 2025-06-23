//Juedeja Richard_Module5_6-22-25
// This program takes 2D arrays and finds the largest and smallest double or int element and their position

import java.util.Arrays;

public class ArrayMethods{

//finds array value
//finds where the value is in the array

	public static int [ ] locateLargest (double [ ][ ] arrayParam){
		int[] largest = new double[2];

		for(int x=0; x < arrayParam.length; x++){
			for(int y=0; y< arrayParam[x].length; y++){
				if(arrayParam[x][y] > largest.arrayParam)
		return(double) largest;		
	}

	public static int [ ] locateLargest (int [ ][ ] arrayParam){
		int[] largest = new int[2];

		for(int x=0; x < arrayParam.length; x++){
			for(int y=0; y< arrayParam[x].length; y++){
				if(arrayParam[x][y] > largest.arrayParam)
		return(int) largest;	
	}
	public static int [ ] locateSmallest (double [ ][ ] arrayParam){
		int [] smallest = new double [2];

		for(int x=0; x > arrayParam.length; x++){
			for(int y=0; y> arrayParam[x].length; y++){
				if(arrayParam[x][y] < largest.arrayParam)
		return(double) smallest;	
	}

	public static int [ ] locateSmallest (int [ ][ ] arrayParam){
		int [] smallest = new int [2];
		
		for(int x=0; x < arrayParam.length; x++){
			for(int y=0; y< arrayParam[x].length; y++){
				if(arrayParam[x][y] > largest.arrayParam)
		return(double) smallest;	
	}

	public static void main(String[] args) {
		int[][] num1 = { { 2,4,}, {6,8}, {10,12} };
		double[][] num2 = { {12.4, 13.5}, {14.6, 17.9}, {15.8,16.7} };

		for(int x=0; x<int.length; x++){
			for(int y=0; y<y[x].length; y++){
				System.out.print(num1[x][y]);
				System.out.print(num2[x][y]);
	}
} 

//prints the largest and smallest double and int array elements and their position
System.out.println("Largest double element in the array is" + largest(num2));
System.out.println("Largest int element in the array is" + largest(num1));

System.out.println("Smallest double element in the array is" + smallest(num2));
System.out.println("Smallest int element in the array is" + smallest(num1));