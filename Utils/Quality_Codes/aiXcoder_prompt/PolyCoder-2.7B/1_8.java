import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID1{
	/**
	* Creates a padding string of a certain length
	*/
	public static String createPadding(int length, char padChar){
		 StringBuffer result = new StringBuffer();
	 		 int j = 0;
		 
		 result.append(" ");
		 while(--length > 0){
			 // append current character
			 if(j==0){// first character
				 result.append("0123456789");
			 }else{
				 // append padding (if needed)
				 if(j>=10){
					 result.append(padChar);
				 }else{
					 result.append('9');
				 }
			 }
		 }
		 
		 return result.toString();
	}
}