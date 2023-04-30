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
		
		if((null == array)){
			throw new NullPointerException("Null argument in ToString.appendDetail");
		}
		
		int length = array.length;
		StringBuilder result = new StringBuilder();

		if(buffer.length() > 0) result.append(buffer);


		for(int index = 0;index < length;index++){
			result.append(fieldName);
			result.append("[");
			result.append((int)array[index]);
			result.append("]");
		}

		
}
}