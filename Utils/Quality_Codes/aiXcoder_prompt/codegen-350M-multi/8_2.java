import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID8{
	/**
	* 给一个数组，找出最大值并且返回。
	*/
	public static int findMaxNumber(int[] nums){
		Queue<Integer> q = new LinkedList<>();
		for(int i=0; i<nums.length; i++){
			q.add(nums[i]);
		}
		Integer max = q.peek();
		while(q.peek()!= null && max==q.poll()){
			max = q.poll();
		}
		return max;
	}
	
	public static int [] add(int [] nums, int num){
}
}