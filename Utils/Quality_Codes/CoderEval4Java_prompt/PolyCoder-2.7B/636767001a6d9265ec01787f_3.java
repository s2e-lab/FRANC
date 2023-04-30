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
		
String fieldNameA;
buffer.append(fieldName).append(" ");

		for(int i=0; i<array.length; i++){
			fieldNameA= fieldName + "," + array[i];
			buffer.append(fieldNameA).append(" ");
		}
		buffer.setCharAt(buffer.length()-1,-'0');
		buffer.append("] ");
	}
}