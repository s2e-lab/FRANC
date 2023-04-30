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
	// First, we need to check if the length of the brackets string is odd, as an odd length string
// cannot have correct bracketing. If it is even, we proceed to check the bracketing.

        if (brackets.length() % 2 == 1) {
            return false;
        }

// Next, we create a stack to keep track of the opening brackets.

        Stack<Character> stack = new Stack<>();

// We iterate through the characters of the string.

        for (char c : brackets.toCharArray()) {
            if (c == '<') {
                stack.push(c); // If we encounter an opening bracket, we push it onto the stack.
            } else {
                if (stack.isEmpty()) {
                    return false; // If we encounter a closing bracket and the stack is empty, we know there is no corresponding opening bracket.
                } else {
                    stack.pop(); // If we encounter a closing bracket and there is a corresponding opening bracket, we pop it from the stack.
                }
            }
        }

// After iterating through the characters, if there are still opening brackets left on the stack, the bracketing is incorrect.

        if (!stack.isEmpty()) {
            return false;
        }

        return true; // If all checks pass, the bracketing is correct.
    }
}