/*  ex10. 10.	The greatest common divisor (GCD) of two integers is the largest integer that evenly
 * divides each of the numbers. Write a method ‘gcd’ that returns the greatest common divisor of two integers.
 * Uses the Euclidean algorithm: */

package methodExercises;

import java.util.Scanner;  //import Scanner class for keyboard input detection

public class ex10 {

	public static void main(String[] args) { //MAIN METHOD 

		Scanner key = new Scanner(System.in); //new Scanner called key 
		
		int number1 = 0, number2 = 0; //two number variables declared and initialised to hold the two inputs 
		
		System.out.println("Please enter number 1: "); //prompt to enter number 1
		number1 = key.nextInt(); //detect input
		
		System.out.println("Please enter number 2: "); //prompt to enter number 2
		number2 = key.nextInt(); //detect input
		
		System.out.println("The greatest common divisor of these two numbers is: " + gcd(number1, number2)); //output message and CALLS METHOD gcd HERE with two arguments 
	
		key.close(); //closing key Scanner inside of Main Method 
	}
	
	
	public static int gcd(int num1, int num2) //METHOD gcd uses the Euclidean algorithm to find the greatest comon divisor (gcd) with two parameters as input 

	{
		int gcd = 0; //new variable where the result will be stored is declared and initialised

        // If either of the numbers is zero, return 1 as a special case (as per Euclidean algorithm)
		if (num1 == 0 || num2 == 0)
		{
			return 1; 
		}
			
        // If num1 is less than num2, swap the values using a temporary variable (tempVar)
		if (num1 < num2)
		{
			int tempVar = num1; //declare and initialise tempVar with num1 value 
			num1 = num2; //make num1 the value of num2 
			num2 = tempVar; //now take num1 original value and assign it to num2, they are 'swapped' 
		}
		
        // Check if num1 is divisible by num2
		if (num1 % num2 == 0)
		{
			return num2; // Return num2 if it evenly divides num1 
			
		} else {
			return gcd(num2, num1 % num2); // Repeat call the Euclid algorithm with num2 and the remainder of num1/num2
		}
		
	}
	
	

}
