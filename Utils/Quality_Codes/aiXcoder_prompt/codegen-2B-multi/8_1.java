import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID8{
	/**
	* 给一个数组，找出最大值并且返回。
	*/
	public static int findMaxNumber(int[] nums){
		if(nums==null||nums.length==0){
			return Integer.MIN_VALUE;
		}
		int n=nums.length;
		int max=nums[0];
		for(int i=1; i<n; i++){
			int temp=nums[i];
			if(temp>max){
				max=temp;
			}
		}
		return max;
	}
	
	public static void main(String[] args){
}
}