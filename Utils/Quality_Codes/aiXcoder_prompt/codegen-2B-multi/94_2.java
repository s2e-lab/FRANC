import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID94{
	/**
	* Choose a pseudo-random element from the specified array.
	*/
	public static int random(int[] array){
		return array.length == 0? 0 : array[(int)(Math.random()*Integer.MAX_VALUE) % array.length];
	}

    public String getMessage() {
        return "WOW";
    }
	
// CUT begin
	public static void main(String[] args){
		System.out.println("ID94 (250 Points)");
		System.out.println();
        long time;
        int[] answer;
        boolean errors = false;
        int[] largeArray = new int[1000];
}
}