import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class UriComponent{
	/** 
	 * Encodes a string with template parameters names present, specifically the characters '{' and '}' will be percent-encoded.
	 * @param s the string with zero or more template parameters names
	 * @return the string with encoded template parameters names.
	 */
	
	public static String encodeTemplateNames(String s){
		String res = "";
		String rez = "";
		for(int i=0;i<s.length();i++){
			Integer index = Integer.parseInt(s.substring(i,i+1));
			rez = String.format("%%%st%d",rez.toLowerCase(),index);
			
		}
// Fix: Dead store to local variable

// Fixed Code: 
//		System.out.println(""+rez);
		return rez;
	}	
}

public class Tester 
{

private static void printText(String src) {

}
}