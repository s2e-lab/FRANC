import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ClassFileBuffer{
	/** 
	 * Clear and fill the buffer of this  {@code ClassFileBuffer} with thesupplied byte stream. The read pointer is reset to the start of the byte array.
	 */
	
	public void readFrom(final InputStream in) throws IOException {
		readFrom(in,new Serializable() {
		    public void write(OutputStream o) throws IOException {
		    }
	      });
	}
	
	
	public String getClassName(){
		final int classnameLen=super.size();
		final int len=classnameLen>16?16:classnameLen;
	    return new String(super.array(), 16,len);
	}
	public void readFrom(final InputStream in,final Serializable obj){
}
}