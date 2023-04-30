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
			InputStream inputStream = new FileInputStream(file);
			byte[] data = new byte[(int)file.length()];
			inputStream.read(data);
			inputStream.close();
			String imageData = Base64.getEncoder().encodeToString(data);
			return imageData;
		}catch(IOException e){
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	* Calculate the sum of the character values in a String.
	*/
	public static int calculateNameScore(String name){
		int score = 0;
		for(int i=0; i<name.length(); i++){
			score += name.charAt(i)-'A'+1;
		}
		return score;
	}
	
	/**
	* Read the names file and sort the names alphabetically.
	* Calculate the score for each name and return the sum of all scores.
	*/
	public static int calculateTotalNameScore(String filename){
		try{
			File file = new File(filename);
			Scanner scanner = new Scanner(file);
			String data = scanner.useDelimiter("\\A").next();
			data = data.replaceAll("\"", "");
			String[] names = data.split(",");
			Arrays.sort(names);
			scanner.close();
			int totalScore = 0;
			for(int i=0; i<names.length; i++){
				String name = names[i];
				int score = calculateNameScore(name);
				totalScore += score*(i+1);
			}
			return totalScore;
		}catch(IOException e){
			e.printStackTrace();
			return -1;
		}
	}
	
	public static void main(String[] args){
		String filename = "p022_names.txt";
		int totalScore = calculateTotalNameScore(filename);
		System.out.println(totalScore);
	}
}