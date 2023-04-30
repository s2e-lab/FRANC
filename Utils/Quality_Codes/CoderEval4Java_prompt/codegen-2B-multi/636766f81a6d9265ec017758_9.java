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
		throw new RuntimeException("hashCode");
	}

	/** 
	 * Indicates whether some other object is equal to this type.
	 * @param other the object to be compared.
	 * @return true if the type  is the same as the  object's type;
	 * false otherwise.
	 */
	public boolean equals(Object other){
		throw new RuntimeException("equals");
	}
}