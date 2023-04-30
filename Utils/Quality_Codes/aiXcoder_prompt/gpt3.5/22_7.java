import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID22{
	/**
	* Read the base64 encoded image data from a JPEG image.
	*/
	public static String readImageData(String filename){
			try {
			File file = new File(filename);
			FileInputStream fis = new FileInputStream(file);
			byte[] data = new byte[(int) file.length()];
			fis.read(data);
			fis.close();
			return Base64.getEncoder().encodeToString(data);
		} catch (IOException e) {
			System.out.println("Error reading image data from file: " + e.getMessage());
			return null;
		}
	}

	/**
	* Calculate the name score for a given name.
	*/
	public static int calculateNameScore(String name){
		int score = 0;
		for(int i=0;i<name.length();i++){
			score += ((int) name.charAt(i))-64; // A is 65 in ASCII, so subtract 64 to get score
		}
		return score;
	}

	public static void main(String[] args){

		String filePath = "p022_names.txt";
		File file = new File(filePath);
		List<String> names = new ArrayList<String>();

		// Read the names from the file
		try {
			Scanner scanner = new Scanner(file);
			scanner.useDelimiter(",");
			while(scanner.hasNext()) {
				String name = scanner.next();
				names.add(name.substring(1, name.length()-1)); // Remove quotes from beginning and end of name
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
			return;
		}

		// Sort the names alphabetically
		Collections.sort(names);

		// Calculate the total name scores
		int totalScore = 0;
		for(int i=0;i<names.size();i++){
			String name = names.get(i);
			int score = calculateNameScore(name);
			totalScore += score*(i+1); // Multiply score by position in sorted list
		}

		System.out.println("Total name score: " + totalScore);
	}
}