import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID32{
	/**
	* Returns the minimum value in an array.
	*/
	public static int min(int[] array){
		
for(int i = 0;i < array.length;i++){
			if(array[i]<array[i])
				return array[i];
		
}
		
return array[0];
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int tand = 0;
		int lmax = min(new int[0]);
		while(in.hasNext()){
			tand += in.nextInt();
		}
}
}