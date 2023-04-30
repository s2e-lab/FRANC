import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ReflectionToStringBuilder{
	/** 
	 * <p> Gets the String built by this builder. </p>
	 * @return the built string
	 */
	
	public String toString(){
		
//		double[][] doubleVals=convert2Double(values);
    
		StringBuffer buff=new StringBuffer();
		appendVals(buff,doubleVals);
		return(buff.toString());
	}
  
	private void appendVals(StringBuffer buff,double[][] vals){
}
}