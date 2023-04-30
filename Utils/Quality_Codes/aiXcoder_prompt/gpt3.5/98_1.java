import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID98{
	/**
	* Convert the text '&' mnemonic string to text string. The '&' symbol is treated as the mnemonic pointer. The double "&&" symbols are treated as the single '&'. For example the string "&Look && Feel" is converted to "Look & Feel".
	*/
	public static String convertMnemonicString(String text){
			StringBuilder sb = new StringBuilder(); // create a StringBuilder object to store the converted string
		boolean foundMnemonic = false; // flag to check if a mnemonic has been found
		for(int i=0; i<text.length(); i++){
			char c = text.charAt(i);
			if(c == '&'){
				// check if next character is also a '&' symbol
				if(i+1<text.length() && text.charAt(i+1) == '&'){
					sb.append('&');
					i++; // skip one character after finding '&&'
				}else{
					foundMnemonic = true; // mark flag as true
				}
			}else{
				// append character to StringBuilder object
				sb.append(c);
				// if a mnemonic was found, append mnemonic symbol to StringBuilder
				if(foundMnemonic){
					sb.append('&');
					foundMnemonic = false; // reset flag
				}
			}
		}
		return sb.toString(); // return converted string
	}
}