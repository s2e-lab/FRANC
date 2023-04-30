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
		return this.id;
	}

	/** 
	 * Compares this type to the specified type.
	 * @param obj the type to be compared.
	 * @return <code>true</code> if this type is the same as
	 * the specified type; <code>false</code> otherwise.
	 */
	@Override public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (this.getClass()!= obj.getClass()) return false;
		
}
}