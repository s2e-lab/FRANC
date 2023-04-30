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
}catch(NumberFormatException e){
System.out.println("Invalid input!");
}
return 0;
}

public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a floating point number:");
String floatStr = sc.nextLine();
float floatValue = parseFloat(floatStr);
System.out.println("The float value is: " + floatValue);
}
}