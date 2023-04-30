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
			if (null!= array)			
				buffer.append(',');

        if (array.length==0)
            return ;
			// String s = array[0];
			// for (int d = 0; d < array.length; d++) {
			// if (array[d] == '\n')
			// buffer.append(' ');
			// buffer.append(s);
			// }
}
}