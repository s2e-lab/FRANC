import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID1{
	/**
	* Creates a padding string of a certain length
	*/
	public static String createPadding(int length, char padChar){
			String padding = "";
		for(int i = 0; i < length; i++){
			padding += padChar;
		}
		return padding;
	}
}