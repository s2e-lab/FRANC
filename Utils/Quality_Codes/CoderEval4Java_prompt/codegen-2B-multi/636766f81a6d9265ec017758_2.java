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
		int hashElements = 0;
		for (Type t = this; t!= null && t!= BOTTOM; t = t.prev){
			hashElements += t.bits;
		}
		return hashElements; // this is the hashcode for the type
	}
	
	@Override public boolean equals(Object x){
		if (x == null || x.getClass()!= Type.class){
			return false;
        }
		Type e = (Type)x;
}
}