import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID8{
	/**
	* 给一个数组，找出最大值并且返回。
	*/
	public static int findMaxNumber(int[] nums){
		int max=nums[0];
		int[] temp=new int[nums.length+2];

		for(int i=0;i<nums.length;i++){
			temp[i]=nums[i];
		}

		Arrays.sort(temp);
		return findMaxNumber(temp,0,nums.length-1);
		
	}
	public static int findMaxNumber(int[] nums,int start,int end){
		if(start>end){
			return nums[start];
		}
}
}