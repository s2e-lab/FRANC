import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID98{
	/**
	* Convert the text '&' mnemonic string to text string. The '&' symbol is treated as the mnemonic pointer. The double "&&" symbols are treated as the single '&'. For example the string "&Look && Feel" is converted to "Look & Feel".
	*/
	public static String convertMnemonicString(String text){
			StringBuilder sb = new StringBuilder();
		boolean ampersandFound = false;
		for(int i=0; i<text.length(); i++){
			if(text.charAt(i) == '&'){
				if(i < text.length() - 1 && text.charAt(i+1) == '&'){
					sb.append('&');
					i++;
				}
				else{
					ampersandFound = true;
				}
			}
			else{
				sb.append(text.charAt(i));
			}
		}
		if(ampersandFound){
			return sb.toString();
		}
		else{
			return text;
		}
	}
}