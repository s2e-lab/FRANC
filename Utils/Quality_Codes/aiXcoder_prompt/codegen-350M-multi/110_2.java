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
		}catch(Exception e){
			System.out.println(floatStr);
			throw new NumberFormatException("Invalid Number: "+floatStr);
		}
	}
}

public class ID110_test{
	public static void main(String args[])
	{
		float number1 = ID110.parseFloat("100");
		System.out.println(number1);

		float number2 = ID110.parseFloat("150");
}
}