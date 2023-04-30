import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID162{
	/**
	* 括号匹配检测.
	*/
	public boolean checkbracket(String str){
			// Step 1: Check if string is empty or contains odd number of characters
		if(str == null || str.length() % 2 != 0){
			return false;
		}
		
		// Step 2: Create a stack to store opening brackets
		Stack<Character> stack = new Stack<Character>();
		
		// Step 3: Iterate through the string
		for(int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			
			// Step 4: If the character is an opening bracket, push it onto the stack
			if(c == '(' || c == '[' || c == '{'){
				stack.push(c);
			}
			// Step 5: If the character is a closing bracket
			else{
				// Step 6: If the stack is empty, the brackets are not balanced
				if(stack.isEmpty()){
					return false;
				}
				// Step 7: Peek at the top of the stack to check for matching opening bracket
				char top = stack.peek();
				if((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')){
					stack.pop(); // remove matching opening bracket from the stack
				}
				else{
					return false; // mismatched brackets
				}
			}
		}
		// Step 8: If the stack is empty, the brackets are balanced
		return stack.isEmpty();
	}
	
	/**
	* Main function to test checkbracket() method with sample input. 
	*/
	public static void main(String[] args){
		ID162 obj = new ID162();
		String str = "([])({})";
		if(obj.checkbracket(str)){
			System.out.println("The brackets in the string " + str + " are balanced.");
		}
		else{
			System.out.println("The brackets in the string " + str + " are not balanced.");
		}
	}
}