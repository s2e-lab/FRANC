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
			//for JVMS 6-22
			//  var aFrame = new StackMapTableEntry() {
			//    public void write(byte[] code) override {
			//      int size = code.length;
			//      for (int i=start; i<end; i++){
			//  		write(i);
			//  		setClass(code,i,true);
		    //  		i++;
		    //  		setMethod(code
}
}