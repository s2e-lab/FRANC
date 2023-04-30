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
		int hash=5;
		hash = 47 * hash + this.typeId;
		return hash;
	}
	
	/** 
	 * Returns true if this type equals to the specified type,
	 * false otherwise.
	 * @param obj the given object to compare for equality.
	 * @return true if this type equals to the specified type,
	 * false otherwise.
	 */
	
	@Override public boolean equals(Object obj){
		if(obj == null) return false;
}
}