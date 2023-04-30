import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID98{
	/**
	* Convert the text '&' mnemonic string to text string. The '&' symbol is treated as the mnemonic pointer. The double "&&" symbols are treated as the single '&'. For example the string "&Look && Feel" is converted to "Look & Feel".
	*/
	public static String convertMnemonicString(String text){
			StringBuilder result = new StringBuilder();
		boolean flag = false; // Flag to check if previous character was '&'
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (c == '&') {
				if (flag) {
					result.append(c);
					flag = false;
				} else {
					flag = true;
				}
			} else {
				result.append(c);
				flag = false;
			}
		}
		return result.toString();
	}
}