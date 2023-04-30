import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CorrectBracketing {
    /**
     * brackets is a string of "<" and ">".
     * return True if every opening bracket has a corresponding closing bracket.

     * >>> correct_bracketing("<")
     * False
     * >>> correct_bracketing("<>")
     * True
     * >>> correct_bracketing("<<><>>")
     * True
     * >>> correct_bracketing("><<>")
     * False
     *
     * > correctBracketing("<>")
     * true
     * > correctBracketing("<<><>>")
     * true
     * > correctBracketing("<><><<><>><>")
     * true
     * > correctBracketing("<><><<<><><>><>><<><><<>>>")
     * true
     * > correctBracketing("<<<><>>>>")
     * false
     * > correctBracketing("><<>")
     * false
     * > correctBracketing("<")
     * false
     * > correctBracketing("<<<<")
     * false
     * > correctBracketing(">")
     * false
     * > correctBracketing("<<>")
     * false
     * > correctBracketing("<><><<><>><>><<>")
     * false
     * > correctBracketing("<><><<><>><>>><>")
     * false
     */
    public static Boolean correctBracketing(String brackets) {
	// Starting with an empty stack.
        Stack<Character> stack = new Stack<Character>();
        // Iterating over the brackets string.
        for(int i=0; i<brackets.length(); i++) {
            char currentChar = brackets.charAt(i);
            // If the current character is an opening bracket, push it to the stack.
            if(currentChar == '<') {
                stack.push(currentChar);
            }
            // If the current character is a closing bracket, check if the stack is empty
            // and if the top of the stack is an opening bracket of the same type.
            else if (currentChar == '>') {
                if (stack.empty() || stack.pop() != '<') {
                    return false;
                }
            }
        }
        // If the stack is empty, all opening brackets have corresponding closing brackets
        // and we return true, otherwise return false.
        return stack.empty();
    }
}