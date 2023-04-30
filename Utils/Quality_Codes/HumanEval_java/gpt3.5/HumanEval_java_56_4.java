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
	// We can solve this problem using stack data structure. First, we will create an empty stack.
// We will loop through the characters of the input string and do the following:
// - If the character is '<', we will push it onto the stack.
// - If the character is '>', we will check if the stack is empty. If it is, return false,
//   otherwise, we will pop the top character from the stack.
// After the loop, if the stack is empty, return true, otherwise, return false.

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < brackets.length(); i++) {
            char c = brackets.charAt(i);

            if (c == '<') {
                stack.push(c);
            } else if (c == '>') {
                if (stack.empty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }

        if (stack.empty()) {
            return true;
        } else {
            return false;
        }
    }
}