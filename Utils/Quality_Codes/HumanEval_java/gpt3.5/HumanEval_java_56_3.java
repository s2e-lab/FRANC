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
	// We can use a stack to keep an account of opening brackets and closing brackets. Everytime we encounter an opening
// bracket we push it onto the stack, and for every closing bracket we pop one bracket from the stack.
// If at any point we have a closing bracket but there is no opening bracket in the stack then we return false as it means that
// there is a closing bracket without any opening bracket.

        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<brackets.length();i++){
            char current = brackets.charAt(i);
            if(current == '<'){
                stack.push(current);
            }
            if(current == '>'){
                if(stack.empty() || stack.peek()!= '<'){
                    return false;
                }
                else {
                    stack.pop();
                }
            }
        }
        return stack.empty(); // If stack is empty then it means that we have encountered every opening bracket
                              // and also their corresponding closing bracket.
}
}