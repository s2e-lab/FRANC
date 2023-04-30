import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID1{
	/**
	* Creates a padding string of a certain length
	*/
	public static String createPadding(int length, char padChar){
			StringBuffer buf=new StringBuffer(length);
			for(int i=0;i<length;++i){
				if(i<length-1 && i%(2*length)==0){
					buf.append(padChar);
				}else{
					buf.append(padChar);
				}
			}
			return buf.toString();
	}

}