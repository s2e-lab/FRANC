import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Type{
	/** 
	 * Returns a hash code value for this type.
	 * @return a hash code value for this type.
	 */
	
	@Override public int hashCode(){
		return this.value();
	}
	
	/** 
	 * Determines whether or not two types are equal.
	 * Two types are the same if and only if the values returned by
     * both {@link #value()} methods are equal.
	 * @param obj the object with which to compare this type.
	 * @return <tt>true</tt> if this type and the object are equal;
	 *         <tt>false</tt> otherwise.
	 */	
	@Override public boolean equals(Object obj){
}
}