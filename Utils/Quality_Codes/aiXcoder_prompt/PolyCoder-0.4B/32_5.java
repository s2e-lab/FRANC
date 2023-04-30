import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID32{
	/**
	* Returns the minimum value in an array.
	*/
	public static int min(int[] array){
			int min = array[0];
			for (int i=1; i< array.length; i++)
				if(array[i]<min)
					min= array[i];
		return min;
	}
	public int min(){
		assert(array==null);
		return array[0];
	}
	/**@param value The initial value of this variable. */
	public static void setId(int value){
		ID32 id= id(value);
		id.setId();
	}
	
}