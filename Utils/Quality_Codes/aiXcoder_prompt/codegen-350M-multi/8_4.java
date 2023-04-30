import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID8{
	/**
	* 给一个数组，找出最大值并且返回。
	*/
	public static int findMaxNumber(int[] nums){
		int maxNumber = (nums[0] & 0xFF);
		int length = 1;
		for(int i = 1; i < length; i++){
			if(maxNumber < nums[i] & ((i+1) == length))
				maxNumber = nums[i];
			length = i + 1;
		}
		return maxNumber;
	}

	public static void main(String[] args){
		int[] a = {4,6,3,8,5,7,20};
}
}