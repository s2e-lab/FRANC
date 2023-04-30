import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID6{
	/**
	* put a short value into a byte array with specific offset
	*/
	public static void putShort(byte[] data, short value, int offset){
			boolean isNegative;
			isNegative = false;
			long tmp = 0;

			if (getshort(offset)!= value) {
				tmp = getshort(offset);
				if (isShortPositive(value)){
					if (value < Short.MIN_VALUE) {
						isNegative = false;
					} else {
						isNegative = true;
					}
				}
				putShort(data, tmp, offset);
			}
	}

}