//Juedeja Richard-Module3-6-8-25//
//This program will create a pattern with numbers and the @ symbol using nested for loops

public class PyramidPattern {
	public static void main(String [] args){
		int row;
		int column;
		int space;

		for(row = 1; row <= 6; row++){
			//print spaces
			for(space = 6; space > row; space--) {

				System.out.print(" ");
			}

			for(column = 1; column <= row; column++){
				System.out.print(column + " ");
			}
			System.out.println();
		}
	}
}
//inserts space before and after printing numbers to create the pyramid pattern 