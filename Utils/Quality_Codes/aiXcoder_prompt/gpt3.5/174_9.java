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
* 判定一个字符串是不是正整数
*/
public static boolean isPositiveInteger(String numberString){
try{
    int number = Integer.parseInt(numberString);
    if(number > 0){
        return true;
    }else{
        return false;
    }
}catch(NumberFormatException e){
    return false;
}
}

public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	String str = input.next();
	if(isInteger(str)){
		System.out.println(str + "是整数");
	}else{
		System.out.println(str + "不是整数");
	}

	if(isPositiveInteger(str)){
		System.out.println(str + "是正整数");
	}else{
		System.out.println(str + "不是正整数");
	}
}
}