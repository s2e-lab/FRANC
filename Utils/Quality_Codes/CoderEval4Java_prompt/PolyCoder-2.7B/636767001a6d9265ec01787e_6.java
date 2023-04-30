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
			StringBuffer sb=new StringBuffer();
			boolean comma=false;
 		
			Class<?> c=null; 
			Method[] ms=null;
			Method m=this.getClass().getSuperclass().getMethods();
}
}