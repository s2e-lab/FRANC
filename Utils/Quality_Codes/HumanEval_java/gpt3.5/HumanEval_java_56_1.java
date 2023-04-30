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
	//Implementation of the correctBracketing function in Java
        Stack<Character> stack = new Stack<Character>(); //creating an empty stack
        for (int i = 0; i < brackets.length(); i++) { //iterating through each character of the brackets string
            char curr = brackets.charAt(i); //getting the current character
            if (curr == '<') { //if it is an opening bracket
                stack.push(curr); //push it onto the stack
            } else if (curr == '>') { //if it is a closing bracket
                if (stack.empty()) { //if the stack is empty, then there is no opening bracket to match with this closing bracket
                    return false;
                } else {
                    stack.pop(); //remove the corresponding opening bracket from the stack
                }
            }
        }
        return stack.empty(); //if the stack is empty, then all opening brackets have a corresponding closing bracket; otherwise, there are some opening brackets without a corresponding closing bracket
    }
}