import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID98{
	/**
	* Convert the text '&' mnemonic string to text string. The '&' symbol is treated as the mnemonic pointer. The double "&&" symbols are treated as the single '&'. For example the string "&Look && Feel" is converted to "Look & Feel".
	*/
	public static String convertMnemonicString(String text){
			StringBuilder sb = new StringBuilder(); //initialize StringBuilder
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '&') {
                if (i + 1 < text.length() && text.charAt(i + 1) == '&') {
                    sb.append('&'); //append single &
                    i++;
                } else {
                    sb.append(""); //if nothing to append
                }
            } else {
                sb.append(text.charAt(i)); //append the character
            }
        }
        return sb.toString(); //return the string with mnemonic removed
	}
}