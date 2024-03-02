/**
 * File name: Calculator.java
 * Author: Liying Guo, 040858257
 * Course: CST8284 OOP
 * Assignment: Assignment 2
 * Date: 2023-11-26
 * Professor: Sandra Iroakazi
 * Purpose: The program class to test on CalculatorInput.java
 */
package assignment2;
/**
 * This is the driver class for this program. 
 * This means that it just runs the application with a method
 * main.It prints the instruction of the application 
 * and start the main logic.
 * @author Liying Guo
 * @version 1.0
 * @since 2023-11-26
 */
public class Calculator {
	/**
	 * It prints out the instruction of the application 
	 * and start the main logic.
	 * Once the main logic finished, print out "Program exiting".
	 * @param args Command line arguments are not used by this program.
	 */
	public static void main(String[] args) {
		System.out.println("""
				Welcome to the Assignment 2 CST8284 calculator.
				Written by Liying Guo, #040858257
				Equations are in the form num1 operator num2 =
				Where num1 and num2 must be integers,
				operator is one of +, -, / or *
				Enter 0 = to quit.
				""");
		// instantiate Calculator class
		CalculatorInput input = new CalculatorInput();
		// start the logic
		input.start();
		System.out.println("Program exiting.");
	}

}
