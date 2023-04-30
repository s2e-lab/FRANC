import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TextFormat{
	/** 
	 * Is this a hex digit?
	 */
	
	private static boolean isHex(final char c){
		return Character.isDigit(c) || c=='#';
	}

	private String value;

	public TextFormat(){
		this.value = "";//System.getProperty("os.name")+" : "+System.getProperty("os.version")+"\r\n";
	}
}
