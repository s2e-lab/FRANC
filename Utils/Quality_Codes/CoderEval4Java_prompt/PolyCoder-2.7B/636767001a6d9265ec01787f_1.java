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
			for (int i=0; i<array.length; i++) {
				Integer integer = (Integer)array[i];
				if (integer == null) {
					continue;
				}			
				
				buffer.append(integer.toString()).append('(');
				
				if (integer.intValue() > 0) {
					buffer.append("&#9679");
				}
				
				buffer.append(")");
			}
		}
			
}