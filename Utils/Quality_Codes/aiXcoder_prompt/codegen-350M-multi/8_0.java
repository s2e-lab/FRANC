import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID8{
	/**
	* 给一个数组，找出最大值并且返回。
	*/
	public static int findMaxNumber(int[] nums){
		int max = nums[0];
		for(int i=1;i<nums.length;i++){
			if(nums[i]>max){
				max = nums[i];
			}
		}
		return max;
	}
}
