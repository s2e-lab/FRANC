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
			int maxNumFields=end-start+1;
			int[] indexList = new int[maxNumFields];
			System.arraycopy(currentFrame.indexTable,0,indexList,start,maxNumFields);
			putFieldToStackmapTableEntries(indexList,end);
	}
	
	private String getFieldName(final int index){
		String sIdx = currentFrame.nameTable!=null?currentFrame.nameTable[index]:null;
}
}