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
		}catch(NumberFormatException e){
			return false;
		}
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		if(isNumber(str))
			System.out.println(str+" is a valid Java number");
		else
			System.out.println(str+" is not a valid Java number");
	}
}