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
		int hash = 7;
		hash = 83 * hash + (this.typeId!= null? this.typeId.hashCode() : 0);
		return hash;
	}

	/** 
	 * Indicates whether some other object is "equal to" this one.
	 * @return true if both objects are equal
	 */
	
	@Override public boolean equals(Object other){
}
}