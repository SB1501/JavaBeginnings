/*ex2 2.	Write and test a method multiple that determines for a pair of integers whether the second integer is a 
			multiple of the first. The method should take two integer arguments and return true if the second is a 
			multiple of the first,  false otherwise. Use this method in a program that inputs a series of pairs of integers. */

package methodExercises;

import java.util.Scanner; //for keyboard input Scanner

public class ex2 {

	public static void main(String[] args) { //MAIN METHOD

		Scanner key = new Scanner(System.in); //new scanner
		
		double number1 = 0.0; //variables for our input parameters to be passed to the method 
		double number2 = 0.0; // "
		
		System.out.println("Please enter a Number (1): "); //input one message
		number1 = key.nextDouble(); 						//input one 
		
		System.out.println("Please enter a Number (2): "); //"
		number2 = key.nextDouble();							//"	
		
		System.out.println(isMultiple(number1, number2)); //actual sending of the input to the method
		
	key.close(); //close scanner key
	}

	public static boolean isMultiple(double num1, double num2) { //isMultiple METHOD 
		
		boolean result = false; //Initially set the boolean result to false until proven otherwise..
		
		if(num2%num1 == 0) //checks if dividing num2 into num1 divides with 0 left over result
			{result = true;} //if so, change result to true 
		
		return result;  //now return the value stored in result to the place in MAIN where the method was called
	}

}
