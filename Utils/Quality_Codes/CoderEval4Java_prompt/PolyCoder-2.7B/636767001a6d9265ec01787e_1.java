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
		 return generate();
	}
	
	public String generate(){
		StringBuffer sb = new StringBuffer();
		buildToString(sb,null);
		return sb.toString();
	}
	
}