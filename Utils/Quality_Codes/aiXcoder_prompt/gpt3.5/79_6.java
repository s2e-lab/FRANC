import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID79{
	/**
	* Writes certain bytes from the specified byte array starting from an offset to this output stream.
	*/
	public static void write(byte[] b, int off, int len, OutputStream outputStream){
			try{
	outputStream.write(b,off,len);
}catch(IOException e){
	System.out.println("Error while writing to output stream: "+e.getMessage());
}
}

	/**
	* Generates a random number within the specified range.
	*/
	public static int generateRandomNumber(int min, int max){
	Random rand = new Random();
	return rand.nextInt((max - min) + 1) + min;
	}
	
	public static void main(String[] args) throws Exception{
		// Read input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the length of byte array: ");
		int length = scanner.nextInt();
		System.out.print("Enter the minimum value of random number: ");
		int min = scanner.nextInt();
		System.out.print("Enter the maximum value of random number: ");
		int max = scanner.nextInt();
		
		// Generate byte array with random numbers
		byte[] byteArray = new byte[length];
		for(int i=0; i<length; i++){
			byteArray[i] = (byte) generateRandomNumber(min, max);
		}
		
		// Write byte array to output stream
		try(FileOutputStream fos = new FileOutputStream("output.bin")){
			write(byteArray, 0, byteArray.length, fos);
		}catch(IOException e){
			System.out.println("Error while writing byte array to file: "+e.getMessage());
		}
		
		System.out.println("Byte array of length "+length+" generated and written to 'output.bin' file.");
	}
}