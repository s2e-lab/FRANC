import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID171{
	/**
	* 去掉浮点数多余的0
	*/
	public static String rvZeroAndDot(String s){
			if(s.indexOf(".") > 0){

	//去掉尾部的0
	s = s.replaceAll("0+?$", "");

	//去掉小数点后无用的零
	s = s.replaceAll("[.]$", "");

}

return s;
}


public static void main(String[] args){

Scanner sc = new Scanner(System.in);

while(sc.hasNext()){

	int n = sc.nextInt();

	//初始化字符串数组
	String[] str = new String[n];

	//读入字符串数组
	for(int i=0; i<n; i++){
		str[i] = rvZeroAndDot(sc.next());
	}

	//排序数组
	Arrays.sort(str);

	//输出排序后最后两个字符串拼接的结果
	System.out.println(str[n-1]+str[n-2]);
}

sc.close();
}
}