import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID110{
	/**
	* Converts the string argument into a float value.
	*/
	public static float parseFloat(String floatStr){
			float result = 0.0f;
try {
    result = Float.parseFloat(floatStr);
} catch (NumberFormatException e) {
    System.out.println("Error: Input is not a valid floating point value.");
}
return result;
}

/**
* Main method where the program starts execution.
*/
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a floating point value:");
    String input = sc.nextLine();
    float f = parseFloat(input);
    System.out.println("The floating point value is: " + f);
}
}