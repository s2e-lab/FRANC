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
		 
		 final int stackMapTableSizeMax=start+16;//max stack map size
	
		 final int stackMapTableSize=end+16;//default value of stack map table
		                                        //of max size of frame  <2
		 
		 //stackmapTableSize_int=this.currentFrame.getStackSize()-7;//max stack map size to save off 
																				 //of stack map frame
		 
		 
		
}
}