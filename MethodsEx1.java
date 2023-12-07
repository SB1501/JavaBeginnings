/* 1.	Write and test a method hypotenuse that calculates the length of the hypotenuse of a right angled triangle 
 * when the other two sides are given. To find the hypotenuse, add the squares of the other sides, then take the 
 * square root.Use this method in a program to determine the length of the hypotenuse for each of the triangle 
 * shown below. This method should take two double arguments and return the hypotenuse as a double. 3.0, 4.0. 5.0, 12.0. 8.0, 15.0*/

package methodExercises;

public class ex1 {

	public static void main(String[] args) {

		System.out.println(hyp(3.0, 4.0)); //calling a method each time and giving it parameters 
		System.out.println(hyp(5.0, 12.0));
		System.out.println(hyp(8.0, 15.0));

		
	}

	public static double hyp(double side1, double side2) { // this is the method. it receives two arguments 
		
		double result = 0.0; //must declare a local variable to the method to store calculation in 
		
		return  result = Math.sqrt(side1*side1 + side2*side2); //this is the forumula for the methods function, which is where it is calculated and returned
		
	}
	
	
}
