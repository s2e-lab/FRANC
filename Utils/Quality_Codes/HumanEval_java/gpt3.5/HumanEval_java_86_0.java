import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class AntiShuffle {
    /**
     * * Write a function that takes a string and returns an ordered version of it.
     * Ordered version of string, is a string where all words (separated by space)
     * are replaced by a new word where all the characters arranged in
     * ascending order based on ascii value.
     * Note: You should keep the order of words and blank spaces in the sentence.

     * For example:
     * anti_shuffle('Hi') returns 'Hi'
     * anti_shuffle('hello') returns 'ehllo'
     * anti_shuffle('Hello World!!!') returns 'Hello !!!Wdlor'
     *
     * > antiShuffle("Hi")
     * "Hi"
     * > antiShuffle("hello")
     * "ehllo"
     * > antiShuffle("number")
     * "bemnru"
     * > antiShuffle("abcd")
     * "abcd"
     * > antiShuffle("Hello World!!!")
     * "Hello !!!Wdlor"
     * > antiShuffle("")
     * ""
     * > antiShuffle("Hi. My name is Mister Robot. How are you?")
     * ".Hi My aemn is Meirst .Rboot How aer ?ouy"
     */
    public static String antiShuffle(String s) {
	//Convert the string to a character array
char[] ch_arr = s.toCharArray();

//Create an empty string to store the ordered version
String ordered_str = "";

//Iterate over the character array and split the words based on spaces
for(int i=0; i < ch_arr.length; i++){
    //Create a temporary string to store the characters of each word
    String temp_str = "";
    
    //If the character is a space, add it to the ordered string and continue to the next character
    if(ch_arr[i] == ' '){
        ordered_str += ' ';
        continue;
    }
    
    //Keep adding the characters to the temporary string until a space is encountered
    while(i < ch_arr.length && ch_arr[i] != ' '){
        temp_str += ch_arr[i];
        i++;
    }
    
    //Convert the string to a character array and sort it
    char[] temp_arr = temp_str.toCharArray();
    Arrays.sort(temp_arr);
    
    //Convert the sorted character array back to a string and add it to the ordered string
    String sorted_str = new String(temp_arr);
    ordered_str += sorted_str;
    i--;
}

//Return the ordered string
return ordered_str;
} 
}

//test cases