import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID110{
	/**
	* Converts the string argument into a float value.
	*/
	public static float parseFloat(String floatStr){
			return Float.parseFloat(floatStr);
}

public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	//get input
	String floatStr = sc.nextLine();
	
	//pass string to parseFloat function to convert to float
	float floatVal = parseFloat(floatStr);
	
	System.out.println("Input string: " + floatStr);
	System.out.println("Float value: " + floatVal);
    }
}