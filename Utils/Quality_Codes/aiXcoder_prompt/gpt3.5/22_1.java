import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID22{
	/**
	* Read the base64 encoded image data from a JPEG image.
	*/
	public static String readImageData(String filename){
			try{
	File file = new File(filename);
	FileInputStream fis = new FileInputStream(file);
	byte[] data = new byte[(int) file.length()];
	fis.read(data);
	fis.close();
	String encodedImage = Base64.getEncoder().encodeToString(data);
	return encodedImage;
}
catch(Exception e){
	System.out.println("Error: " + e.getMessage());
	return null;
}
	}

	/**
	* Calculate the score of a given name based on the alphabetical value of its letters.
	*/
	public static int nameScore(String name){
		int score = 0;
		for(int i=0; i<name.length(); i++){
			score += name.charAt(i) - 'A' + 1;
		}
		return score;
	}

	public static void main(String[] args){
		try{
			//read the file containing names
			File file = new File("names.txt");
			Scanner sc = new Scanner(file);
			String input = "";

			//read file contents as a single string
			while(sc.hasNextLine()){
				input += sc.nextLine();
			}
			sc.close();

			//remove quotes and split names into an array
			String[] names = input.replaceAll("\"","").split(",");

			//sort the array of names
			Arrays.sort(names);

			//calculate the total score of all the names
			long totalScore = 0;
			for(int i=0; i<names.length; i++){
				int score = nameScore(names[i]);
				totalScore += (i+1) * score;
			}

			//print final result
			System.out.println("Total score of all names: " + totalScore);
		}
		catch(Exception e){
			System.out.println("Error: " + e.getMessage());
		}
	}
}