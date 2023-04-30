import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID98{
	/**
	* Convert the text '&' mnemonic string to text string. The '&' symbol is treated as the mnemonic pointer. The double "&&" symbols are treated as the single '&'. For example the string "&Look && Feel" is converted to "Look & Feel".
	*/
	public static String convertMnemonicString(String text){
			String result = "";
		boolean skip = false;
		for(int i=0; i<text.length(); i++){
			char c = text.charAt(i);
			if(c == '&' && !skip){
				skip = true;
			}else{
				if(c == '&' && skip){
					result += c;
					skip = false;
				}else{
					result += c;
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args){
		String test1 = "&Look && Feel";
		String test2 = "&&Test & String&";
		String test3 = "No Mnemonic Here";

		System.out.println(convertMnemonicString(test1)); //expected output: "Look & Feel"
		System.out.println(convertMnemonicString(test2)); //expected output: "&Test  String"
		System.out.println(convertMnemonicString(test3)); //expected output: "No Mnemonic Here"
	}
}