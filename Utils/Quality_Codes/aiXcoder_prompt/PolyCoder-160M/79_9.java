import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID79{
	/**
	* Writes certain bytes from the specified byte array starting from an offset to this output stream.
	*/
	public static void write(byte[] b, int off, int len, OutputStream outputStream){
			byte[] buf=null;
			byte w;
			int i;

			boolean nullterminated=false;

			long s=(long)len;
			double dd=Double.doubleToRawLongBits(s);
			int dd2=Integer.numberOfTrailingZeros(dd);
			if(len>=dd2)
				++s;
}
}