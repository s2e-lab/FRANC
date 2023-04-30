import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID98{
	/**
	* Convert the text '&' mnemonic string to text string. The '&' symbol is treated as the mnemonic pointer. The double "&&" symbols are treated as the single '&'. For example the string "&Look && Feel" is converted to "Look & Feel".
	*/
	public static String convertMnemonicString(String text){
			StringBuilder sb = new StringBuilder(text); //create a new StringBuilder object with the given text string
		for(int i=0; i<sb.length(); i++){ //loop through the StringBuilder object
			if(sb.charAt(i)=='&'){ //if the current character is '&'
				if(i+1<sb.length() && sb.charAt(i+1)=='&'){ //check if the next character is also '&'
					sb.deleteCharAt(i); //if yes, delete the current '&'
				}else{
					sb.deleteCharAt(i); //if not, delete the current '&' and add back the mnemonic pointer at the new position
					i--;
				}
			}
		}
		return sb.toString(); //return the converted string
	}
}