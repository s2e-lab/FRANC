import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID145{
	/**
	* 判断两个数组的内容是否相等 用于equals的比较
	*/
	public static boolean equals(Object[] array, Object[] other){
			if (array == null || other == null || array.length != other.length) {
			return false;
		}
		for (int i = 0; i < array.length; i++) {
			if (!Objects.equals(array[i], other[i])) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(new File("input.txt"));
		PrintWriter pw=new PrintWriter(new FileWriter("output.txt"));
		
		//读入n
		int n=sc.nextInt();
		//读入n串数字
		int a[]=new int[n];
		for (int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		//检查是否为幸运数
		boolean isLucky=false;
		for (int i=0;i<n;i++){
			for (int j=i+1;j<n;j++){
				if (a[i]==a[j]) continue;
				for (int k=j+1;k<n;k++){
					if (a[i]+a[j]+a[k]==0){
						isLucky=true;
						break;
					}
				}
				if (isLucky) break;
			}
			if (isLucky) break;
		}
		
		//输出
		if (isLucky){
			pw.println("YES");
		}else{
			pw.println("NO");
		}
		
		sc.close();
		pw.close();
	}
}