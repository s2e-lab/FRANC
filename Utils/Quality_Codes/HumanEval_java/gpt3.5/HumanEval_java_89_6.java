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
	String alphabet = "abcdefghijklmnopqrstuvwxyz";

// Rotate the alphabet by two multiplied with two places
int shift = 2 * 2;
String rotatedAlphabet = alphabet.substring(shift) + alphabet.substring(0, shift);

String result = "";

// Iterate through each character in the string s and encrypt it
for (int i = 0; i < s.length(); i++) {
    char c = s.charAt(i);
    int index = alphabet.indexOf(c);
    if (index == -1) {
        // If the character is not in the alphabet, simply append it to the result
        result += c;
    } else {
        // Encrypt the character by finding its index in the rotated alphabet
        // and getting the corresponding character at the same index in the original alphabet
        char encryptedChar = rotatedAlphabet.charAt(index);
        result += encryptedChar;
    }
}
return result;
}
}