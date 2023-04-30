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
	// First, we'll define the rotated alphabet as a string
        String rotatedAlphabet = "cdefghijklmnopqrstuvwxyzab";
        // Then, we'll create a StringBuilder object to hold the encrypted string
        StringBuilder encrypted = new StringBuilder();
        // We'll loop through each character in the input string
        for (int i = 0; i < s.length(); i++) {
            // Get the character at the current index
            char c = s.charAt(i);
            // Find its index in the regular alphabet
            int index = "abcdefghijklmnopqrstuvwxyz".indexOf(Character.toLowerCase(c));
            // If the character is not a letter, we'll just append it to the encrypted string as-is
            if (index == -1) {
                encrypted.append(c);
            // Otherwise, we'll use the rotated alphabet to find the corresponding encrypted letter
            } else {
                char encryptedChar = rotatedAlphabet.charAt((index + 2) % 26);
                // If the original character was uppercase, we'll make the encrypted character uppercase too
                if (Character.isUpperCase(c)) {
                    encryptedChar = Character.toUpperCase(encryptedChar);
                }
                // Append the encrypted character to the StringBuilder
                encrypted.append(encryptedChar);
            }
        }
        // Finally, we'll return the encrypted string
        return encrypted.toString();
    }
}