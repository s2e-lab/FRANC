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
}