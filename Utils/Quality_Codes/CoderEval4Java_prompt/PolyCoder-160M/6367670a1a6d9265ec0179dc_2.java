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
			while(end>start){
				final int mid =start+end/2;
				final Class<?> declaringClass=currentFrame.getDeclaringClass();
				
				/** 
				 * For each type in {@link #currentFrame}, write the current method being written. If it uses a new internal reference for the type, also update the referenced field in the field_list of the type. However, if it uses a class reference, it is possible to reuse that reference so that the
				// underlying type (in this example, if this type supports the {@code new} type), otherwise