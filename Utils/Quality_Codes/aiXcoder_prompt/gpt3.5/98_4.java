import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID98{
	/**
	* Convert the text '&' mnemonic string to text string. The '&' symbol is treated as the mnemonic pointer. The double "&&" symbols are treated as the single '&'. For example the string "&Look && Feel" is converted to "Look & Feel".
	*/
	public static String convertMnemonicString(String text){
			public static String convertMnemonicString(String text){
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<text.length();i++){
			if(text.charAt(i) == '&' && i+1<text.length() && text.charAt(i+1) != '&'){
				continue;
			}else{
				sb.append(text.charAt(i));
			}
		}
		return sb.toString();
	}
	
/**
 * Test the convertMnemonicString method with sample input.
 */
public static void main(String[] args){
	String input = "&Look && Feel";
	String output = convertMnemonicString(input);
	System.out.println(output);
}
}