/* ex9.	An integer is said to be prime if it is divisible by only 1 and itself. For example, 2, 3, 5 and 7 are prime but 4, 6, 8 and 9 are not.
(a)	Write a method that determines whether a number is prime.
(b)	Use this method in a program that determines and prints all the prime numbers between 2 and 10,000.
 */

package methodExercises;

public class ex9 {

	  public static void main(String[] args) { //MAIN METHOD

		  int primeLimit = 10000; //limit set by Q
		  
		for(int i = 1; i <= primeLimit; i++) //loop to call the method 100 times and only if it says the number isPrime from the isPrime Method saying TRUE, then print that number.
		{
			if (isPrime(i) == true) //only if isPrime returns TRUE, then do the below... CALLS METHOD isPrime 
			{
			System.out.println(i); //print the number i (1-100) which is PRIME 
			}
		}
		  
	 }

	public static boolean isPrime(int number) //METHOD isPrime 
	{
		
	if (number <= 1)					//this step handles 1, 1 is not a prime number 
		return false;					//returns FALSE
	
	if (number == 2 || number == 3)		//checks if number is 2 or 3, these are prime so returns TRUE
		return true;					//returns TRUE 
		
	if (number % 2 ==0 || number % 3 == 0)	//tests each number remaining if it divides by 2 or 3 with remainder zero, then it is NOT prime 
		return false;						//returns FALSE
	
	for (int i = 5; i <= Math.sqrt(number); i = i + 6) //in order to pick up the likes of 25, divides number by 5. If the remainter is less or equal to the square root of the number (e.g. 5 for 25), then ADD 6 each time to i (5+6=11) 
		if (number % i == 0 || number % (i + 2) == 0) //if number (25)%6  is equal to 0 OR number (25)% i+2 (6+2=8) is equal to 0 then it is NOT a prime number
			return false;							 // returns FALSE
	
	return true;
	}
	
	
}
