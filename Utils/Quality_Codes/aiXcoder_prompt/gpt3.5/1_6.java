import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID1{
	/**
	* Creates a padding string of a certain length
	*/
	public static String createPadding(int length, char padChar){
			String padding = "";
		for(int i = 0; i < length; i++){
			padding += padChar;
		}
		return padding;
	}

	/**
	* Generates a unique ID based on current system time and a random number
	*/
	public static String generateID(){
		String id = "";
		
		long currentTime = System.currentTimeMillis();
		id += currentTime;
		
		Random rand = new Random();
		int randomNum = rand.nextInt(100000);
		id += randomNum;
		
		return id;
	}

	public static void main(String args[]){
		String padded = createPadding(10, '0');
		System.out.println("Padded string: " + padded);
		
		String id = generateID();
		System.out.println("Generated ID: " + id);
	}
}