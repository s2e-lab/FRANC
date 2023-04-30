import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID8{
	/**
	* 给一个数组，找出最大值并且返回。
	*/
	public static int findMaxNumber(int[] nums){
		int length=nums.length;
		if(length==0){
			return 0;
		}
		int res=nums[nums.length-1];
		for(int i=nums.length-2;i>=0;i--){
			if(nums[i]>res){
				res=nums[i];
			}
		}
		if(nums[0]==res){
				return 0;
		}
		return length-findMaxNumber(nums.length);
	}
}