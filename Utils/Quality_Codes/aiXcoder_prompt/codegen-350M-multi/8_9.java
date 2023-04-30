import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID8{
	/**
	* 给一个数组，找出最大值并且返回。
	*/
	public static int findMaxNumber(int[] nums){
		if(nums==null){
			return 0;
		}
		
		for(int i=0;i<nums.length;i++){
			if(nums[i]>nums.length-1 || nums[i]==nums.length-1){
				return -1;
			}
		}
		
		return 0;
	}
}