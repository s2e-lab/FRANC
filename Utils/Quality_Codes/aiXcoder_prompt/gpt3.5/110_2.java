import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID110{
	/**
	* Converts the string argument into a float value.
	*/
	public static float parseFloat(String floatStr){
			try{
			float f = Float.parseFloat(floatStr);
			return f;
		} catch(NumberFormatException e){
			System.out.println("The input is not a valid float");
			return -1;
		}
	}
	
	/**
	* Main function that takes as input two float values and prints their sum and difference.
	*/
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first float number: ");
		String num1 = sc.next();
		System.out.print("Enter second float number: ");
		String num2 = sc.next();
		
		float f1 = parseFloat(num1);
		float f2 = parseFloat(num2);
		
		if(f1 != -1 && f2 != -1){
			float sum = f1 + f2;
			float diff = f1 - f2;
			System.out.println("Sum: " + sum);
			System.out.println("Difference: " + diff);
		}
	}
}