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
    } catch (NumberFormatException e){
        return false;
    }
}

/**
 * 判断一个字符串是否为质数
 */
public static boolean isPrime(String numberString){
    if(!isInteger(numberString)){
        return false;
    }
    int number = Integer.parseInt(numberString);
    if(number < 2){
        return false;
    }
    for(int i=2; i*i<=number; i++){
        if(number % i == 0){
            return false;
        }
    }
    return true;
}

public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    while(input != null && input.length() > 0 ){
        if(isPrime(input)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        input = br.readLine();
    }
   }
}