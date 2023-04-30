import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID85{
	/**
	* If the string passed in is not blank or null and did not end with the trailing value, then appended the trailing value to it and return the result 
	*/
	public static String appendTrailing(String str, String trailing){
		
//		System.out.println("ID85.appendTrailing called");
        if ((str == null) || str.trim().length() == 0)
                return str;
 
		if (trailing == null)
				return str;
		char ch0 = str.charAt(0);
		char ch1 = str.charAt(str.length()-1);
//		System.out.println("\nID85.appendTrailing returning " + str + "
}
}