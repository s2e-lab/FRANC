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
        String imageData = Base64.getEncoder().encodeToString(data);
        return imageData;
    }
    catch(Exception e){
        System.out.println(e);
    }
    return "";
}

	/**
	* Calculate the score of a name based on the alphabetical order of its letters.
	*/
	public static int calculateNameScore(String name){
	    int score = 0;
	    for(int i=0;i<name.length();i++){
	        char c = name.charAt(i);
	        score += c - 'A' + 1;
	    }
	    return score;
	}

	/**
	* Read a file containing a list of names, sort them in alphabetical order and calculate their scores.
	*/
	public static void calculateScores(){
	    //Read the file
	    String filename = "names.txt";
	    String namesCsv = "";
	    try{
	        File file = new File(filename);
	        FileInputStream fis = new FileInputStream(file);
	        byte[] data = new byte[(int) file.length()];
	        fis.read(data);
	        fis.close();
	        namesCsv = new String(data, "UTF-8");
	    }
	    catch(Exception e){
	        System.out.println(e);
	    }
	    
	    //Split the CSV string into an array of names
	    String[] names = namesCsv.split(",");
	    Arrays.sort(names);
	    
	    //Calculate the score of each name and add it to the total score
	    int totalScore = 0;
	    for(int i=0;i<names.length;i++){
	        String name = names[i].replaceAll("\"", "");
	        int score = calculateNameScore(name);
	        int rank = i+1;
	        totalScore += score*rank;
	    }
	    System.out.println("Total score: "+totalScore);
	}

	/**
	* Main function to run the program
	*/
	public static void main(String[] args) {
	   calculateScores();
	}
}