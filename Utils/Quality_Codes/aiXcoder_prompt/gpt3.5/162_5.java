import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID162{
	/**
	* 括号匹配检测.
	*/
	public boolean checkbracket(String str){
			Stack<Character> stack = new Stack<Character>(); // 创建一个栈
		for (int i = 0; i < str.length(); i++) { // 遍历字符串
			char c = str.charAt(i); // 获取字符串中的一个字符
			if (c == '(' || c == '[' || c == '{') { // 如果是左括号，压入栈中
				stack.push(c);
			} else if (c == ')' || c == ']' || c == '}') { // 如果是右括号
				if (stack.isEmpty()) { // 如果栈为空，说明没有匹配的左括号与之匹配
					return false;
				}
				char left = stack.pop(); // 获取栈顶的左括号
				if (c == ')' && left != '(' || c == ']' && left != '[' || c == '}' && left != '{') {
					// 如果栈顶的括号与当前的右括号不匹配，则检测失败
					return false;
				}
			}
		}
		if (stack.isEmpty()) { // 如果栈已经空了，则说明括号全部匹配成功
			return true;
		} else { // 否则说明有括号没有匹配成功
			return false;
		}
	}
}
