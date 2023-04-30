import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID23{
	/**
	* Returns the distance for the two given point
	*/
	public static float distance(float x0, float y0, float x1, float y1){
			return (float) Math.sqrt(Math.pow((x1-x0), 2) + Math.pow((y1-y0), 2));
}

/**
* Returns true if the given number is abundant
*/
public static boolean isAbundant(int n){
    int sum = 0;
    for(int i=1; i<=Math.sqrt(n); i++){
        if(n%i == 0){
            if(n/i == i){
                sum += i;
            }else{
                sum += i;
                sum += n/i;
            }
        }
    }
    return sum > 2*n;
}


public static void main(String[] args){
    ArrayList<Integer> abundantNums = new ArrayList<Integer>();
    for(int i=1; i<=28123; i++){
        if(isAbundant(i)){
            abundantNums.add(i);
        }
    }

    HashSet<Integer> sumAbundant = new HashSet<Integer>();
    for(int i=0; i<abundantNums.size(); i++){
        for(int j=0; j<abundantNums.size(); j++){
            sumAbundant.add(abundantNums.get(i)+abundantNums.get(j));
        }
    }

    long sum = 0;
    for(int i=1; i<=28123; i++){
        if(!sumAbundant.contains(i)){
            sum += i;
        }
    }
    System.out.println(sum);
}
}