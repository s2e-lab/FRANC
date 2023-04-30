import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID162{
	/**
	* 括号匹配检测.
	*/
	public boolean checkbracket(String str){
			// 创建一个栈用于存放左括号
        Stack<Character> stack = new Stack<>();
        // 遍历字符串中的字符
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // 如果遇到左括号，将其入栈
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                // 如果遇到右括号，判断栈顶的左括号是否匹配
                if (stack.isEmpty()) {
                    // 栈为空，说明右括号没有匹配的左括号
                    return false;
                }
                char top = stack.peek();
                if ((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '[')) {
                    // 匹配成功，弹出栈顶
                    stack.pop();
                } else {
                    // 匹配失败
                    return false;
                }
            }
        }
        // 字符串遍历完毕后，如果栈为空，则说明所有左括号都有对应的右括号
        return stack.isEmpty();
    }
}
