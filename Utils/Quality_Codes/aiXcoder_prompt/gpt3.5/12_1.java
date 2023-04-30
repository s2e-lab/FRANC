import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID12{
	/**
	* Retrieves the value by specified int index of the given List.
	*/
	public static String getValue(List<String> list, int index){
			if(index>=0 && index<list.size()){
			return list.get(index);
		}
		else{
			return null;
		}
	}

	/**
	* Calculates the number of divisors of a given integer.
	*/
	public static int getDivisorCount(int n){
		int count = 0;
		for(int i=1; i<=Math.sqrt(n); i++){
			if(n%i == 0){
				if(n/i == i){
					count++;
				}
				else{
					count += 2;
				}
			}
		}
		return count;
	}

	/**
	* Finds the first triangle number that has more than n divisors.
	*/
	public static int getFirstTriangleNumberWithNDivisors(int n){
		int i = 1;
		int triangleNumber = 1;
		while(getDivisorCount(triangleNumber)<=n){
			i++;
			triangleNumber += i;
		}
		return triangleNumber;
	}

	public static void main(String[] args){
		List<String> inputs = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String line = sc.nextLine();
			if(line.isEmpty()){
				break;
			}
			inputs.add(line.trim());
		}

		int n = Integer.parseInt(getValue(inputs, 0));

		System.out.println(getFirstTriangleNumberWithNDivisors(n));
	}
}