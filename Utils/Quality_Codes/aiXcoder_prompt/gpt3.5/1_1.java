import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID1{
	/**
	* Creates a padding string of a certain length
	*/
	public static String createPadding(int length, char padChar){
			StringBuilder padding = new StringBuilder();
		for(int i=0;i<length;i++){
			padding.append(padChar);
		}
		return padding.toString();
	}
}
