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
	// Initialize variables to keep track of the shifted alphabet
        String initialAlphabets = "abcdefghijklmnopqrstuvwxyz";
        String shiftedAlphabets = "cdefghijklmnopqrstuvwxyzab";

        // Initialize a StringBuilder to hold the encrypted string
        StringBuilder encryptedString = new StringBuilder();
        
        // Loop through each character in the original string
        for (int i = 0; i < s.length(); i++) {
            // Get the index of the current character in the initial alphabets string
            int index = initialAlphabets.indexOf(s.charAt(i));
            // If the current character is not a letter, add it to the encrypted string unmodified
            if (index == -1) {
                encryptedString.append(s.charAt(i));
            } else {
                // Otherwise, add the shifted character to the encrypted string
                encryptedString.append(shiftedAlphabets.charAt(index));
            }
        }

        // Return the encrypted string
        return encryptedString.toString();
    }

    public static void main(String[] args) {
        System.out.println(encrypt("hi"));
        System.out.println(encrypt("asdfghjkl"));
        System.out.println(encrypt("gf"));
        System.out.println(encrypt("et"));
        System.out.println(encrypt("faewfawefaewg"));
        System.out.println(encrypt("hellomyfriend"));
        System.out.println(encrypt("dxzdlmnilfuhmilufhlihufnmlimnufhlimnufhfucufh"));
        System.out.println(encrypt("a"));
    }
}