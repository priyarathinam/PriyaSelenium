package day1.classroom;

public class SwitchOperator {

	/*
	 * Goal: Perform calculation based on the user input operations
	 * 
	 * inputs: 2,3 and "add"
	 * output: added value: 5
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a Switch case: type 'switch', followed by: ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */	

	public static void main(String[] args) {

		// Declare 2 integer numbers
		int a = 2;
		int b = 3;

		// Declare a String variable with input as operations (Tip:
		String add = "Addition of the given numbers: ";
		String sub = "Subtraction of the given numbers: ";
		String mul = "Multiplication of the given numbers: ";
		String div = "Division of the given numbers: ";

		// Initiate switch case for operations
		switch ("sub") {
		// Within switch, include as case for add operation
		case "add":
			System.out.println(add+ (a+b));
			break;
			// Within switch, include as case for sub operation

		case "sub":
			System.out.println(sub+ (a-b));
			break;
			// Within switch, include as case for mul operation
		case "mul":
			System.out.println(mul+ (a*b));
			break;

			// Within switch, include as case for div operation
		case "div":
			System.out.println(div+ (a/b));
			break;
		default:
			System.out.println("Cannot perform operation");
			break;
		}







		// Within switch, include 'default' to handle other operations


		//end of switch case

	}

}
