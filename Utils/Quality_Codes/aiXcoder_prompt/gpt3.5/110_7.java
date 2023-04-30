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
		}catch(NumberFormatException e){
			return Float.NaN;
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String inputStr = sc.nextLine();
		float floatVal = parseFloat(inputStr);
		
		if(Float.isNaN(floatVal)){
			System.out.println("INVALID");
		}else{
			System.out.println(floatVal);
		}
	}
}