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
		if (array == null) return;
		int fieldSize =0;
		for (byte curr : array){
			if (curr==0)
			{
				buffer.append('\n');
				fieldSize += fieldName.length();
			}
			else
			{
				buffer.append("\t");
				fieldSize +=2;
				buffer.append( fieldName.concat(" : " +Integer.toString((int)curr)));
			}
		}
		this.recordFieldSize(buffer,fieldSize);

}
}