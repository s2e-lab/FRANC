import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID162{
	/**
	* 括号匹配检测.
	*/
	public boolean checkbracket(String str){
			// 使用栈来实现括号匹配的检测
		Stack<Character> stack = new Stack<>();
		for(char c : str.toCharArray()){
			if(c == '(' || c == '[' || c == '{'){
				stack.push(c); // 如果是左括号，入栈
			}else if(c == ')' || c == ']' || c == '}'){
				if(stack.isEmpty()){ // 如果栈为空，则说明缺少左括号
					return false;
				}
				char top = stack.pop(); // 取出栈顶元素
				if(c == ')' && top != '(' || c == ']' && top != '[' || c == '}' && top != '{'){ // 栈顶元素与该右括号不匹配
					return false;
				}
			}
		}
		return stack.isEmpty(); // 如果栈不为空，则说明缺少右括号；反之，则说明括号匹配成功。
	}
}

/**
* 测试代码.
*/