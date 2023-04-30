import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID1{
	/**
	* Creates a padding string of a certain length
	*/
	public static String createPadding(int length, char padChar){
			StringBuilder temp = new StringBuilder();
			temp.append(Integer.toString(length));
			while(temp.charAt(temp.length()-1) == padChar){
					temp.setLength(temp.length()-2);
			}
			return temp.toString();
	}
}
