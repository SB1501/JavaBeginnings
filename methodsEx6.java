/* ex6.	Implement the following integer functions:

(a)	Method celsius returns the Celsius equivalent of a Fahrenheit temperature
(b)	Method fahrenheit returns the Fahrenheit equivalent of a Celsius temperature.

Use these functions to write a program that prints charts showing the 
Fahrenheit equivalent of all Celsius temperature for 0 to 100 degrees
Celsius equivalents of all Fahrenheit temperatures from 32 to 212 degrees

 */

package methodExercises;



public class ex6 {

	public static void main(String[] args) { //MAIN METHOD 

		int farToCelEquivLimit = 100; //number of conversions the Q specified
		int celToFarEquivLimit = 212; //"
		
		System.out.println("CELCIUS TO FAHRENHEIT - FRROM 0˚ TO 100˚C\n"); //output of title to console 
		
		//List of all 1-100˚C to F values 
		for(int i = 1; i<= farToCelEquivLimit; i++) //loop  to repeat number of times as specified in Q 
		{
			System.out.printf(i +"˚C in F˚: " + "%8.2f˚F", toFahrenheit(i)); //each time, print 
			System.out.println("");
		}
		
		
		System.out.println("\n\n\nFAHRENHEIT TO CELCIUS - FROM 32˚ TO 212˚F\n");


		//List of all 32-212˚F to C values 
		for(int i = 32; i<= celToFarEquivLimit; i++)
		{
			System.out.printf(i +"˚F in C˚: " + "%8.2f˚C", toCelcius(i));
			System.out.println("");
		}
		
		
		
	}
	
	public static double toCelcius (double num1)  //works fine 
		{
		
		double fahrenheitValue = num1;
		
			return (fahrenheitValue-32)*5/9;
		}

	public static double toFahrenheit (double num1)
		{

		double celciusValue = num1;
		
		return (celciusValue*9/5)+32;

		}
	
}
