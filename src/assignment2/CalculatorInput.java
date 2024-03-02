/**
 * File name: CalculatorInput.java
 * Author: Liying Guo, 040858257
 * Course: CST8284 OOP
 * Assignment: Assignment 2
 * Date: 2023-11-26
 * Professor: Sandra Iroakazi
 * Purpose: The class is the game class holding main logic 
 * to keep user in the game 
 * until user choose to exit the game
 */
package assignment2;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
/**
 * MyHealthData is the domain class to keep user in a game 
 * In the game, user will input an equation 
 * and user will get the result
 * This is a practice on exception handling
 * @author Liying Guo
 * @version 1.0
 * @since 2023-11-26
 *
 */
public class CalculatorInput {
	/***
	 * the associated class to do the equation
	 * only including "+","-","*","/"
	 */
	private CalculatorEngine engine = new CalculatorEngine();
	/***
	 * the associated class to get user input from console
	 */
	private Scanner keyboard = new Scanner(System.in);
	/***
	 * the game user will input an equation 
	 * and user will get the result
	 * This is a practice on exception handling
	 */
	public void start() {
		// declare variables, num1 and num2 are the two numbers in the equation
		// result is the result of the equation
		int num1=0, num2,result = 0;
		// the sign is the operator sign 
		// equalSign is "equal Sign"
		// buffer is the string of the equation getting from the console
		String sign = "", equalSign,buffer;
		// input is to scan buffer separated by space
		Scanner input;
		do {
			System.out.println();
			System.out.print("Enter your equation:");
			buffer = keyboard.nextLine();//1 + 2 =
			input = new Scanner (buffer);
			try {
				// get the first number from the equation
				// It might have two types of exceptions: InputMismatchException and NoSuchElementException
				num1 = input.nextInt();
			}
			catch(InputMismatchException error1 ) {
				// handle InputMismatchException by printing "Error: First number is not an integer."
				System.out.println("Error: First number is not an integer.");
				// skip the rest of code below and back to loop
				continue;
			}
			catch(NoSuchElementException error2) {
				// handle NoSuchElementException by printing "Error: Equation incomplete. First number is missing."
				System.out.println("Error: Equation incomplete. First number is missing.");
				// skip the rest of code below and back to loop
				continue;
			}
			
			try {
				// get the operator sign from the equation
				// It might have a exception: NoSuchElementException
				sign = input.next();
				// user input is "0 =" exits the loop
				if("=".equals(sign) && num1 ==0)
				{
					//exit the loop
					return;
				}
				else if(!sign.equals("+") && !sign.equals("-") && !sign.equals("*") && !sign.equals("/")) {
					// if the sign is not any of "+","-","*","/"
					// throw a custom exception
					throw new Exception();
				}
			}
			catch(NoSuchElementException error2) {
				// handle NoSuchElementException by printing "Error: Equation incomplete. Operator is missing."
				System.out.println("Error: Equation incomplete. Operator is missing.");
				continue;
			}
			catch(Exception error) {
				// handle my custom exception by printing "Invalid operator. Valid operators are +, -, /, and *"
				System.out.println("Invalid operator. Valid operators are +, -, /, and *");
				continue;
			}
			
			try {
				// get the second number from the equation
				// It might have two types of exceptions: InputMismatchException and NoSuchElementException
				num2 = input.nextInt();
			}
			catch(InputMismatchException error3) {
				// handle InputMismatchException by printing "Error: Second number is not an integer."
				System.out.println("Error: Second number is not an integer.");
				continue;
			}
			catch(NoSuchElementException error4) {
				// handle NoSuchElementException by printing "Error: Equation incomplete. Second number is missing."
				System.out.println("Error: Equation incomplete. Second number is missing.");
				continue;
			}
			
			try {
				// get the equal sign from the equation
				// It might have a exception: NoSuchElementException
				equalSign = input.next();
				if(!equalSign.equals("=")) {
					// if the sign is not "="
					// throw a custom NoSuchElementException
					throw new NoSuchElementException();
				}
				
			}
			catch(NoSuchElementException error5) {
				// handle NoSuchElementException(including custom one) by printing "Equation incomplete. Equation must end with ="
				System.out.println("Equation incomplete. Equation must end with =");
				continue;
			}
			// use engine to do the equation
			// it might have a exception: ArithmeticException
			// ArithmeticException happens when 0 is divided
			try {
				switch (sign) {
				case "+":
					result = engine.add(num1, num2);
					break;
				case "-":
					result = engine.subtract(num1, num2);
					break;
				case "*":
					result = engine.multiply(num1, num2);
					break;
				case "/":

					result = engine.divide(num1, num2);
					break;

				}
				System.out.printf("That answer is: %d%n", result);
			} 
			catch (ArithmeticException error6) {
				// handle ArithmeticException by printing "Error: Can not divide by zero! Result is invalid, returning zero."
				System.out.println("Error: Can not divide by zero! Result is invalid, returning zero.");
			}
		}
		while (true);// keep user in the game until exit by "0 =", see line82

	}

}