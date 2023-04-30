import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID162{
	/**
	* 括号匹配检测.
	*/
	public boolean checkbracket(String str){
			Stack<Character> stack = new Stack<Character>();
    
    for(int i = 0; i < str.length(); i++){
        char c = str.charAt(i);
        if(c == '(' || c == '[' || c == '{'){
            stack.push(c);
        }
        else if(c == ')'){
            if(stack.isEmpty() || stack.pop() != '('){
                return false;
            }
        }
        else if(c == ']'){
            if(stack.isEmpty() || stack.pop() != '['){
                return false;
            }
        }
        else if(c == '}'){
            if(stack.isEmpty() || stack.pop() != '{'){
                return false;
            }
        }
    }
    
    return stack.isEmpty();
}
	
	
	public static void main(String[] args){
		ID162 id = new ID162();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		boolean result = id.checkbracket(str);
		
		if(result){
			System.out.println("The brackets are balanced.");
		}else{
			System.out.println("The brackets are not balanced.");
		}
	}
}
