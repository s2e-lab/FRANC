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
			//if (debug)	 System.out.println("Abstract classes added" );

			// Write out the new JVMS format version
			if (VDBG) System.out.println("Start index for the new frame");
			 
			 
			
			// Add the new JVMS class information
			VDBG = false;
			FrameHeaderHeaderInfo header = null;
			if (currentFrame==null || (currentFrame instanceof Method))
				header = new  MethodFrameHeader(start, false);

			// Write out the new J
}
}