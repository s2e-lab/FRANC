import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID8{
	/**
	* 给一个数组，找出最大值并且返回。
	*/
	public static int findMaxNumber(int[] nums){
		Arrays.sort(nums);
		int size = nums.length;
		if(size > 0){
			int max = nums[size - 1];
			for(int i = size - 2; i >= 0; i--){
				if(nums[i] > max){
					max = nums[i];
				}
			}
			return max;
		}else{
			return 0;
		}
	}

	public static void main(String[] args){
}
}