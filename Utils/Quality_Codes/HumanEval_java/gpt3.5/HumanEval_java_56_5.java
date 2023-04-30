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
	// We can use a stack to keep track of opening brackets and their corresponding closing brackets.
// Every time we encounter an opening bracket, we push it onto the stack.
// Every time we encounter a closing bracket, we check if the top of the stack contains the matching opening bracket.
// If it does, we pop the opening bracket from the stack, otherwise we return False.

        Stack<Character> stack = new Stack<Character>();
        
        for(int i=0; i<brackets.length(); i++){
            if(brackets.charAt(i) == '<'){
                stack.push('<');
            }
            else if(brackets.charAt(i) == '>'){
                if(stack.isEmpty()){
                    return false;  // no matching opening bracket
                }
                stack.pop();   // pop the opening bracket from stack
            }
        }
        
        // return True if all opening brackets have been matched
        return stack.isEmpty();
    }
}