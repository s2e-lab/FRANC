import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID8{
	/**
	* 给一个数组，找出最大值并且返回。
	*/
	public static int findMaxNumber(int[] nums){
		if(nums == null || nums.length == 0){
			return -1;
		}
		int max = nums[0];
		max = Math.max(nums[0], max);
		for(int i = 0; i < nums.length; i++){
			if(max < nums[i]){
				max = nums[i];
			}
		}
		return max;
	}

	//public static int findMaxNumber(int[] nums){
	//	if(nums == null ||
}