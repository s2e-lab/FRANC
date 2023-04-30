import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID176{
	/**
	* Returns true if the bit at the given position is 1 and false otherwise.
	*/
	public static boolean getBinaryState(int targetInteger, int position){
		// Assert.assertTargetIntegerIsPrime(targetInteger);
		int binary = 0x00;
		for(int i=0; i<position; i++){
			if((targetInteger&(1<<(position-i-1))) > 0)
				binary |= 1 << i;
			else
				binary &= ~(1<<i);
		//	Assert.assert((targetInteger & (1 << i)) > 0);
		}

		return (binary & (1 << position)) > 0;
	}


}