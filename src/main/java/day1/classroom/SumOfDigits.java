package day1.classroom;

public class SumOfDigits {

	/*
	 * Goal: Find the sum of digits of a given number
	 * 
	 * input: 123
	 * output: 1+2+3 = 6
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'while' loop: type 'while', followed by ctrl + space + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */

	public static void main(String[] args) {

		// Declare your input number (int)
		int input = 9999;

		// Initialize an integer variable by name: sum
		int sum = 0;
		
		// Use loop to calculate the sum: which loop to use until the number goes less than 10??
		while (input>10) {
			// Within loop: get the remainder when done by 10 -> Tip: use mod
			
			int remainder = input%10;//6

			// Within loop: add that remainder to the sum
			sum = sum + remainder;//6,12,18,24

			// Print the remainder to confirm
			System.out.println("The remainder is "+remainder);//5		

			// Print the sum to confirm
			System.out.println("The sum is "+sum);//15

			// Within loop: get quotient of that number (tip: quotient should be same variable of loop condition)
			input = input/10;//1234,123,12,1
			
			// Print the quotient to confirm
			System.out.println("The input is "+input);//123

		}
		// Outside the loop: print the final sum
		System.out.println("The final sum is "+ (sum+input));
	}

}
