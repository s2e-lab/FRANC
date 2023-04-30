import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID8{
	/**
	* 给一个数组，找出最大值并且返回。
	*/
	public static int findMaxNumber(int[] nums){
		return findMaxNumber(nums,0,nums.length-1);
	}
	public static int findMaxNumber(int[] nums,int left,int right){
		if (left>right) return Integer.MIN_VALUE;
		if (right==left+1) return max(nums,left);
		int mid=(left+right)/2;
		int maxNumber=max(nums,left,mid);
		int minNumber=max(nums,mid+1,right);
}
}