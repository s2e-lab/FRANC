import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID93{
	/**
	* Check whether the String is a valid Java number
	*/
	public static boolean isNumber(String str){
			//Begin by checking if the string is null or empty
		if (str == null || str.isEmpty()){
			return false;
		}

		//Check if the string contains a decimal point or exponent
		boolean decimalFlag = false;
		boolean exponentFlag = false;

		//loop through each character in the string to check if it's valid
		for (int i = 0; i < str.length(); i++){
			char ch = str.charAt(i);

			//check for exponent character
			if (ch == 'e' || ch == 'E'){
				if (exponentFlag || i == 0 || i == str.length() - 1){
					//invalid exponent position
					return false;
				}
				exponentFlag = true;
			}

			//check for decimal point character
			else if (ch == '.'){
				if (decimalFlag || exponentFlag || i == 0 || i == str.length() - 1){
					//invalid decimal position
					return false;
				}
				decimalFlag = true;
			}

			//check for negative sign at beginning of string
			else if (ch == '-' && i == 0){
				if (str.length() == 1){
					//string contains only negative sign
					return false;
				}
			}

			//check for digits
			else if (ch < '0' || ch > '9'){
				//invalid character
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		//test with sample inputs
		System.out.println(isNumber("1234.56")); //true
		System.out.println(isNumber("-1234.56")); //true
		System.out.println(isNumber("1.2.3")); //false
		System.out.println(isNumber("1.23e4")); //true
		System.out.println(isNumber("-1.23E4")); //true
		System.out.println(isNumber(".23")); //true
		System.out.println(isNumber("23.")); //true
		System.out.println(isNumber("-")); //false
	}
}