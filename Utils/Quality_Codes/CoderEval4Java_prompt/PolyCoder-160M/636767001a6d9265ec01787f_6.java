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
		 if(null == fieldDetail){
			  fieldDetail = new String[]{new String[]{"int"});
		 }
		fieldDetail = array;
		 if(array==null) {
			  array = null;
		 }
		String ret = "\""+(array==null? "" : ",\""+Arrays.toString(array)+\"\"+ fieldName+"\"" );
		buffer.append(ret);
		buffer.append(new String(fieldDetail));
	}
	/**
	 * <p>Append the detail of an array of integers to the <code>toString