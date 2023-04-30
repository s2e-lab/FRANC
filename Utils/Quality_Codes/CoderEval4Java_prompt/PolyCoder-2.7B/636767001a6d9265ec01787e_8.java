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
		 try{
	   
	 	   return( getToString(null) );
		 
		}catch(NoSuchMethodException n){	System.out.println(n.getMessage());	
	  }
	}
	
	/**
	 * Returns the String built using the specified ParameterTypes as the
	 * parameter types.  If the parameterTypes is null an
	 * ArrayIndexOutOfBoundsException will be thrown.
	 * @param paramTypes A set of ParameterTypes used in the ToStringBuilder.
	 * @return A comma delimited String from the parameterTypes.
	 */
	
}