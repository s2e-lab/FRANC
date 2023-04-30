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
		outputStream.write(b, off, len);
		outputStream.flush();
	}catch(IOException e){
		e.printStackTrace();
	}
}

/**
* Reads the entire content of a file into a byte array.
*/
public static byte[] readAllBytes(File file){
	try{
		return Files.readAllBytes(file.toPath());
	}catch(IOException e){
		e.printStackTrace();
		return null;
	}
}

/**
* Converts a byte array into a hexadecimal string representation.
*/
public static String bytesToHex(byte[] bytes){
	StringBuilder sb = new StringBuilder();
	for (byte b : bytes) {
		sb.append(String.format("%02X", b));
	}
	return sb.toString();
}

/**
* Finds the shortest possible secret passcode for a given list of trios.
*/
public static String findShortestPasscode(List<String> trios){
	Set<Character> digits = new HashSet<>();
	Map<Integer, Set<Character>> before = new HashMap<>();
	Map<Integer, Set<Character>> after = new HashMap<>();
	
	// build set of all digits and before/after maps
	for(String trio : trios){
		char[] chars = trio.toCharArray();
		for(int i=0; i<3; i++){
			char c = chars[i];
			digits.add(c);
			if(!before.containsKey((int)c)) before.put((int)c, new HashSet<Character>());
			if(!after.containsKey((int)c)) after.put((int)c, new HashSet<Character>());
			if(i > 0) before.get((int)c).add(chars[i-1]);
			if(i < 2) after.get((int)c).add(chars[i+1]);
		}
	}
	
	// find all possible starting digits
	Set<Character> startingDigits = new HashSet<>(digits);
	for(char c : digits){
		if(before.containsKey((int)c) && !before.get((int)c).isEmpty()){
			startingDigits.remove(c);
		}
	}
	
	// build adjacency list for the graph of digits and compute shortest path
	Map<Character, List<Character>> adjacencyList = new HashMap<>();
	for(char c : digits){
		List<Character> neighbors = new ArrayList<>();
		if(after.containsKey((int)c)){
			for(char neighbor : after.get((int)c)){
				neighbors.add(neighbor);
			}
		}
		adjacencyList.put(c, neighbors);
	}
	String shortestPasscode = null;
}
}