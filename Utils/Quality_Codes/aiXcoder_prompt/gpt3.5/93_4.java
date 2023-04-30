import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID93{
	/**
	* Check whether the String is a valid Java number
	*/
	public static boolean isNumber(String str){
			try{
	Double.parseDouble(str);
	return true;
} catch(NumberFormatException nfe){
	return false;
}
}

/**
* Main Method
*/
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a string:");
	String inputStr = scan.nextLine();
	if(isNumber(inputStr)){
		System.out.println(inputStr + " is a valid Java number.");
	}else{
		System.out.println(inputStr + " is not a valid Java number.");
	}
}
}