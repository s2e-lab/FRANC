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
	// Convert String to char array
char[] chars = s.toCharArray();

// Loop through each character and shift it down by two multiplied to two places
for (int i = 0; i < chars.length; i++) {
    char c = chars[i];
    if (Character.isLetter(c)) {
        // If character is a letter, add the shifted value to it
        int shiftedValue = (int) c + 2 * 2;
        if (Character.isLowerCase(c) && shiftedValue > (int) 'z') {
            // If character is lowercase and the shifted value exceeds 'z', rotate it back to 'a'
            shiftedValue = shiftedValue - 26;
        } else if (Character.isUpperCase(c) && shiftedValue > (int) 'Z') {
            // If character is uppercase and the shifted value exceeds 'Z', rotate it back to 'A'
            shiftedValue = shiftedValue - 26;
        }
        chars[i] = (char) shiftedValue;
    }
}

// Convert char array back to String
return new String(chars);
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