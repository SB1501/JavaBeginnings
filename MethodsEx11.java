/* ex11. 11.	Write a method qualityPoints that inputs a student's average and returns a 4 if a student's
 * average is 90 - 100, 3 if a student's average is 80 - 89, 2 if a student's average is 70 - 79, 1 if a 
 * student's average is 60 - 69, and 0 if the average is lower than 60.
 * */ 

package methodExercises;

import java.util.Scanner; //import Scanner class 

public class ex11 {

	public static void main(String[] args) { //MAIN METHOD 

		Scanner key = new Scanner(System.in); //new Scanner called key
		
		int averageGrade = 0; 	//declare and initialise variable to store averageGrade input from user
		String onePoint = " point."; //one of two Strings to be used to make output grammatically correct 
		String moreThanOne = " points."; //"
		String points = "";				//" Variable to store decision which will then be used in output String
		
		System.out.println("Please enter your average grade: "); //prompt to enter average grade as required by Q
		averageGrade = key.nextInt(); //detect input
		
		if(averageGrade >=60 && averageGrade <=69) //only the criteria for one point can determine which word (point or points) goes into the points variable. That's the 60-69 bracket from Q.
		{points = onePoint;} //onePoint String if it's inside this grade boundary
		else  //otherwise...
			points = moreThanOne; //it's more than one and assigned to the variable with value points (plural)
		
		System.out.println("You currently have " + qualityPoints(averageGrade) + points); //output for number of points. CALLS METHOD qualityPoints 
	
		key.close(); //closing key Scanner inside of Main Method 
	}
	

	
	
	public static int qualityPoints(int average) //METHOD qualityPoints declared with one parameter input 
	{
		int result = 0; //declare and initialise a variable to store the resulting number of points as integer
		
		if(average <0 && average >100) //first check, if it's invalid 
		{System.out.println("Invalid Average Grade was entered.");} //invalid message is output 
		
		else if(average <60.0) //checks if lowest group...
		{result = 0;}			//if so 0 points..
		
		else if(average >=60.0 && average <=69.0) //checks if next group...
		{result = 1;}			//if so 1 point
		
		else if(average >=70.0 && average <=79.0) //checks if next group...
		{result = 2;} 			//if so 2 points 
		
		else if(average >=80.0 && average <=89.0) //checks if next group...
		{result = 3;} 			//if so 3 points 
		
		else if(average >=90.0 && average <=100.0) //checks if top group...
		result = 4; 			//if so 4 points
		
		return result; //returns the result value to the point where the METHOD CALL was made
	}
	
}
