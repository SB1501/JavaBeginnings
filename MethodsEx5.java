/*  ex5. Modify problem 4 to form the square out of whatever character is contained in character parameter fillCharacter.  Thus, if is side is 5 and fillCharacter is '#', the method prints:
#####
#####
#####
#####
#####

 */

package methodExercises;

import java.util.Scanner; //import key input scanner 

public class ex5 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in); //new Scanner called key inside main method
		
		int sides = 0; //side variable as specified in Q
		char fillCharacter = ' ';
		
		System.out.println("Please enter the number for the sides for the asterisks square block"); //input asking user to specify length for sides 
		sides = key.nextInt(); //detect keyboard input
		System.out.println("Enter the character you'd like to be used for the block: "); //input asking for user to specify character to be used in the block
		fillCharacter = key.next().charAt(0);  //detect keyboard input
		System.out.println(asteriskBlock(sides, fillCharacter)); //CALL METHOD asteriskBlock and pass sides input to it as an argument

		
		key.close(); //close key Scanner inside MAIN
	}

	public static char asteriskBlock(int num1, char char1) { //METHOD asteriskBlock declaration. one parameter (argument taken from the call) called num1. 
		 
		int sidelength = num1; //e.g. 4 of * in each row wanted and 4 rows of this, if 4 is input
		char output = ' '; //blank return as return is required to return below loops 		
		char characterSpecified = char1; //takes argument given by the method call and puts it in characterSpecified
		
		for(int j = 1; j<=sidelength; j++) //outer loop starts at 1 so that first run doesn't cause 5 to come out when 4 input etc. While i is less than sidelength (e.g. 4) increment i by one to do it 4 times 
		{
		System.out.println(""); //leave a new line each time 
		for(int i = 1; i<=sidelength; i++) //now, inside each line, do this INNER LOOP. i is 1 to stop first run being counted within number, e.g. 5 output for 4 entered. While i is less than sideLentgh (e.g. 4) increment i by one. To do it 4 times.
			{
			System.out.print(characterSpecified); //each iteration of the INNER LOOP will output a *, so if this runs 4 times, a row with **** is made. Then the OUTER LOOP above repeats this the same number of times, creating multiple lines of the same.
			}				//now above we are outputting the characterSpecified for the block, same handling of new lines / repeating that character as before in ex4
		} //closes out of loops 
		
		return output; //returns output, but is a blank char as output is required and only way to show above loops working when method is called
	}
}


