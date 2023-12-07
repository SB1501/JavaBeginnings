/* ex3. Write a program that inputs a series of integers and passes one at a time to a method even, which uses the 
 * remainder (modulus) operator to determine whether an integer is even. The method should take an integer argument
 * and return true if the integer is even and false otherwise. */

package methodExercises;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		int number = 0;
		char keepgoing = 'Y';
		
		
		do {																				//DO WHILE loop - done at least once, then again only if end condition true 			
				if(keepgoing == 'y' || keepgoing == 'Y')									//if condition is set to Y or y, do the below..
				{System.out.println("Please enter a number, to check if it is even: ");		//print to tell them what this does (check if even)
				number = key.nextInt();														//collect input from keyboard
				System.out.println(isEven(number));											//CALLS METHOD - isEven, passes number collecte above to it as a parameter.
				System.out.println("Do you wish to enter another number? (Y) / (N): ");		//Asking if they want to input another, one by one. Q states 'series of numbers' 
				keepgoing = key.next().charAt(0);}											//change variable to break out if no
				else {keepgoing = 'N';}														//"
			} while (keepgoing == 'Y' || keepgoing == 'y');									//only loop whilst keepgoing is still set to Y or y
		key.close();																		//closing Scanner key inside main
	}
	
	
	
	public static boolean isEven(int num) //isEven METHOD (int num is parameter received from call)
	{
		boolean result = false; //variable declared and initialised to store result, Q states true/false so this method is BOOLEAN type. presume false until proven otherwise
		
		if(num%2 == 0) 			//maths for checking if even, can be divided by 2 with a remainder of 0
		{result = true;}		//if above is true, then set result to true 
		
		return result; 			//as this is NOT VOID, must have a return. returns value to the MAIN method where this method was called
	}
	

}
