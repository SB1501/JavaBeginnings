/* ex8.	An integer is said to be a perfect number if the sum of its factors, including 1 but not the number itself, is equal to the number. 
For example, 6 is a perfect number because 6 = 1 + 2 + 3. Write a method perfect that determines whether parameter number is a perfect number. 
Use this method in a program that determines and prints all the perfect numbers between 1 and 1000. Print the factors of each perfect number to 
confirm that the number is indeed perfect. 
*/

package methodExercises;

public class ex8 {

	public static void main(String[] args) {

		for (int i = 1; i <=1000000; i++) //Q states perfect numbers up to 100,000 - and there aren't many
			if (perfect(i)) //put the number of i (iteration number) CALL perfect METHOD 
				System.out.printf("\n\t %d", i); //and then in each iteration, output the result, String formatted
			
		
	}

	public static boolean perfect (int no) { //new method called PERFECT, one parameter 'no' is passed from MAIN METHOD CALL 
		
		int total = 0; //declare and initialise total variable to hold result 
		
		for (int i = 1; i <no; i++) //for loop to determine if the number is 'perfect'. Repeat while i is less than no (number passed from MAIN)
			if (no % i == 0) //if the number passed has a 0 remainder when divided by i... then
				total += i; //..add i to the total 
				
				if (total == no) //if the value of total is equal to the number passed, then it is perfect 
					return true; //return 'true' to confirm this  
					else  //otherwise, if it is not 'perfect'...
						return false; //return FALSE to the point in the MAIN METHOD which originally called this 'perfect' method
		
	}
	
	
}
