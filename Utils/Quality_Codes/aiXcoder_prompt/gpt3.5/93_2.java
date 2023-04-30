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
			}
			catch(NumberFormatException e){
				return false;
			}
		}

public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input=sc.nextLine();

		if(isNumber(input)){
			System.out.println("Valid Java number");
		}
		else{
			System.out.println("Not a valid Java number");
		}
	}
}