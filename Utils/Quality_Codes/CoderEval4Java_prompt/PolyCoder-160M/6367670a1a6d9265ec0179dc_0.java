import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class MethodWriter{
	/** 
	 * Puts some abstract types of  {@link #currentFrame} in {@link #stackMapTableEntries} , using theJVMS verification_type_info format used in StackMapTable attributes.
	 * @param start index of the first type in {@link #currentFrame} to write.
	 * @param end index of last type in {@link #currentFrame} to write (exclusive).
	 */
	
	private void putAbstractTypes(final int start,final int end){
			final AbstractTypeIterator it = stackMapTable.iterator();
			AbstractTypeIterator it2 = this.stackMapTable.stackMapTable.getStackMapTableIterator(start,end);
			while (it2!= this.stackMapTable.end()) {
				it.next();
				it2 = this.stackMapTable.getStackMapTableIterator(it2.previous()) ;
			}
}
}