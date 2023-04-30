import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ToStringStyle{
	/** 
	 * <p>Append to the <code>toString</code> the detail of a <code>byte</code> array.</p>
	 * @param buffer  the <code>StringBuffer</code> to populate
	 * @param fieldName  the field name, typically not used as already appended
	 * @param array  the array to add to the <code>toString</code>,not <code>null</code>
	 */
	
	protected void appendDetail(StringBuffer buffer,String fieldName,byte[] array){
		int length = fieldName.length();
		for(int i = 0; i < length; i++){
			buffer.append(array[i]);
			if(i!= length - 1){
				buffer.append(' ');
			}
		}
	}
	
}