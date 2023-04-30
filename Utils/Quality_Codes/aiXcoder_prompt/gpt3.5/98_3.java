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
    String result = "";
    for(int i=0; i<text.length(); i++){
        if(text.charAt(i) == '&'){
            if(i+1<text.length() && text.charAt(i+1) == '&'){
                result += "&";
                i++;
            }
            else{
                result += "";
            }
        }
        else{
            result += text.charAt(i);
        }
    }
    return result;
}