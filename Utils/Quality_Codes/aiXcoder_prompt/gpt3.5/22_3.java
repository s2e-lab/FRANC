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
			//Open the file in binary mode and read the data into a byte array
			File file = new File(filename);
			FileInputStream fis = new FileInputStream(file);
			byte[] bytes = new byte[(int)file.length()];
			fis.read(bytes);
			fis.close();

			//Convert the byte array to Base64 encoded string
			String base64 = Base64.getEncoder().encodeToString(bytes);

			//Return the Base64 encoded string
			return base64;
		}catch(IOException e){
			System.out.println("Error reading image data: "+e.getMessage());
			return null;
		}
	}

	/**
	* Calculate the score of a given name.
	*/
	public static int calculateScore(String name){
		int score = 0;
		for(int i=0; i<name.length(); i++){
			score += (int)name.charAt(i) - 64; //A=1, B=2, C=3, ... Z=26
		}
		return score;
	}

	public static void main(String[] args){
		try{
			//Read the names from the input file and store them in an array
			File file = new File("names.txt");
			Scanner sc = new Scanner(file);
			String[] names = sc.next().split(",");
			sc.close();

			//Sort the array of names
			Arrays.sort(names);

			//Calculate the score of each name and add it to the total score
			int totalScore = 0;
			for(int i=0; i<names.length; i++){
				String name = names[i].replaceAll("\"", ""); //Remove quotes from the name
				int score = calculateScore(name);
				totalScore += score * (i+1); //Position of the name in the sorted array
			}

			//Print the total score
			System.out.println("Total score of all names: "+totalScore);

		}catch(FileNotFoundException e){
			System.out.println("Input file not found: "+e.getMessage());
		}
	}
}