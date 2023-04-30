import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID162{
	/**
	* 括号匹配检测.
	*/
	public boolean checkbracket(String str){
			Stack<Character> stack = new Stack<>();  // 创建一个栈
		for(int i=0; i<str.length(); i++){
			char c = str.charAt(i);
			if(c == '(' || c == '[' || c == '{'){  // 如果是左括号，则将其压入栈中
				stack.push(c);
			}else if(c == ')' || c == ']' || c == '}'){  // 如果是右括号
				if(stack.isEmpty()){  // 如果栈为空，则返回false
					return false;
				}
				char top = stack.pop();  // 否则弹出栈顶元素，并判断是否与当前右括号匹配
				if(top == '(' && c != ')'){
					return false;
				}else if(top == '[' && c != ']'){
					return false;
				}else if(top == '{' && c != '}'){
					return false;
				}
			}
		}
		return stack.isEmpty();  // 如果栈为空，则说明所有左括号已经匹配完毕，返回true，否则返回false
	}
}