import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID118{
	/**
	* 返回不小于输入值value的最小整数
	*/
	public static int floor(double val){
			return (int) Math.floor(val);
	}

	/**
	* 返回不大于输入值value的最大整数
	*/
	public static int ceil(double val){
		return (int) Math.ceil(val);
	}

	/**
	* 返回输入的整数数组中的最大值
	*/
	public static int getMax(int[] arr){
		int max = arr[0];
		for(int i = 1; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		return max;
	}

	/**
	* 返回输入的整数数组中的最小值
	*/
	public static int getMin(int[] arr){
		int min = arr[0];
		for(int i = 1; i < arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		return min;
	}

	/**
	* 返回输入的整数数组的累加和
	*/
	public static int getSum(int[] arr){
		int sum = 0;
		for(int i = 0; i < arr.length; i++){
			sum += arr[i];
		}
		return sum;
	}

	/**
	* 对输入的整数数组进行冒泡排序
	*/
	public static void bubbleSort(int[] arr){
		for(int i = 0; i < arr.length - 1; i++){
			for(int j = 0; j < arr.length - i - 1; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}