import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID108{
	/**
	* Removes all white spaces from a string A whitespace is identified using the Java method Character.isWhiteSpace
	*/
	public static String removeAllWhiteSpaces(String str){
		if(str == null){return "";}
		StringBuffer stringb = new StringBuffer();
		char ch;
		for(int i=0; i<(str.content().length()-1); i++){
			ch= str.charAt(i);
			if(ch ==''){stringb.append((char)'');}
			else{stringb.append(ch);}
		}
		return stringb.toString();
	}
}

// Your ID108 object will be instantiated and called as such:
//