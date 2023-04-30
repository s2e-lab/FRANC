import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID174{
	/**
	* 判定一个字符串是不是整数
	*/
	public static boolean isInteger(String numberString){
			try{
				Integer.parseInt(numberString);
				return true;
			}catch(NumberFormatException e){
				return false;
			}
		}
		
		/**
		*判断一个字符串是不是双精度浮点数
		*/
		public static boolean isDouble(String numberString){
			try{
				Double.parseDouble(numberString);
				return true;
			}catch(NumberFormatException e){
				return false;
			}
		}
		
		/**
		* 获取一个字符串中数字字符的个数
		*/
		public static int countNumber(String str){
			int count = 0;
			for(int i=0;i<str.length();i++){
				if(Character.isDigit(str.charAt(i))){
					count++;
				}
			}
			return count;
		}
		
		/**
		* 计算平均数
		*/
		public static double getAvg(int[] nums){
			int sum = 0;
			for(int i=0;i<nums.length;i++){
				sum += nums[i];
			}
			return (double)sum/(double)nums.length;
		}
		
		/**
		* 计算方差
		*/
		public static double getVariance(int[] nums){
			double avg = getAvg(nums);
			double sum = 0;
			for(int i=0;i<nums.length;i++){
				sum += Math.pow(nums[i]-avg,2);
			}
			return sum/(double)nums.length;
		}
		
		/**
		* 计算标准差
		*/
		public static double getStandardDeviation(int[] nums){
			return Math.sqrt(getVariance(nums));
		}
		
		/**
		* 计算中位数
		*/
		public static double getMedian(int[] nums){
			Arrays.sort(nums);
			int len = nums.length;
			if(len%2==0){
				return (double)(nums[len/2-1]+nums[len/2])/2.0;
			}else{
				return (double)nums[(len-1)/2];
			}
		}
		
		/**
		* 主函数
		*/
		public static void main (String[] args) throws java.lang.Exception
		{
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
}
}