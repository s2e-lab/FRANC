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
    	return true; // if no exception then it is an integer
	} catch(Exception e){
    	return false; // if exception occurs then it is not an integer
	}
}

	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		String numberString = in.nextLine();
		if(isInteger(numberString)){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}

	}
}