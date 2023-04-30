import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID8{
	/**
	* 给一个数组，找出最大值并且返回。
	*/
	public static int findMaxNumber(int[] nums){
		if (nums.length == 0){
			return 0;
		}
		int result = Integer.MAX_VALUE;
		int maxValue = nums[0];
		for (int i = 1; i < nums.length; i++){
			if (nums[i] > maxValue){ maxValue = nums[i]; }
		}
		return maxValue;
	}
}

//找出最大值