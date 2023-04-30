import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID8{
	/**
	* 给一个数组，找出最大值并且返回。
	*/
	public static int findMaxNumber(int[] nums){
		int maxNumber=0;
		if(nums == null || nums.length == 0)return maxNumber;
		long sum=0;
		for(int i=0;i<nums.length;i++){
			sum+=nums[i];
			if(sum > maxNumber && i<nums.length-1){
				maxNumber=sum;
				i--;
			}
		}
		return (int)(sum+maxNumber);
	}
}