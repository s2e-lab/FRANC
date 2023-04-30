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

	/**
	* Main function to test isNumber method
	*/
	public static void main(String[] args){
		String str = "123.45";
		if(isNumber(str)){
			System.out.println(str + " is a valid number");
		}else{
			System.out.println(str + " is not a valid number");
		}
	}
}