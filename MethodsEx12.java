/* ex12. A parking garage charges £2.00 minimum fee to park for up to three hours. The garage charges an additional 
 * £0.50 per hour for each hour or part thereof in excess of the three hours. The maximum for any given 24-hour period 
 * is £10.00.  Assume that no car parks for longer than 24 hours at a time. Write a program that calculates and prints 
 * the parking charges for each of three customers who parked their car in this garage yesterday. You should enter the 
 * hours parked for each customer. Your program should print the results in a neat tabular format and should calculate 
 * and print the total of yesterday's receipts. The program should create a method calculateCharges to determine the 
 * charge for each customer. Your output should appear in the following format:
	Car	 Hours		Charge
1	1.50	  	 2.00
2	4.00	  	 2.50
3   24.00	  	 10.00

  	TOTAL      	29.50     	 14.50
Passing down number of hours spent in car park, then passes back amount for one car. 
 */

package methodExercises;

import java.util.Scanner; //importing Scanner class for keyboard input

public class ex12 {

	public static void main(String[] args) { //MAIN METHOD

	
		Scanner key = new Scanner(System.in); //new Scanner called key 
		
		int customerCount = 3;  //variable to hold fixed customer count (as specified in Q)
		double hoursParked = 0.0, totalHoursCount = 0.0; //doubles to hold info declared and initialised on one line 
		double customer1hours = 0.0, customer2hours = 0.0, customer3hours = 0.0; //group of related doubles declared and initialised on one line 
		double customer1charge = 0.0, customer2charge = 0.0, customer3charge = 0.0; //"
		String t1 = "Car", t2 = "Hours", t3 = "Charge"; //group or related Strings declared and initialised on same line 
		String cn1 = "1", cn2 = "2", cn3 = "3"; //"
		String tot1 = "TOTAL CHARGE"; //" title for output of totals section stored as a String for String formatting output at end 
		

		for (int i = 1; i<=customerCount; i++) //LOOP for repeating the below the number of times of customers (3) 
		{
			if (i ==1) //first time it will equal 1, and do the below using the Customer 1 variables... 
			{System.out.println("Customer " + i + ", Please enter the number of hours parked for your vehicle: "); //input prompt
			hoursParked = key.nextDouble(); //detect input 
			customer1hours = hoursParked; //store hoursParked for this iteration in customer1hours
			totalHoursCount += customer1hours; //add this amount of hours parked to the total count so far.. 
			customer1charge = calculateCharges(hoursParked); //CALLS calculateCharges METHOD and returns value here to be stored in customer1charge variable 
			hoursParked = 0.0;}		//cleans hoursParked for next iteration
		
			if (i ==2)
			{System.out.println("Customer " + i + ", Please enter the number of hours parked for your vehicle: "); //all same as above but for customer2
			hoursParked = key.nextDouble();
			customer2hours = hoursParked;
			totalHoursCount += customer2hours;
			customer2charge = calculateCharges(hoursParked);
			hoursParked = 0.0;}
		
			if (i ==3)
			{System.out.println("Customer " + i + ", Please enter the number of hours parked for your vehicle: "); //all same as above but for customer3
			hoursParked = key.nextDouble();
			customer3hours = hoursParked;
			totalHoursCount += customer3hours;
			customer3charge = calculateCharges(hoursParked);
			}	
		}
		
		System.out.printf("%20s %10s %10s\n", t1, t2, t3);		//beginning of output String at the bottom for table as required in Q
		System.out.printf("%20s %10.2f %10.2f\n", cn1, customer1hours, customer1charge); //calls various strings in order with String formatting 
		System.out.printf("%20s %10.2f %10.2f\n", cn2, customer2hours, customer2charge); //"
		System.out.printf("%20s %10.2f %10.2f\n\n", cn3, customer3hours, customer3charge); //"
		
		double totalCharge = (customer1charge + customer2charge + customer3charge); //calculates the total charge by adding together each of the customer specific charges 
		
		System.out.printf("%15s %15.2f %10.2f", tot1, totalHoursCount, totalCharge); //outputs final line with String formatting combination citing relevant Strings 
		
		key.close(); //closing key Scanner inside MAIN METHOD 
		
	}
	


	public static double calculateCharges(double hoursSpent) //METHOD calculateCharges declared with one input parameter , hoursSpent passed from MAIN
	{
		double hours = hoursSpent; //creates local variable based on input parameter from MAIN 
		double result = 0.0; //result variable declared and initialised 
		double minimumFee = 2.00, hourlyCharge = 0.50, maximumCharge = 10.00; //various charges to be used as per Q 
		
		if (hours <=3.0) //first of all, check if it's under 3 hours.. 
			{
			result = minimumFee; //if so, it's a minimum £3 charge as per Q. 
			}
		else if (hours >3.0 && hours < 24.0) //otherwise.. if it's more than 3, but less than 24 ...
				{
				result = minimumFee + ((hours-3.0)*hourlyCharge); //then start with the minimum fee of £2, but add the amount of total hours, less the 3 minimum which will cost £2, but the remainder of that is multiplied by the hourly charge of 0.50p, then added to the minimum. 
				}
		else
		{
		result = maximumCharge; //otherwise, it must be above 24 hours, which maximum charge applies of £10.. 
		}
		
		return result; //return whichever value is in result based on the above If structure
	}
	
	
}
