import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID145{
	/**
	* 判断两个数组的内容是否相等 用于equals的比较
	*/
	public static boolean equals(Object[] array, Object[] other){
			if (array == other) {
				return true;
			}
			if (array == null || other == null) {
				return false;
			}
			if (array.length != other.length) {
				return false;
			}
			for (int i = 0; i < array.length; i++) {
				if (!Objects.equals(array[i], other[i])) {
					return false;
				}
			}
			return true;
		}

	/**
	* 主方法
	*/
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		// 存储输入的数值
		int[] nums = new int[n];
		// 用于判断之前是否出现过相同的排列
		Set<Integer[]> set = new HashSet<Integer[]>();
		for (int i = 0; i < n; i++) {
			nums[i] = in.nextInt();
		}
		// 按字典序排序 
		Arrays.sort(nums);
		// 输出初始排列
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		// 对于每一次部分排列操作 
}
}