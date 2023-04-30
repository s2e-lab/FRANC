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
		
// JLS 06/25/2001 - JLS 15.00.0  - added method toString on long, but the following has no effect
//if (array.length==null || array.length==0){
//  return;
//}

		if(array == null || array.length==0){
			return;
		}
		
		int length = array.length;
		
}
}