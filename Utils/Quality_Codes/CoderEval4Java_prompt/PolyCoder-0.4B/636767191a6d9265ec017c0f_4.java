import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ByteVector{
	/** 
	 * Enlarges this byte vector so that it can receive 'size' more bytes.
	 * @param size number of additional bytes that this byte vector should be able to receive.
	 */
	
	private void enlarge(final int size){
		 if(size > Integer.MAX_VALUE)
			System.err.println("En large");
		else
			this.size += size;
	}
	
	public void appendInt(int v){
		 byte vInt = (byte) (v & 0x7F);
		 enlarge(8);
		 this.data[this.size] = vInt;
		 this.size += 1;
	}
	
	public BigInteger getBigInteger(){
		 return BigInteger.valueOf(this.data);
	}	
		
}