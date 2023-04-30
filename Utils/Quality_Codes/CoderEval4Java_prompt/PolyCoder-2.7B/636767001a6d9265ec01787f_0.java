import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ToStringStyle{
	/** 
	 * <p>Append to the <code>toString</code> the detail of an <code>int</code> array.</p>
	 * @param buffer  the <code>StringBuffer</code> to populate
	 * @param fieldName  the field name, typically not used as already appended
	 * @param array  the array to add to the <code>toString</code>,not <code>null</code>
	 */
	
	protected void appendDetail(StringBuffer buffer,String fieldName,int[] array){
		 
		
		appendDetail(buffer,fieldName);
		buffer.append(" => {");
		for(int i =0;i<array.length; i++){
					
			if(!array[i]){
				buffer.append(fieldName).append(" = ");
			}
			
			int element= array[i];
			appendDetail(buffer, fieldName,element);
			
		}
		buffer.append(" }");
	}
	
}