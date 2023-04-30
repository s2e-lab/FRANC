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
	// The below code implements the required encryption logic 
        String encryptedStr = "";
        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if (Character.isLowerCase(currChar)) {
                int newChar = (int)((currChar - 'a' + 2 * 2) % 26);
                encryptedStr += (char)('a' + newChar);
            } else if (Character.isUpperCase(currChar)) {
                int newChar = (int)((currChar - 'A' + 2 * 2) % 26);
                encryptedStr += (char)('A' + newChar);
            }
        }
        return encryptedStr;
    }

    // Driver Code
    public static void main(String[] args) {
        String s1 = "hi";
        String s2 = "asdfghjkl";
        String s3 = "gf";
        String s4 = "et";
        String s5 = "faewfawefaewg";
        String s6 = "hellomyfriend";
        String s7 = "dxzdlmnilfuhmilufhlihufnmlimnufhlimnufhfucufh";
        String s8 = "a";
        
        // Test cases
        System.out.println(encrypt(s1)); // Should print "lm"
        System.out.println(encrypt(s2)); // Should print "ewhjklnop"
        System.out.println(encrypt(s3)); // Should print "kj"
        System.out.println(encrypt(s4)); // Should print "ix"
        System.out.println(encrypt(s5)); // Should print "jeiajeaijeiak"
        System.out.println(encrypt(s6)); // Should print "lippsqcjvmirh"
        System.out.println(encrypt(s7)); // Should print "hbdhpqrmpjylqmpyjlpmlyjrqpmqryjlpmqryjljygyjl"
        System.out.println(encrypt(s8)); // Should print "e"
    }
}