package com.javaupdates;

import com.javaupdates.interfaces.Addition;
import com.javaupdates.interfaces.Division;
import com.javaupdates.interfaces.Multiplication;
import com.javaupdates.interfaces.PrintInterface;
import com.javaupdates.interfaces.Subtraction;

/**
 * 
 * @author Programmer
 *
 */
public class ArithmeticOperation {

	public static void main(String[] args) {
		Addition addition = (firstNumber, secondNumber) -> firstNumber + secondNumber;
		PrintInterface pi = () -> System.out.println(addition.addition(2, 2));
		pi.print();
		
		//This will also work
		//System.out.print("Addition of Two numbers : " + addition.addition(2, 2));
		
		Subtraction subtration = (firstNumber, secondNumber) -> firstNumber - secondNumber;
		System.out.println(subtration.subtraction(4, 2));
		
		
		Multiplication multiplication = (firstNumber, secondNumber) -> firstNumber * secondNumber;
		System.out.println(multiplication.multiplication(2, 3));
		
		Division division = (firstNumber, secondNumber) -> firstNumber / secondNumber;		
		System.out.println(division.division(6, 2));
	
	}//end  of the method

}//end of the  class
