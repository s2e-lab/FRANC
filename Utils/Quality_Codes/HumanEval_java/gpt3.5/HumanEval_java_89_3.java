import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Encrypt {
    /**
     * Create a function encrypt that takes a string as an argument and
     * returns a string encrypted with the alphabet being rotated. 
     * The alphabet should be rotated in a manner such that the letters 
     * shift down by two multiplied to two places.
     * For example:
     * encrypt('hi') returns 'lm'
     * encrypt('asdfghjkl') returns 'ewhjklnop'
     * encrypt('gf') returns 'kj'
     * encrypt('et') returns 'ix'
     *
     * > encrypt("hi")
     * "lm"
     * > encrypt("asdfghjkl")
     * "ewhjklnop"
     * > encrypt("gf")
     * "kj"
     * > encrypt("et")
     * "ix"
     * > encrypt("faewfawefaewg")
     * "jeiajeaijeiak"
     * > encrypt("hellomyfriend")
     * "lippsqcjvmirh"
     * > encrypt("dxzdlmnilfuhmilufhlihufnmlimnufhlimnufhfucufh")
     * "hbdhpqrmpjylqmpyjlpmlyjrqpmqryjlpmqryjljygyjl"
     * > encrypt("a")
     * "e"
     */
    public static String encrypt(String s) {
	String result = "";
// Define a string containing the original alphabet
String alphabet = "abcdefghijklmnopqrstuvwxyz";

// Rotate the alphabet by shifting each letter down by 2*2 places
String rotatedAlphabet = alphabet.substring(8) + alphabet.substring(0, 8);
rotatedAlphabet = rotatedAlphabet.substring(10) + rotatedAlphabet.substring(0, 10);

// Loop through each letter in the input string
for (int i = 0; i < s.length(); i++) {
    // Find the index of the current letter in the original alphabet
    int index = alphabet.indexOf(s.charAt(i));
    // Add the corresponding letter from the rotated alphabet to the result string
    result += rotatedAlphabet.charAt(index);
}

return result;
}
}