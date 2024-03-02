/**
 * File name: CalculatorEngine.java
 * Author: Liying Guo, 040858257
 * Course: CST8284 OOP
 * Assignment: Assignment 2
 * Date: 2023-11-26
 * Professor: Sandra Iroakazi
 * Purpose: The class is to calculate "+","-","*","/"
 */
package assignment2;
/**
 * This is the class doing the calculation. 
 * @author Liying Guo
 * @version 1.0
 * @since 2023-11-26
 */
public class CalculatorEngine {
	/***
	 * adding equation
	 * @param num1 first number for adding equation
	 * @param num2 second number for adding equation
	 * @return the result of adding equation
	 */
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	/***
	 * subtract equation
	 * @param num1 first number for subtract equation
	 * @param num2 second number for subtract equation
	 * @return the result of subtract equation
	 */
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}
	/***
	 * multiply equation
	 * @param num1 first number for multiply equation
	 * @param num2 second number for multiply equation
	 * @return the result of multiply equation
	 */
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}
	/***
	 * divide equation
	 * @param num1 first number for divide equation
	 * @param num2 second number for divide equation
	 * @return the result of divide equation
	 */
	public int divide(int num1, int num2) {
		return num1 / num2;
	}
}
