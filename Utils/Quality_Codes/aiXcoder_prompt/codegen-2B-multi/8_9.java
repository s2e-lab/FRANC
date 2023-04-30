import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID8{
	/**
	* 给一个数组，找出最大值并且返回。
	*/
	public static int findMaxNumber(int[] nums){
		int maxValue = nums[0];
		for(int i = 1; i < nums.length; i++){
            if(maxValue < nums[i]){
                maxValue = nums[i];
            }
		}
		return maxValue;
	}

	public static void main(String[] args) {
        int[] a = new int[]{1,5,8,0,-3,-1,0,5,7};
		int max = findMaxNumber(a);
}
}