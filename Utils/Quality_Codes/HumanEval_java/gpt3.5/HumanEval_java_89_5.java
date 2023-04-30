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
	// Code to encrypt the string using alphabet rotation
        int index = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    index = (int) c - 'A';
                    index = (index + 2 * 2) % 26;
                    result.append((char) ('A' + index));
                } else {
                    index = (int) c - 'a';
                    index = (index + 2 * 2) % 26;
                    result.append((char) ('a' + index));
                }
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {

        // test the function with different inputs
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

// Output:
// lm
// ewhjklnop
// kj
// ix
// jeiajeaijeiak
// lippsqcjvmirh
// hbdhpqrmpjylqmpyjlpmlyjrqpmqryjlpmqryjljygyjl
// e