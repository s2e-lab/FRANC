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
		int hashCode = 1;
		
		hashCode = hashCode * 31 + this.ty.hashCode();
		if (this.ty == Type.BOOL){ 
			hashCode = hashCode * 31 + (((Boolean) this.v).boolValue()? 1 : 0);
		}
		
		if (this.ty == Type.INT){ 
			hashCode = hashCode * 31 + new Integer(this.v.intValue()).hashCode();
		}
		
}
}