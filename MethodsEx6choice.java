/* ex6.	Implement the following integer functions:

(a)	Method celsius returns the Celsius equivalent of a Fahrenheit temperature
(b)	Method fahrenheit returns the Fahrenheit equivalent of a Celsius temperature.

Use these functions to write a program that asks you to enter which calculation you want then displays the answer.. oops. Should have read that up front. 

 */

package methodExercises;

import java.util.Scanner; //import in Scanner class 

public class ex6choice {

	public static void main(String[] args) { //MAIN METHOD 

		char choice = ' '; //variable to hold input from user on which method / calculation they want
		double temperatureInput = 0.0; //declaring and initialising a variable for input temperature. double type with decimal more suitable for temperature.
		
		Scanner key = new Scanner(System.in); //new Scanner called key 
		
		System.out.println("Please make a choice: \n\t Convert from Fahrenheit to Celcius - Enter [C]\n\t Convert from Celcius to Fahrenheit - Enter [F]"); //presents menu for choice to be made 
		choice = key.next().charAt(0); //detects input for choice 
		
		
		if(choice == 'c' || choice == 'C') //IF, else if, else to determine...
		{
			System.out.println("Please enter in the Fahrenheit temperature value: "); //prompt: if they input c or C they want the toCelcius calculation and have a Fahrenheit temperature value 
			temperatureInput = key.nextDouble(); //detect input 
			System.out.printf("%12.2f", toCelcius(temperatureInput)); //CALL toCelcius METHOD and String format to cut off decimals after 2 places in the return value shown
		}
		else if(choice == 'f' || choice == 'F')  //Else If
		{
			System.out.println("Please enter in the Celcius temperature value: "); //prompt: if they input f or F they want the toFahrenheit calculation and have a Celcius temperature value 
			temperatureInput = key.nextDouble(); //detect input 
			System.out.printf("%12.2f", toFahrenheit(temperatureInput)); //CALL toFahrenheit METHOD and String format to cut off deicmals after 2 place in the return value shown 
		}
		else  //Else if - any other input not accounted for above, this is followed...
		{
			System.out.println("Please enter [C] or [F]! Try again."); //let them know invalid value.. try again, valid value is C or F 
		}
		
		key.close(); //closing Scanner key inside of Main Method.
		
	}
	
	
	public static double toCelcius (double num1)  //METHOD toCelcius and one input parameter type double num1 
		{
		
		double fahrenheitValue = num1; //assign num1 value to local variable fahrenheighValue 
		
			return (fahrenheitValue-32)*5/9; //return result of formula to convert from F to C value 
		}

	
	public static double toFahrenheit (double num1) //METHOD toFahrenheit and one input parameter type double num1 
		{

		double celciusValue = num1; //assign num1 value to the local variable celciusValue 
		
		return (celciusValue*9/5)+32; //return result of formula to convert from C to F value 

		}
	
}
