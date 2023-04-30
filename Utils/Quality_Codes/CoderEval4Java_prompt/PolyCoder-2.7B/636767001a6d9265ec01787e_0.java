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
			return toString("");
	}
	/**
	 * <p> Return a String built by this Builder with the specified suffix
	 * added to the toString. </p>
	 * @param suffix the suffix
	 * @return the built string
	 */
	
	public String toString(String	suffix){
		StringBuffer builder= new StringBuffer();
			builder.append("new ReflectionToStringBuilder(this).{");
			if(suffix!=null)builder.append(suffix);
			
			boolean	first=true;
			
			// iterate over all fields

}
}