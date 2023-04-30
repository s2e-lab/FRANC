import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID162{
	/**
	* 括号匹配检测.
	*/
	public boolean checkbracket(String str){
			// 创建一个栈来存储左括号
		Stack<Character> stack = new Stack<Character>();
		
		// 遍历字符串的每个字符
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			// 如果是左括号，则入栈
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			}
			// 如果是右括号，则判断是否与栈顶元素匹配
			else if (c == ')' || c == ']' || c == '}') {
				if (stack.isEmpty()) {
					// 栈为空，说明右括号不匹配
					return false;
				}
				char top = stack.pop(); // 取出栈顶元素
				if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
					// 右括号与栈顶元素不匹配
					return false;
				}
			}
		}
		
		// 遍历完字符串后，如果栈不为空，说明左括号多余
		if (!stack.isEmpty()) {
			return false;
		}
		
		// 字符串中括号匹配正确
		return true;
	}
}

/**
* 主函数.
*/