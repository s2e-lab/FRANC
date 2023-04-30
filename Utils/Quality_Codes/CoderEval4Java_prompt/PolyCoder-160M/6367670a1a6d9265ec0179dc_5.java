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
		 //Put the JVMS verification_type into theJVMS-style object
		 //To have it more complicated, we need to convert it into a Java version
		JVMSVerifierVerifier verifier = new JVMSVerifierVerifier();
		
		verifier.init();
		verifier.encode_int(start,end);
	}
	
	/* MethodWriter for a specific type */ 
	//public void write_method_info(){
}