import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID8{
	/**
	* 给一个数组，找出最大值并且返回。
	*/
	public static int findMaxNumber(int[] nums){
		int max =Integer.MIN_VALUE;
		int maxIndex =0;
		for (int jj=0; jj <numsofArray(nums); jj++){
			if(jj >maxIndex){
				max =numsofArray(nums)[jj];
				maxIndex =jj;
			}
			
		}
		return max;			
		
	}
	
	/**
	* 退出从array中获取最有数的值。
	*/

}