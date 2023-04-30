import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID145{
	/**
	* 判断两个数组的内容是否相等 用于equals的比较
	*/
	public static boolean equals(Object[] array, Object[] other){
			if (array == other){//如果两个数组对象相同，则相等
			return true;
		}
		if (array == null || other == null){//如果其中一个为null，则不相等
			return false;
		}
		if (array.length != other.length){//如果长度不同，则不相等
			return false;
		}
		for (int i = 0; i < array.length; i++){//比较数组元素
			if (!Objects.equals(array[i], other[i])){//如果元素不相等，则不相等
				return false;
			}
		}
		return true;//数组相等
	}

	/**
	* 主方法
	*/
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		PrintStream out=System.out;

		int n=in.nextInt();
		int[] len=new int[n];//每个字符串的长度
		String[] ss=new String[n];//n个字符串
		for(int i=0;i<n;i++){
			ss[i]=in.next();
			len[i]=ss[i].length();
		}

		int[][] dp=new int[101][101];//dp[i][j]表示将第i个字符串和第j个字符串合并后的最小长度
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				dp[i][j]=Integer.MAX_VALUE;
			}
		}
		for(int i=0;i<n;i++){
			dp[i][i]=len[i];//合并一个字符串长度为该字符串的长度
		}

}
}