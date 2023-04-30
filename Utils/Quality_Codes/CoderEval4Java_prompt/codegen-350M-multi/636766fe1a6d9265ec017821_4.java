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
		buffer.append(fieldName).append('(');
		for(int i=0;i<array.length;i++){
				appendDetail(buffer,i,array[i]);
		}
		buffer.append(')');
	}
	
	protected void appendDetail(StringBuffer buffer,int arrayPos,byte object) {
			buffer.append(object);
			for(int i=arrayPos;i<array.length;i++){
					buffer.append(array[i]);
				}
		}

}