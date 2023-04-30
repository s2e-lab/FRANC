import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID79{
	/**
	* Writes certain bytes from the specified byte array starting from an offset to this output stream.
	*/
	public static void write(byte[] b, int off, int len, OutputStream outputStream){
			try {
			outputStream.write(b, off, len);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	* Main function to read a text file and generate a unique identifier for each word.
	* @param args A string array containing the command line arguments.
	*/
	public static void main(String args[]) throws Exception{
		
		// Reading the text file		
		File file = new File("input.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		// HashMap to store words and their corresponding identifiers
		HashMap<String, String> wordIdMap = new HashMap<String, String>();
		
		// Generating unique identifier for each word
		String line;
		int wordCount = 0;
		while ((line = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(line, " .,;:-?!\"\'\n\t");
			while (st.hasMoreTokens()) {
				String word = st.nextToken().toLowerCase();
				String id = wordIdMap.get(word);
				if(id == null){
					id = BigInteger.valueOf(++wordCount).toString(Character.MAX_RADIX);
					wordIdMap.put(word, id);
				}
				write((word + ":" + id + "\n").getBytes(), 0, (word + ":" + id + "\n").length(), System.out);
			}
		}
		br.close();
	}
}