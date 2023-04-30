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
				return Float.parseFloat(floatStr);
			}
catch(NumberFormatException e){
				System.out.println("Invalid input for float value");
				return 0; //returning 0 as default value
			}
	}
	
	
	/**
	* Main Function
	*/
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the float value : ");
		String floatStr = sc.next();
		float floatValue = parseFloat(floatStr);
		System.out.println("The float value is : "+floatValue);
	}
}