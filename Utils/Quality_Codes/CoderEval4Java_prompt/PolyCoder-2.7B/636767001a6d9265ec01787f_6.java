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
			for(int anInt1:array){
					buffer.append(fieldName);
					buffer.append(" = ");
					buffer.append(Integer.toString(anInt1));
			  }
	}
	
			 StringBuffer buf=new StringBuffer();
			 //first append the array size
}