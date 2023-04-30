import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID165{
	/**
	* Decode base64 string to bytes
	*/
	public static byte[] base64decode(String base64string){
			return Base64.getDecoder().decode(base64string);
	}

	/**
	* Encode bytes to base64 string
	*/
	public static String base64encode(byte[] bytes){
		return Base64.getEncoder().encodeToString(bytes);
	}

	/**
	* Method to check if a number is prime or not
	*/
	public static boolean isPrime(int num){
		if(num < 2){
			return false;
		}
		for(int i=2; i*i<=num; i++){
			if(num%i == 0){
				return false;
			}
		}
		return true;
	}

	/**
	* Method to get the nth fibonacci number
	*/
	public static BigInteger fibonacci(int n){
		BigInteger a = BigInteger.valueOf(0);
		BigInteger b = BigInteger.valueOf(1);

		if(n == 0){
			return a;
		}else if(n == 1){
			return b;
		}

		BigInteger fib = BigInteger.valueOf(0);
		for(int i=2; i<=n; i++){
			fib = a.add(b);
			a = b;
			b = fib;
		}

		return fib;
	}

	/**
	* Method to calculate the factorial of a number
	*/
	public static BigInteger factorial(int num){
		BigInteger fact = BigInteger.valueOf(1);
		for(int i=2; i<=num; i++){
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		return fact;
	}

	/**
	* Method to check if a string is palindrome or not
	*/
	public static boolean isPalindrome(String str){
		int n = str.length();
		for(int i=0, j=n-1; i<=j; i++, j--){
			if(str.charAt(i) != str.charAt(j)){
				return false;
			}
		}
		return true;
	}

	/**
	* Method to reverse a string
	*/
	public static String reverse(String str){
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return sb.toString();
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Testing base64 encoder and decoder
        System.out.println("Enter a string to encode to base64:");
        String input = br.readLine();
        String encodedString = base64encode(input.getBytes());
        System.out.println("Base64 encoded string: " + encodedString);
}
}