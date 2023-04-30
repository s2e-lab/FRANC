import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID8{
	/**
	* 给一个数组，找出最大值并且返回。
	*/
	public static int findMaxNumber(int[] nums){
		if(nums==null || nums.length==0)
			return -1;
		int max=nums[0];
		int index=0;
		for(int i=1; i<nums.length; i++){
			if(max<nums[i]){
				max=nums[i];
				index=i;
			}
		}
		return index+1;
    }   
	public static void main(String[] args) throws Exception{
}
}