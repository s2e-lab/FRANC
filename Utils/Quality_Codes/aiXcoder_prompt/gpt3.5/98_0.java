import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID98{
	/**
	* Convert the text '&' mnemonic string to text string. The '&' symbol is treated as the mnemonic pointer. The double "&&" symbols are treated as the single '&'. For example the string "&Look && Feel" is converted to "Look & Feel".
	*/
	public static String convertMnemonicString(String text){
			if(text == null || text.length()==0) return "";
		int len = text.length();
		StringBuilder sb = new StringBuilder(len);
		boolean hasAmpersand = false;
		boolean nextAmpersandIsMnemonic = false;
		for(int i=0; i<len; i++){
			char c = text.charAt(i);
			if(c == '&'){
				if(hasAmpersand){
					sb.append('&');
					hasAmpersand = false;
				}
				else{
					hasAmpersand = true;
					if(i+1<len && text.charAt(i+1)=='&'){
						sb.append('&');
						i++;
					}
					else{
						nextAmpersandIsMnemonic = true;
					}
				}
			}
			else{
				if(hasAmpersand && nextAmpersandIsMnemonic){
					sb.append(Character.toUpperCase(c));
					nextAmpersandIsMnemonic = false;
				}
				else{
					sb.append(c);
				}
			}
		}
		return sb.toString();
	}
	
	/**
	* Main Function to test the code
	*/
	public static void main(String args[]) {
		String test = "&Look && Feel";
		String result = convertMnemonicString(test);
		System.out.println(result);
	}
}