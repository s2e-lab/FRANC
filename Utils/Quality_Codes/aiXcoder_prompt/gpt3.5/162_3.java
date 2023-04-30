import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID162{
	/**
	* 括号匹配检测.
	*/
	public boolean checkbracket(String str){
			Stack<Character> stack = new Stack<>(); // 创建一个栈用于存放左括号

for (int i = 0; i < str.length(); i++) {
    char c = str.charAt(i); // 取出字符串中的每个字符
    if (c == '(' || c == '[' || c == '{') { // 如果是左括号，将其压入栈中
        stack.push(c);
    } else if (c == ')' || c == ']' || c == '}') { // 如果是右括号
        if (stack.isEmpty()) { // 如果栈为空，说明没有左括号与之对应，返回false
            return false;
        } else if ((c == ')' && stack.peek() == '(') || (c == ']' && stack.peek() == '[') || (c == '}' && stack.peek() == '{')) { // 如果栈顶元素与当前右括号匹配，将栈顶元素弹出
            stack.pop();
        } else { // 否则说明左右括号不匹配，返回false
            return false;
        }
    }
}

return stack.isEmpty(); // 如果栈中还有元素，说明左括号多于右括号，返回false；否则说明左右括号匹配，返回true。
}
}