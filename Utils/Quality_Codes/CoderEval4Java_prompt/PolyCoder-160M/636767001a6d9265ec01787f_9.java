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
		 String num;
		 
		 if (isArray())
			num = array[0];
		 else
			num = array[0];
			
		 int total = 0;
			
		 for(int i=0 ; i<num.length() ; i++){
			int val = numValue(num);
			if (val > 0)
				array[total++]=num.substring(i, total);			
		 }
			
		 // if it exceeds the max value for the result value this is the
		 // exception because it is an empty array.
}
}