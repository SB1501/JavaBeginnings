/* ex.	Write a program that inputs three numbers and passes then to a method which returns the smallest number.  
 * The method should take decimal values as parameters. */

package methodExercises;

import java.util.Scanner; //import Scanner class

public class ex7 {

	public static void main(String[] args) { //MAIN METHOD 

		double num1 = 0.0; //declare and initialising values, must be double as per Q 
		double num2 = 0.0; //"
		double num3 = 0.0; //"
		
		Scanner key = new Scanner(System.in); //new Scanner called key 
		
		System.out.println("Please enter 3x numbers in sequence to have the smallest number returned. \n\n Number 1: "); //prompt to enter 3 numbers starting with number 1 
		num1 = key.nextDouble(); //detect input
		System.out.println("Number 2: "); //prompt for number 2 
		num2 = key.nextDouble(); //detect input
		System.out.println("Number 3: "); //prompt for number 3
		num3 = key.nextDouble(); //detect input
		
		System.out.println("The smallest number of the three entered is: " + returnSmallest(num1, num2, num3)); //output to show smallest number of 3. Calls METHOD returnSmalest and passes 3 arguments in the form of the variables above
		
		key.close(); //closing Scanner key inside Main Method
		
	}

	
	public static double returnSmallest(double number1, double number2, double number3) //METHOD returnSmallest with three parameters specified of type double 
	{
		
		double smallest = 0.0; //initialise and declare storage for variable to store smallest number 
		
		if (number1 < number2 && number1 < number3) //check if number1 is the smallest 
		{
			smallest = number1; //if so, set smallest variable to number1 value 
		}
		else if (number2 < number1 && number2 < number3) //check if number2 is the smallest value 
		{
			smallest = number2; //if so, set smallest variable to number2 value 
		}
		else
		{
			smallest = number3; //if none of the above, otherwise, number3 must be the smallest value so just set it smallest to number3
		}
		
	return smallest; //return whichever value is in smallest back to MAIN METHOD where it was called
	}
	
}
