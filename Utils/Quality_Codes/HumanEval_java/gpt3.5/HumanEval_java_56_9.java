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
	// we can use a stack data structure to keep track of opening brackets.
// If a closing bracket is encountered and there is no opening bracket on top of the stack, return False.
// After iterating through the entire string, if the stack is not empty, return False as well.
// Otherwise, return True.

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < brackets.length(); i++) {
            char bracket = brackets.charAt(i);
            if (bracket == '<') {
                stack.push(bracket);
            } else if (bracket == '>') {
                if (stack.empty()) {
                    return false;
                }
                stack.pop();
            }
        }
        if (!stack.empty()) {
            return false;
        }
        return true;
    }
}