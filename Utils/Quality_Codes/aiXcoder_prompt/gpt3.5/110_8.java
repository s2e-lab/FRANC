import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID110{
	/**
	* Converts the string argument into a float value.
	*/
	public static float parseFloat(String floatStr){
			return Float.parseFloat(floatStr);
	}
	
	/**
	* Finds the maximum value in a given array of integers.
	*/
	public static int findMax(int[] arr){
		if(arr.length == 0){
			return -1;
		}
		
		int max = arr[0];
		for (int i = 1; i < arr.length; i++){
			if (arr[i] > max){
				max = arr[i];
			}
		}
		return max;
	}
	
	/**
	* Multiplies a given floating point number by 2.
	*/
	public static float multiplyByTwo(float num){
		return num * 2;
	}
	
	/**
	* Generates a random BigInteger between two given BigInteger values (inclusive).
	*/
	public static BigInteger generateRandomBigInt(BigInteger a, BigInteger b){
		BigInteger diff = b.subtract(a);
		Random rnd = new Random();
		BigInteger randNum = new BigInteger(diff.bitLength(), rnd);
		if (randNum.compareTo(diff) >= 0){
			randNum = randNum.mod(diff).add(a);
		}
		else{
			randNum = randNum.add(a);
		}
		return randNum;
	}
	
	/**
	* Reads a text file and returns its contents as a String.
	*/
	public static String readFile(String filename){
		String contents = "";
		try{
			File file = new File(filename);
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()){
				contents += sc.nextLine() + "\n";
			}
			sc.close();
		} catch (Exception e){
			System.out.println("Error: " + e.getMessage());
		}
		return contents;
	}
}