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
	String encryptedString = "";
    int moveBy = 2 * 2; // Shift down by two multiplied to two places.
    for(int i = 0; i < s.length(); i++) { // Iterate through each character in the string.
        char curr = s.charAt(i);
        if(Character.isUpperCase(curr)) { // If character is uppercase.
            encryptedString += (char)(((curr - 'A' + moveBy) % 26) + 'A'); //Encrypt uppercase characters with the shifted value and add it to the encrypted string.
        } else { // If character is lowercase.
            encryptedString += (char)(((curr - 'a' + moveBy) % 26) + 'a'); //Encrypt lowercase characters with the shifted value and add it to the encrypted string.
        }
    }
    return encryptedString; // Returning the encrypted string.
}
}