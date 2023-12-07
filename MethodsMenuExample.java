package methodExercises;

import java.util.Scanner;
import general.*; //importing my general library which includes My, MyVal

public class MenuExample {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		int opt = 0, no1 = 0, no2 = 0, ans = 0;
		
		do {
			opt = MyVal.validInt("\n\tSimple Calculator\n\n\t1 Add\n\t2 Subtract\n\t3 Multiply\n\t4 Divide\n\t5 Exit\n\n\tPlease select an option:", 1, 5);
			
			if (opt!= 5) {
				
				no1 = MyVal.validInt("\n\n\tPlease enter number 1:");
				no2 = MyVal.validInt("\n\n\tPlease enter number 2:");
				
				switch (opt) {
				case 1: 
					ans = add(no1, no2);
					break;
				case 2: 
					ans = subtract(no1, no2);
					break;
				case 3: 
					ans = multiply(no1, no2);
					break;
				case 4: 
					ans = divide(no1, no2);
					break;
				default: 
					My.p("\n\n\tInvalid option!!!");
					break;
				}
				
				My.p("\n\n\n\tAnswer: " + ans);
			}
		} while (opt!= 5);
		
		key.close();
	}

	public static void displayMenu() {
		
		My.p("\n\tSimple Calculator");
		My.p("\n\n\t1 Add");
		My.p("\n\n\t2 Subtract");
		My.p("\n\n\t3 Multiply");
		My.p("\n\n\t4 Divide");
		My.p("\n\t5 Exit");
		My.p("\n\n\tPlease select an option: ");
	}
	
	public static int add(int no1, int no2) {
		return no1 + no2; 
	}
	
	public static int subtract(int no1, int no2) {
		return no1 - no2;
	}
	
	public static int multiply(int no1, int no2) {
		return no1 * no2;
	}
	
	public static int divide(int no1, int no2) {
		return no1 / no2; 
	}

}
