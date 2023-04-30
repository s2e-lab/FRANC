import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID178{
	/**
	* Handles comparison between version numbers (the right way(TM))，bigger return 1 ，smaller return -1 and equals return 0. Examples of version strings: 1.6.7, 1.2_b10
	*/
	public static int versionCompare(String v1, String v2){
			// Splitting version numbers by dot and underscore characters
	String[] version1 = v1.split("[._]");
	String[] version2 = v2.split("[._]");

	// Getting the length of the longest version number
	int maxLength = Math.max(version1.length, version2.length);

	// Looping through each position of the version numbers
	for (int i = 0; i < maxLength; i++) {
		// Converting the current version number to integer (or 0 if it doesn't exist)
		int one = i < version1.length ? Integer.parseInt(version1[i]) : 0;
		int two = i < version2.length ? Integer.parseInt(version2[i]) : 0;

		// Comparing the current version number
		if (one < two) {
			return -1;
		} else if (one > two) {
			return 1;
		}
	}

	// If all version numbers are equal, return 0
	return 0;
}

public static void main (String[] args) throws java.lang.Exception{
	Scanner scanner = new Scanner(System.in);
	String version1 = scanner.nextLine();
	String version2 = scanner.nextLine();

	System.out.println(versionCompare(version1, version2));
	scanner.close();
}
}