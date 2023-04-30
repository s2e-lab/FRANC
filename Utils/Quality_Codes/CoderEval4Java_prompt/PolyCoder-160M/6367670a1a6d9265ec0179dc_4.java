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
			final int size = end - start + 1;
			final AbstractClass clazz = MethodWriter.currentMethod.getDeclaringClass();
			final Type[] types = clazz.getMetafieldTypes();
			if(types.length==1) return;

			final Type[] result = new Type[size+1];
			for(int i=start;i<end;i++){
				result[types[i-start]] = clazz.getReturnType();
				result[types[i-start]+1] = null;	
			}		

}
}